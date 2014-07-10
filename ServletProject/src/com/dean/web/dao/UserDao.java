package com.dean.web.dao;

import com.dean.web.model.User;

/**
 * @author Lucifer
 * @version create time：Jul 9, 2014 5:41:51 PM
 */
public interface UserDao 
{
	User findUserByUserID(String id);
}
