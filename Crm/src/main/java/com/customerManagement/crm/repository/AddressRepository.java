package com.customerManagement.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerManagement.crm.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
