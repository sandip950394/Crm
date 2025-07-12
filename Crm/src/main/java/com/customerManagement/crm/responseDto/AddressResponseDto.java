package com.customerManagement.crm.responseDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddressResponseDto {
	
	private int addressId;
}
