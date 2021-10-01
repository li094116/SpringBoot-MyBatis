package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.UserMessage;

/**
 * 业务层（模型层）
 * @author 李禹锡
 *
 */
public interface UserMessageService {
	/**
	 * 注册新用户
	 * @param userMessage 新用户信息
	 * @return 注册成功返回大于0的整数,否则返回0
	 */
	public abstract Integer insert(UserMessage userMessage);
	
	/**
	 * 修改USER_MESSAGE表中指定USER_ID的用户的USER_NAME
	 * 
	 * @param userMessage 修改的用户信息（用户编号与新的用户名）
	 * @return 修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateUserNameById(UserMessage userMessage);
	
	/**
	 * 删除指定编号的员工信息
	 * 
	 * @param userId 要删除的员工的编号
	 * @return 删除成功返回大于0的整数，否则返回0
	 */
	public abstract Integer deleteUserById(Integer userId);
	
	/**
	 * 查询所有用户信息
	 * @return 成功返回List类型的实例，否则返回null
	 */
	public abstract List<UserMessage> selectAll();

}
