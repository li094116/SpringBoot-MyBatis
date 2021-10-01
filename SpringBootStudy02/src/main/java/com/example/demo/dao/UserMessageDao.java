package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.UserMessage;

/**
 * 持久化层："声明"对表进行操作的方法
 * 
 * @author 李禹锡
 *
 */
public interface UserMessageDao {

	/**
	 * 向UserMessage表中添加新的用户信息
	 * 
	 * @param userMessage 新的用户信息
	 * @return 添加成功返回大于0的整数，否则返回0
	 */
	public abstract Integer insert(UserMessage userMessage);

	/**
	 * 修改USER_MESSAGE表中指定USER_ID的用户的USER_NAME
	 * 
	 * @param userMessage 修改的用户信息（用户编号与新的用户名）
	 * @return 修改成功返回大于0的整数，否则返回0
	 */
	public abstract Integer updateUserNameById(UserMessage userMessage);
	
	public abstract Integer deleteUserById(Integer userId);
	
	public abstract List<UserMessage> selectAll();
}
