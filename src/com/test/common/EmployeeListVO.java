package com.test.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeListVO {
	
	public EmployeeListVO()
	{
		
	}
	List<EmployeeVO> employees=new ArrayList<EmployeeVO>();

	public List<EmployeeVO> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeVO> employees) {
		this.employees = employees;
	}
}
