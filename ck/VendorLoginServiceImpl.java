package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.VendorLoginDAO;

import com.cognizant.entity.VendorLogin;


@Service("VendorLoginServiceImpl")
public class VendorLoginServiceImpl implements VendorLoginService{
	@Autowired
	private  VendorLoginDAO vendorLoginDAO;
	 public boolean doLogin(VendorLogin vendorLogin) {
			
			return vendorLoginDAO.doLogin(vendorLogin);
		}

	}


