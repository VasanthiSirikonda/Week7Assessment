package com.infinite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

public class Login {
	@Entity
	@Table(name = "login")
	public class Customer {

		
		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@NotNull
		@Column(name = "username")
		private String username;
		
		@NotNull
		@Column(name = "password")
		private String password;
		
		public Customer()
		{
			
		}
		public Customer(int id, String username, String password,Login l) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

	}
		
}
