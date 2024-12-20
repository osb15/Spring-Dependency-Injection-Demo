package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
		@Value("1")
		private int Eid ;
		@Value("OM")
		private String Ename ;
		
		@Autowired
		Country country ;


		public int getEid() {
			return Eid;
		}


		public void setEid(int eid) {
			Eid = eid;
		}


		public String getEname() {
			return Ename;
		}


		public void setEname(String ename) {
			Ename = ename;
		}


		public Country getCountry() {
			return country;
		}


		public void setCountry(Country country) {
			this.country = country;
		}


		@Override
		public String toString() {
			return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", country=" + country + "]";
		}
		

}
