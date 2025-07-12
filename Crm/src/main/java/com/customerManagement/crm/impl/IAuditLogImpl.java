package com.customerManagement.crm.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerManagement.crm.entity.AuditLog;
import com.customerManagement.crm.repository.AuditLogRepository;
import com.customerManagement.crm.service.IAuditLog;

import lombok.Data;

@Service
@Data
public class IAuditLogImpl implements IAuditLog{
	
	@Autowired
	private AuditLogRepository auditLogRepo;

	@Override
	public List<AuditLog> fetchAuditLog() {
		
		List<AuditLog> listAudit=	auditLogRepo.findAll();
		return listAudit;
		
	}

}
