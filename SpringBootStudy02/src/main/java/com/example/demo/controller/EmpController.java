package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Emp;
import com.example.demo.service.EmpService;

@RequestMapping(value = "/emp")
@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping(value = "selectById")
	public Emp selectById(Integer empId) {
		return this.empService.selectByEmpId(empId);
	}
	
	@PostMapping(value = "/selectEmps")
	public List<Emp> selecEmps(Emp emp){
		// 通过业务的对象查询满足条件的员工信息
		return this.empService.seleEmps(emp);
	}
	
	@PostMapping(value = "/update")
	public String updaEmp(Emp emp) {
		// 通过业务层的对象来调用业务层的方法
		int update = this.empService.updateEmp(emp);
		return (update > 0) ? "修改成功" : "修改失败";
	}
}
