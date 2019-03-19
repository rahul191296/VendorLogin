package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ADMINLOGIN")

public class VendorLogin {
	
		@Id
		@Column(name="username")
		private String userName;
		@Column(name="password")
		private String password;
		
		public VendorLogin(){}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
}

