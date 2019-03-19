package com.cognizant.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cognizant.entity.Admin;
import com.cognizant.entity.VendorLogin;
import com.cognizant.service.VendorLoginService;


@Component("VendorValidator")
public class VendorValidator implements Validator{
	@Autowired
	private VendorLoginService vendorService;

	
	public boolean supports(Class<?> arg0) {
		return arg0.equals(VendorLogin.class);
	}

	
	public void validate(Object arg0, Errors arg1) {
		VendorLogin vendorLogin=(VendorLogin)arg0;
		boolean vendorAuth=vendorService.doLogin(vendorLogin);
		System.out.println(vendorAuth);
		if(!vendorAuth){
			arg1.rejectValue("userName", "com.cognizant.entity.Admin.userName.invalid");
		}
		
	}
}
