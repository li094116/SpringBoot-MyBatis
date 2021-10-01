package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMessageDao;
import com.example.demo.entity.UserMessage;
import com.example.demo.service.UserMessageService;


@Service
public class UserMessageServiceImpl implements UserMessageService {
	
	@Autowired
	private UserMessageDao userMessageDao;
	
	@Override
	public Integer insert(UserMessage userMessage) {
		return this.userMessageDao.insert(userMessage);
	}

	@Override
	public Integer updateUserNameById(UserMessage userMessage) {
		// TODO Auto-generated method stub
		return this.userMessageDao.updateUserNameById(userMessage);
	}

	@Override
	public Integer deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		return this.userMessageDao.deleteUserById(userId);
	}

	@Override
	public List<UserMessage> selectAll() {
		// TODO Auto-generated method stub
		return this.userMessageDao.selectAll();
	}

}
