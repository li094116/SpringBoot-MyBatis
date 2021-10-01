package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserMessage;
import com.example.demo.service.UserMessageService;

/**
 * 控制层的组件
 * @author 李禹锡
 *
 */
@RequestMapping(value = "/user")
@RestController
public class UserMessageController {
	
	@Autowired
	private UserMessageService userMessageService;
	
	@GetMapping(value = "/selectAll")
	public List<UserMessage> selectAll(){
		return this.userMessageService.selectAll();
	}
	
	@PostMapping(value = "/insert")
	public String insert(UserMessage userMessage) {
		int insert = this.userMessageService.insert(userMessage);
		return insert > 0 ? "注册成功" : "注册失败";
	}
}
