package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Emp;

public interface EmpService {
	/**
	 * 查询Emp表中指定编号的员工及员工部门的信息
	 * @param userId 用户编号
	 * @return 查询成功返回com.test.entity.Emp实例，否则返回空
	 */
	public abstract Emp selectByEmpId(Integer empId);
	
	/**
	 * 查询满足条件的员工信息
	 * @param emp 查询条件
	 * @return 查询成功返回List类型的实例，否则返回null
	 */
	public abstract List<Emp> seleEmps(Emp emp);
	
	/**
	 * 修改Emp表中指定编号的员工信息
	 * @param emp 将要修改的员工信息
	 * @return 修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateEmp(Emp emp);
}
