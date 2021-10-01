package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Emp;

public interface EmpDao {
	
	/**
	 * 查询Emp表中指定编号的员工及员工部门的信息
	 * @param userId 用户编号
	 * @return 查询成功返回com.test.entity.Emp实例，否则返回空
	 */
	public abstract Emp selectByEmpId(Integer empId);
	
	public abstract List<Emp> selectEmps(Emp emp);
	
	/**
	 * 修改Emp表中指定编号的员工信息
	 * @param emp 将要修改的员工信息
	 * @return 修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateEmp(Emp emp);

}
