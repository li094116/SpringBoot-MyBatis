package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.dao.EmpDao;
import com.example.demo.entity.Emp;
import com.example.demo.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDao empDao;
	@Override
	public Emp selectByEmpId(Integer empId) {
		// TODO Auto-generated method stub
		return this.empDao.selectByEmpId(empId);
	}
	@Override
	public List<Emp> seleEmps(Emp emp) {
		// 判断如果员工姓名不为空，则在员工姓名两端添加%
		String empName = emp.getEmpName();
		// 判断字符串是否不为空
		if (StringUtils.hasText(empName)) {
			// 如果员工姓名不为空，则在员工姓名的两端添加百分号
			emp.setEmpName("%" + empName + "%");
		}
		// 通过持久化层的对象，调用持久化层的方法，查询满足条件的员工信息
		return this.empDao.selectEmps(emp);
	}
	@Override
	public Integer updateEmp(Emp emp) {
		// 通过持久化层的对象，调用持久化层的方法，修改员工信息
		return this.empDao.updateEmp(emp);
	}

}
