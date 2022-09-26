package com.adiverse.erp.controller;

//import java.util.ArrayList;

//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.adiverse.erp.model.Nirfutility;
import com.adiverse.erp.model.nirf;
import com.adiverse.erp.service.NirfService;
import com.lowagie.text.DocumentException;
import com.adiverse.erp.payload.MessageResponse;



    @RestController
	@CrossOrigin(origins = "*")
	@RequestMapping("/api/v1")
public class Nirfcontroller {

		//private final Logger log = LoggerFactory.getLogger(this.getClass());
		
		
	    @Autowired
	    private NirfService nirfService;
	    
	  
	    @PostMapping(value = "/nirfdata")
	    public ResponseEntity<MessageResponse> Extended(@RequestBody nirf extendedProfile)
		{
	    	
	    	
	    	 String message = "";
	    	    try {
	    	    	nirfService.extendedInfo(extendedProfile);

	    	      message = "NIRF Data uploaded successfully:";
	    	      return ResponseEntity.status(HttpStatus.OK).body(new MessageResponse(message));
	    	    } catch (Exception e) {
	    	      message = "Could not upload the NIRF Data: ";
	    	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(message));
	    	    }
	    	

		}
	 
	    @GetMapping("/getallnirfdata")
	    public ResponseEntity<List<nirf>> getExtendedtotalData() {
	      List<nirf> extended = nirfService.getAllExtendedData( );
	        

	      return ResponseEntity.status(HttpStatus.OK).body(extended);
	    }
	    
	    @GetMapping("/pdf")
		public void generatePdf(HttpServletResponse response) throws DocumentException, IOException {
			
			response.setContentType("application/pdf");
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
			String currentDateTime = dateFormat.format(new Date());
			String headerkey = "Content-Disposition";
			String headervalue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
			response.setHeader(headerkey, headervalue);
			
			List<nirf> valueList = nirfService.getAllExtendedData();
			Nirfutility generator = new Nirfutility();
		generator.generate(response);
		}

	}

