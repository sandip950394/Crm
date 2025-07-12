package com.customerManagement.crm.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.customerManagement.crm.dto.UserDto;
import com.customerManagement.crm.entity.Users;

import jakarta.validation.Valid;

public interface IUserService {

	void createUser(UserDto dto);
	
	void createUserWithDocument(UserDto dto,MultipartFile document);
	
	UserDto fetchUser(Integer userId);
	
	List<UserDto> fetchAllUser();

	boolean updateUser(@Valid UserDto userDto);

	boolean deleteUser(Integer userId);

	Page<Users> fetchAllUserWithPagination(int page, int size, String sortBy);

}
