package com.example.demo.service;

import com.example.demo.entity.Dept;

public interface DeptService {
	
	/**
	 * 查询指定编号部门及部门员工的信息
	 * @param deptId 部门编号
	 * @return 成功返回com.example.demo.entity.Dept类型的实例，否则返回null
	 */
	public abstract Dept selectById(Integer deptId);

}
