package com.adiverse.erp.model;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class Nirfutility {
	
	public void generate(HttpServletResponse response) throws DocumentException, IOException {
		
		
        Document document= new Document(PageSize.A3);
		
		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();

		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(16);

		Font fontt = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(12);

		Font fonttt = FontFactory.getFont(FontFactory.HELVETICA);
		font.setSize(12);
		
		Font font1= FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font1.setSize(8);
	
		Font font2= FontFactory.getFont(FontFactory.HELVETICA);
		font2.setSize(8);
		

		Paragraph paragraph1= new Paragraph("National Institutional Ranking Framework"
				+""
				+""
				, font);
		
		
		Paragraph paragraph2 = new Paragraph("Ministry of Education"
				+""
				+""
				+"", fontt);
		
		Paragraph paragraph3 = new Paragraph("Government of India "
				+""
				+""
				, fontt);
		
		
		Paragraph paragraph4 = new Paragraph("Welcome to Data Capturing System: OVERALL"
				+""
				+""
				+""				, fontt);
		
		paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
		paragraph2.setAlignment(Paragraph.ALIGN_CENTER);
		paragraph3.setAlignment(Paragraph.ALIGN_CENTER);
		paragraph4.setAlignment(Paragraph.ALIGN_CENTER);
		
		Paragraph paragraph5 = new Paragraph("Submitted Institute Data for NIRF'2022'"
				+""
				+""
				, font1);
		
		
		Paragraph paragraph6 = new Paragraph("Institute Name: Finolex Academy of Management and Technology [IR-O-C-34021]"
				, font2);
		
		Paragraph paragraphline= new Paragraph("___________________________________________________________________________________________________________________\r\n"
				+""
				+""
				+""
				+""
				+""
				+""
				, fontt);
		
		Paragraph paragraph7 = new Paragraph("Sanctioned (Approved) Intake\r\n"
				, font1);
		
		paragraph5.setAlignment(Paragraph.ALIGN_LEFT);
		paragraph6.setAlignment(Paragraph.ALIGN_LEFT);
		paragraph7.setAlignment(Paragraph.ALIGN_LEFT);
		paragraphline.setAlignment(Paragraph.ALIGN_LEFT);
		
		document.add(paragraph1);
		document.add(paragraph2);
		document.add(paragraph3);
		document.add(paragraph4);
		document.add(paragraph5);
		document.add(paragraph6);
		document.add(paragraphline);
		document.add(paragraph7);
		
		PdfPTable table1= new PdfPTable(7);
		table1.setWidthPercentage(100f);
		table1.setWidths(new int[] {3, 3, 3, 3, 3, 3, 3});
		table1.setSpacingBefore(3);
		
		 PdfPCell cell = new PdfPCell(); 
		 cell.setPadding(5);
	        
         cell.setPhrase(new Phrase("Academic Year",font1));
         table1.addCell(cell); 
         cell.setPhrase(new Phrase("   ", font1));
         table1.addCell(cell); 
		  cell.setPhrase(new Phrase("   ",font1)); 
		  table1.addCell(cell); 
		  cell.setPhrase(new Phrase("   ", font1));
		  table1.addCell(cell);
		  cell.setPhrase(new Phrase("   ", font1));
		  table1.addCell(cell);
		  cell.setPhrase(new Phrase("   ", font1));
		  table1.addCell(cell);
		  cell.setPhrase(new Phrase("   ", font1));
		  table1.addCell(cell); 
		  cell.setPhrase(new Phrase("   ",font1));
	      table1.addCell(cell); 
	      cell.setPhrase(new Phrase("   ", font1));
	      table1.addCell(cell); 
		cell.setPhrase(new Phrase("   ",font1)); 
		table1.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font1));
		table1.addCell(cell);
		cell.setPhrase(new Phrase("   ", font1));
		table1.addCell(cell);
		cell.setPhrase(new Phrase("   ", font1));
		table1.addCell(cell);
		cell.setPhrase(new Phrase("   ", font1));
		table1.addCell(cell);
		
		document.add(table1);
		table1.setSpacingAfter(10f);
		
		Paragraph paragraph8 = new Paragraph("Total Actual Student Strength (Program(s) Offered by Your Institution)"
				, font1);
		paragraph8.setAlignment(Paragraph.ALIGN_LEFT);
		document.add(paragraph8);
		
		PdfPTable table2= new PdfPTable(13);
		table2.setWidthPercentage(100f);
		table2.setWidths(new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3});
		table2.setSpacingBefore(3);
	
	        
         cell.setPhrase(new Phrase("(All programs\r\n"
         		+ "of all years)",font1));
         table2.addCell(cell); 
         cell.setPhrase(new Phrase("No. of Male\r\n"
         		+ "Students", font1));
         table2.addCell(cell); 
		  cell.setPhrase(new Phrase("No. of Female\r\n"
		  		+ "Students",font1)); 
		  table2.addCell(cell); 
		  cell.setPhrase(new Phrase("Total Students", font1));
		  table2.addCell(cell);
		  cell.setPhrase(new Phrase("Within State\r\n"
		  		+ "(Including male\r\n"
		  		+ "& female)", font1));
		  table2.addCell(cell);
		  cell.setPhrase(new Phrase("Outside State\r\n"
		  		+ "(Including male\r\n"
		  		+ "& female)", font1));
		  table2.addCell(cell);
		  cell.setPhrase(new Phrase("Outside\r\n"
		  		+ "Country\r\n"
		  		+ "(Including male\r\n"
		  		+ "& female)", font1));
		  table2.addCell(cell);
		  cell.setPhrase(new Phrase("Economically\r\n"
		  		+ "Backward\r\n"
		  		+ "(Including male\r\n"
		  		+ "& female)",font1));
		  table2.addCell(cell); 
	      cell.setPhrase(new Phrase("Socially\r\n"
	      		+ "Challenged\r\n"
	      		+ "(SC+ST+OBC\r\n"
	      		+ "Including male\r\n"
	      		+ "& female)", font1));
	      table2.addCell(cell); 
		cell.setPhrase(new Phrase("No. of students\r\n"
				+ "receiving full\r\n"
				+ "tuition fee\r\n"
				+ "reimbursement\r\n"
				+ "from the State\r\n"
				+ "and Central\r\n"
				+ "Government",font1)); 
		table2.addCell(cell); 
	    cell.setPhrase(new Phrase("No. of students\r\n"
	    		+ "receiving full\r\n"
	    		+ "tuition fee\r\n"
	    		+ "reimbursement\r\n"
	    		+ "from Institution\r\n"
	    		+ "Funds", font1));
	    table2.addCell(cell);
		cell.setPhrase(new Phrase("No. of students\r\n"
				+ "receiving full\r\n"
				+ "tuition fee\r\n"
				+ "reimbursement\r\n"
				+ "from the Private\r\n"
				+ "Bodies", font1));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("No. of students\r\n"
				+ "who are not\r\n"
				+ "receiving full\r\n"
				+ "tuition fee\r\n"
				+ "reimbursement", font1));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ",font2));
		table2.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font2));
	    table2.addCell(cell); 
		cell.setPhrase(new Phrase("   ",font2)); 
		table2.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font2));
	    table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell); 
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table2.addCell(cell);
		
		document.add(table2);
		table2.setSpacingAfter(30f);
		
		
		Paragraph paragraph9 = new Paragraph("Placement & Higher Studies\r\n"
				+""
				+""
				+""
				+""
				+""
				, font1);
		paragraph9.setAlignment(Paragraph.ALIGN_LEFT);
		document.add(paragraph9);
		
		Paragraph paragraph10 = new Paragraph("UG [4 Years Program(s)]: Placement & higher studies for previous 3 years\r\n"
		, font1);
		paragraph10.setAlignment(Paragraph.ALIGN_LEFT);
		document.add(paragraph10);
		
		PdfPTable table3= new PdfPTable(10);
		table3.setWidthPercentage(100f);
		table3.setWidths(new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3});
		table3.setSpacingBefore(3);
	
	        
         cell.setPhrase(new Phrase("Academic Year",font1));
         table3.addCell(cell); 
         cell.setPhrase(new Phrase("No. of first year\r\n"
         		+ "students intake in the\r\n"
         		+ "year", font1));
         table3.addCell(cell); 
		  cell.setPhrase(new Phrase("No. of first year\r\n"
		  		+ "students admitted in\r\n"
		  		+ "the year",font1)); 
		  table3.addCell(cell); 
		  cell.setPhrase(new Phrase("Academic Year", font1));
		  table3.addCell(cell);
		  cell.setPhrase(new Phrase("No. of students\r\n"
		  		+ "admitted through\r\n"
		  		+ "Lateral entry", font1));
		  table3.addCell(cell);
		  cell.setPhrase(new Phrase("Academic Year", font1));
		  table3.addCell(cell);
		  cell.setPhrase(new Phrase("No. of students\r\n"
		  		+ "graduating in\r\n"
		  		+ "minimum stipulated\r\n"
		  		+ "time",font1));
		  table3.addCell(cell); 
	      cell.setPhrase(new Phrase("No. of students\r\n"
	      		+ "placed", font1));
	      table3.addCell(cell); 
		cell.setPhrase(new Phrase("Median salary of\r\n"
				+ "placed\r\n"
				+ "graduates(Amount in\r\n"
				+ "Rs.)",font1)); 
		table3.addCell(cell); 
		cell.setPhrase(new Phrase("No. of students\r\n"
				+ "selected for Higher\r\n"
				+ "Studies",font1)); 
		table3.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table3.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table3.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table3.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table3.addCell(cell);
		cell.setPhrase(new Phrase("   ",font2));
		table3.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font2));
	    table3.addCell(cell); 
		cell.setPhrase(new Phrase("   ",font2)); 
		table3.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font2));
	    table3.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table3.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table3.addCell(cell);
		
		document.add(table3);
		table3.setSpacingAfter(30f);
		
		Paragraph paragraph11 = new Paragraph("PG [2 Years Program(s)]: Placement & higher studies for previous 3 years"
				, font1);
		paragraph11.setAlignment(Paragraph.ALIGN_LEFT);
		document.add(paragraph11);
		
		PdfPTable table4= new PdfPTable(8);
		table4.setWidthPercentage(100f);
		table4.setWidths(new int[] {3, 3, 3, 3, 3, 3, 3, 3});
		table4.setSpacingBefore(3);
	
	        
         cell.setPhrase(new Phrase("Academic Year",font1));
         table4.addCell(cell); 
         cell.setPhrase(new Phrase("No. of first year\r\n"
         		+ "students intake in the\r\n"
         		+ "year", font1));
         table4.addCell(cell); 
		  cell.setPhrase(new Phrase("No. of first year\r\n"
		  		+ "students admitted in\r\n"
		  		+ "the year",font1)); 
		  table4.addCell(cell); 
		  cell.setPhrase(new Phrase("Academic Year", font1));
		  table4.addCell(cell);
		  cell.setPhrase(new Phrase("No. of students graduating in minimum\r\n"
		  		+ "stipulated time", font1));
		  table4.addCell(cell);
	      cell.setPhrase(new Phrase("No. of students\r\n"
	      		+ "placed", font1));
	      table4.addCell(cell); 
		cell.setPhrase(new Phrase("Median salary of\r\n"
				+ "placed\r\n"
				+ "graduates(Amount in\r\n"
				+ "Rs.)",font1)); 
		  table4.addCell(cell);
		cell.setPhrase(new Phrase("No. of students\r\n"
				+ "selected for Higher\r\n"
				+ "Studies",font1)); 
		table4.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table4.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table4.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table4.addCell(cell);
		cell.setPhrase(new Phrase("   ", font2));
		table4.addCell(cell);
		cell.setPhrase(new Phrase("   ",font2));
		table4.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font2));
	    table4.addCell(cell); 
		cell.setPhrase(new Phrase("   ",font2)); 
		table4.addCell(cell); 
	    cell.setPhrase(new Phrase("   ", font2));
	    table4.addCell(cell);
		
		document.add(table4);
		table4.setSpacingAfter(30f);
		
		Paragraph paragraph12 = new Paragraph("PG [3 Years Program(s)]: Placement & higher studies for previous 3 years\r\n"
				, font1);
		paragraph12.setAlignment(Paragraph.ALIGN_LEFT);
				document.add(paragraph12);
				
				PdfPTable table5= new PdfPTable(10);
				table5.setWidthPercentage(100f);
				table5.setWidths(new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3});
				table5.setSpacingBefore(3);
			
			        
		         cell.setPhrase(new Phrase("Academic Year",font1));
		         table5.addCell(cell); 
		         cell.setPhrase(new Phrase("No. of first year\r\n"
		         		+ "students intake in the\r\n"
		         		+ "year", font1));
		         table5.addCell(cell); 
				  cell.setPhrase(new Phrase("No. of first year\r\n"
				  		+ "students admitted in\r\n"
				  		+ "the year",font1)); 
				  table5.addCell(cell); 
				  cell.setPhrase(new Phrase("Academic Year", font1));
				  table5.addCell(cell);
				  cell.setPhrase(new Phrase("No. of students\r\n"
				  		+ "admitted through\r\n"
				  		+ "Lateral entry", font1));
				  table5.addCell(cell);
				  cell.setPhrase(new Phrase("Academic Year", font1));
				  table5.addCell(cell);
				  cell.setPhrase(new Phrase("No. of students\r\n"
				  		+ "graduating in\r\n"
				  		+ "minimum stipulated\r\n"
				  		+ "time",font1));
				  table5.addCell(cell); 
			      cell.setPhrase(new Phrase("No. of students\r\n"
			      		+ "placed", font1));
			      table5.addCell(cell); 
				cell.setPhrase(new Phrase("Median salary of\r\n"
						+ "placed\r\n"
						+ "graduates(Amount in\r\n"
						+ "Rs.)",font1)); 
				table5.addCell(cell); 
				cell.setPhrase(new Phrase("No. of students\r\n"
						+ "selected for Higher\r\n"
						+ "Studies",font1)); 
				table5.addCell(cell);
				cell.setPhrase(new Phrase("   ", font2));
				table5.addCell(cell);
				cell.setPhrase(new Phrase("   ", font2));
				table5.addCell(cell);
				cell.setPhrase(new Phrase("   ", font2));
				table5.addCell(cell);
				cell.setPhrase(new Phrase("   ", font2));
				table5.addCell(cell);
				cell.setPhrase(new Phrase("   ",font2));
				table5.addCell(cell); 
			    cell.setPhrase(new Phrase("   ", font2));
			    table5.addCell(cell); 
				cell.setPhrase(new Phrase("   ",font2)); 
				table5.addCell(cell); 
			    cell.setPhrase(new Phrase("   ", font2));
			    table5.addCell(cell);
				cell.setPhrase(new Phrase("   ", font2));
				table5.addCell(cell);
				cell.setPhrase(new Phrase("   ", font2));
				table5.addCell(cell);
				
				document.add(table5);
				table5.setSpacingAfter(30f);
				
				Paragraph paragraph13 = new Paragraph("Ph.D Student Details\r\n"
						, font1);
				paragraph13.setAlignment(Paragraph.ALIGN_LEFT);
						document.add(paragraph13);
						
				PdfPTable table01= new PdfPTable(1);
				table01.setWidthPercentage(100f);
				table01.setSpacingBefore(5);
				  PdfPCell cell01 = new PdfPCell(new Paragraph("        Ph.D (Student pursuing doctoral program till 2020-21 Students admitted in the academic year 2020-21 should not be entered here.)\r\n"
						  +"", font1));
				  table01.addCell(cell01); 
				  
				  PdfPTable table6= new PdfPTable(2);
				  table6.setWidthPercentage(100f);
				  table6.setWidths(new int[] {3, 3});
				  table6.setSpacingBefore(5);
					
				    
				cell.setPhrase(new Phrase("    "));
				table6.addCell(cell);
				cell.setPhrase(new Phrase(" Total Students ", font1));
				table6.addCell(cell);
				cell.setPhrase(new Phrase(" Full Time  ", font2));
				table6.addCell(cell);
				cell.setPhrase(new Phrase("    ", font2));
				table6.addCell(cell);
				cell.setPhrase(new Phrase(" Part Time  ", font2));
				table6.addCell(cell);
				cell.setPhrase(new Phrase("    ", font2));
				table6.addCell(cell);
									
								table01.addCell(table6);   
								 table6.setSpacingAfter(5);
								
					PdfPCell cell02 = new PdfPCell(new Paragraph("          No. of Ph.D students graduated (including Integrated Ph.D)\r\n"
										  +"", font1));
								  table01.addCell(cell02); 
								  
								  PdfPTable table7= new PdfPTable(4);
								  table7.setWidthPercentage(100f);
								  table7.setWidths(new int[] {3, 3, 3, 3});
								  table7.setSpacingBefore(5);
									
								    
								cell.setPhrase(new Phrase("    "));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    ", font1));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    ", font1));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    ", font1));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("  Full Time  ", font2));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    "));
								table7.addCell(cell);				
								cell.setPhrase(new Phrase("    "));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("   "));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("  Part Time  ", font2));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    "));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    "));
								table7.addCell(cell);
								cell.setPhrase(new Phrase("    "));
								table7.addCell(cell);
												table01.addCell(table7);  
												 table7.setSpacingAfter(5);
											
														 
											PdfPCell cell03 = new PdfPCell(new Paragraph("        PG (Student pursuing MD/MS/DNB program till 2020-21 Students admitted in the academic year 2021 - 22 should not be entered here)\r\n"
													  +"", font1));
											  table01.addCell(cell03); 
											  
											  PdfPTable table8= new PdfPTable(2);
											  table8.setWidthPercentage(100f);
											  table8.setWidths(new int[] {3, 3});
											  table8.setSpacingBefore(5);
												cell.setPhrase(new Phrase(" Number of students pursuing PG (MD/MS/DNB) program  ",font1));
												table8.addCell(cell);
												cell.setPhrase(new Phrase("    ", font2));
												table8.addCell(cell);
												table01.addCell(table8); 
												 table8.setSpacingAfter(5);
												
												PdfPCell cell04 = new PdfPCell(new Paragraph("        No. of students Graduating in PG (MD/MS/DNB) program\r\n"
														  +"", font1));
												  table01.addCell(cell04); 
											  
											  PdfPTable table9= new PdfPTable(3);
											  table9.setWidthPercentage(100f);
											  table9.setWidths(new int[] {3, 3, 3});
											  table9.setSpacingBefore(5);
												
											    
											cell.setPhrase(new Phrase("    ", font1));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    ", font1));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    ", font1));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    "));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    "));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    "));
											table9.addCell(cell);				
											cell.setPhrase(new Phrase("    "));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    "));
											table9.addCell(cell);
											cell.setPhrase(new Phrase("    "));
											table9.addCell(cell);
											
											table01.addCell(table9);
											document.add(table01);
											Paragraph paragraph14 = new Paragraph("Online Education\r\n"
													, font1);
											paragraph14.setAlignment(Paragraph.ALIGN_LEFT);
													document.add(paragraph14);
													
											PdfPTable table10= new PdfPTable(2);
											table10.setWidthPercentage(100f);
											table10.setWidths(new int[] {3, 3});
											table10.setSpacingBefore(5);
											
											cell.setPhrase(new Phrase("1. Does all programs/courses were completed on time.",font1));
											table10.addCell(cell); 
									         cell.setPhrase(new Phrase("   ", font2));
									         table10.addCell(cell); 
											  cell.setPhrase(new Phrase("2. Measures taken to complete the syllabus of courses and programs.   ",font1)); 
											  table10.addCell(cell); 
											  cell.setPhrase(new Phrase("   ", font2));
											  table10.addCell(cell);
											  cell.setPhrase(new Phrase("3. The period of delay in completion of syllabus (in months).  ", font1));
											  table10.addCell(cell);
											  cell.setPhrase(new Phrase("   ", font2));
											  table10.addCell(cell);
											  cell.setPhrase(new Phrase("4. The period of delay in conducting exams (in months).   ", font1));
											  table10.addCell(cell); 
											  cell.setPhrase(new Phrase("   ",font2));
											  table10.addCell(cell); 
											  document.add(table10);
												
												PdfPTable table11= new PdfPTable(4);
												table11.setWidthPercentage(100f);
												table11.setWidths(new int[] {3, 3, 3, 3});
												
												
												cell.setPhrase(new Phrase("Portal Name",font1));
												table11.addCell(cell); 
										         cell.setPhrase(new Phrase("No. of students offered online courses which have credit\r\n"
										         		+ "transferred to transcript ", font1));
										         table11.addCell(cell); 
												  cell.setPhrase(new Phrase("Total no. of online courses which have credit transferred\r\n"
												  		+ "to the transcript   ",font1)); 
												  table11.addCell(cell); 
												  cell.setPhrase(new Phrase("Total no. of credits transferred to transcript   ", font1));
												  table11.addCell(cell);
												  cell.setPhrase(new Phrase("   ", font2));
												  table11.addCell(cell);
												  cell.setPhrase(new Phrase("   ", font2));
												  table11.addCell(cell);
												  cell.setPhrase(new Phrase("   ", font2));
												  table11.addCell(cell); 
												  cell.setPhrase(new Phrase("   ",font2));
												  table11.addCell(cell); 
												  document.add(table11);
											  
												  PdfPTable table12= new PdfPTable(2);
												  table12.setWidthPercentage(100f);
												  table12.setWidths(new int[] {3, 3});
													
											  
										      cell.setPhrase(new Phrase("5. No. of courses developed and available online on Swayam platform by your institution faculty  ", font1));
										      table12.addCell(cell); 
											cell.setPhrase(new Phrase("   ",font1)); 
											table12.addCell(cell); 
											document.add(table12);
											table12.setSpacingAfter(5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
												
		
		document.close();	
	}

}
