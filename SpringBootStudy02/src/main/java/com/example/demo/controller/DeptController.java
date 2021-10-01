package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dept;
import com.example.demo.service.DeptService;

@RequestMapping(value = "/dept")
@RestController
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping(value = "/selectById")
	public Dept selectById(Integer deptId) {
		return this.deptService.selectById(deptId);
	}
	
}
