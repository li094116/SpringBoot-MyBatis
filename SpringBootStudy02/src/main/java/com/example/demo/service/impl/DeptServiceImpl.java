package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DeptDao;
import com.example.demo.entity.Dept;
import com.example.demo.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDao deptDao;

	@Override
	public Dept selectById(Integer deptId) {
		return this.deptDao.selectByDeptId(deptId);
	}

}
