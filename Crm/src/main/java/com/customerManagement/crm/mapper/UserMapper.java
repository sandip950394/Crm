package com.customerManagement.crm.mapper;

import com.customerManagement.crm.dto.AddressDto;
import com.customerManagement.crm.dto.RolesDto;
import com.customerManagement.crm.dto.UserDto;
import com.customerManagement.crm.entity.Address;
import com.customerManagement.crm.entity.Roles;
import com.customerManagement.crm.entity.Users;

public class UserMapper {

	public static UserDto toUserDto(Users users) {
		UserDto userdto = new UserDto();
		userdto.setName(users.getName());
		userdto.setUserId(users.getUserId());
		userdto.setEmail(users.getEmail());
		userdto.setMobileNumber(users.getMobileNumber());
		userdto.setRolesDto(UserMapper.toRolesDto(users.getRoles()));
		userdto.setAddressDto(UserMapper.toAddressDto(users.getAddress()));
		return userdto;
	}

	public static AddressDto toAddressDto(Address address) {
		AddressDto addressDto = new AddressDto();
		addressDto.setAddress1(address.getAddress1());
		addressDto.setAddress2(address.getAddress2());
		addressDto.setAddressId(address.getAddressId());
		addressDto.setCity(address.getCity());
		addressDto.setState(address.getState());
		addressDto.setZipCode(address.getZipCode());
		return addressDto;
	}

	public static RolesDto toRolesDto(Roles roles) {
		RolesDto rolesDto = new RolesDto();
		rolesDto.setRoleId(roles.getRoleId());
		rolesDto.setRoleName(roles.getRoleName());
		return rolesDto;
	}

	public static Users toUsersEntity(UserDto userDto) {
		Users user = new Users();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setRoles(UserMapper.toRolesEntity(userDto.getRolesDto()));
		user.setAddress(UserMapper.toAddressEntity(userDto.getAddressDto()));
		user.setConfirmEmail(userDto.getEmail());
		user.setConfirmPwd(userDto.getConfirmPwd());

		return user;

	}

	public static Address toAddressEntity(AddressDto addressDto) {
		Address address = new Address();
		address.setAddress1(addressDto.getAddress1());
		address.setAddress2(addressDto.getAddress2());
		address.setCity(addressDto.getCity());
		address.setState(addressDto.getState());
		address.setZipCode(addressDto.getZipCode());

		return address;

	}

	public static Roles toRolesEntity(RolesDto rolesDto) {
		Roles roles = new Roles();
		roles.setRoleName(rolesDto.getRoleName());
		return roles;

	}

}
