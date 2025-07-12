package com.customerManagement.crm.utils;

import java.io.IOException;
import java.util.List;

import com.customerManagement.crm.dto.UserDto;
import com.customerManagement.crm.entity.AuditLog;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

public class PdfReportGenerator {

	public static void generateCustomerPdf(List<UserDto> customers, HttpServletResponse response) throws IOException {
		Document document = new Document(PageSize.A4);
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=customers.pdf");

		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();

		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(18);
		Paragraph title = new Paragraph("Customer List", font);
		title.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(title);
		document.add(Chunk.NEWLINE);

		for (UserDto customer : customers) {
			document.add(new Paragraph("ID: " + customer.getUserId()));
			document.add(new Paragraph("Name: " + customer.getName()));
			document.add(new Paragraph("Email: " + customer.getEmail()));
			document.add(new Paragraph("Phone: " + customer.getMobileNumber()));
			document.add(new Paragraph("---------------"));
		}

		document.close();
	}

	public static void generateAuditLogPdf(List<AuditLog> auditLog, HttpServletResponse response) throws IOException {
		Document document = new Document(PageSize.A4);
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=customers.pdf");

		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();

		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(18);
		Paragraph title = new Paragraph("Customer List", font);
		title.setAlignment(Paragraph.ALIGN_CENTER);
		document.add(title);
		document.add(Chunk.NEWLINE);

		for (AuditLog audit : auditLog) {
			document.add(new Paragraph("username: " + audit.getUsername()));
			document.add(new Paragraph("action: " + audit.getAction()));
			document.add(new Paragraph("method: " + audit.getMethod()));
			document.add(new Paragraph("timestamp: " + audit.getTimestamp()));
			document.add(new Paragraph("---------------"));
		}

		document.close();
	}

}
