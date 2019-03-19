package com.cognizant.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.VendorLogin;

public class VendorLoginDAOImpl implements VendorLoginDAO{
	
	@Autowired 
	private SessionFactory sessionFactory;
	public boolean doLogin(VendorLogin vendorLogin) {
	
		

			Session session=sessionFactory.openSession();
			Query query=
					session.createQuery("select o from VendorLogin o where o.userName=:username and o.password=:password");
			query.setParameter("username", vendorLogin.getUserName());
			query.setParameter("password", vendorLogin.getPassword());
			List<VendorLogin> vendorList=query.list();
			System.out.println(vendorList);
			if(vendorList.isEmpty())
				return false;
			else
			return true;
		}
}
