package com.customerManagement.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerManagement.crm.entity.AuditLog;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long>{

}
