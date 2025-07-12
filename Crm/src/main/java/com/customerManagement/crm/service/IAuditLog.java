package com.customerManagement.crm.service;

import java.util.List;

import com.customerManagement.crm.entity.AuditLog;

public interface IAuditLog {
	
	List<AuditLog> fetchAuditLog();

}
