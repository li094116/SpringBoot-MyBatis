package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer deptId;
	private String deptName;
	
	/**
	 * 用于保存当前员工所有员工的信息
	 */
	private List<Emp> empList;
	
	public List<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Emp> empList) {
		this.empList = empList;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
