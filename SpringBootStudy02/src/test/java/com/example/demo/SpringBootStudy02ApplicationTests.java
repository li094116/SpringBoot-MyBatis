package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.UserMessage;
import com.example.demo.service.UserMessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootStudy02ApplicationTests {
	@Autowired
	private UserMessageService userMessageService;
	
	@Test
	public void testInsert() {
		// 创建一个用户信息实体类的对象
		UserMessage user =  new UserMessage();
		user.setUserName("李禹锡3");
		user.setUserPassword("094116");
		user.setUserBirthday(new Date());
		user.setUserEmail("2328181539@qq.com");
		user.setUserSex(1);
		// 注册新用户信息
		int insert = this.userMessageService.insert(user);
		System.out.println(insert>0?"注册成功" : "注册失败");
	}
	
	@Test
	public void testUpdate() {
		UserMessage user = new UserMessage();
		user.setUserId(2);
		user.setUserName("谭野");
		int update = this.userMessageService.updateUserNameById(user);
		System.out.println(update>0?"修改成功" : "修改失敗");
	}
	
	@Test
	public void testDeleteUser() {
		int delete = this.userMessageService.deleteUserById(1);
		System.out.println(delete>0?"删除成功" : "删除失败");
	}
	
	
	@Test
	public void testSelectAll() {
		List<UserMessage> list = this.userMessageService.selectAll();
		for (UserMessage userMessage : list) {
			System.out.println(userMessage.toString());
		}
	}

}
