package com.example.demo.dao;

import com.example.demo.entity.Dept;

public interface DeptDao {

	/**
	 * 查询DEPT表中指DEPT_ID的部门信息及部门所有员工的信息（一对多）
	 * @param deptId 部门编号
	 * @return 成功返回com.example.demo.entity.Dept类型的实例，否则返回null
	 */
	public abstract Dept selectByDeptId(Integer deptId);

}
