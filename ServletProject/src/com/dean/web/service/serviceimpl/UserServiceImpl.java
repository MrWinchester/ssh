package com.dean.web.service.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dean.web.dao.UserDao;
import com.dean.web.model.User;
import com.dean.web.service.UserService;
import com.dean.web.utils.StrUtils;

/**
 * @author Lucifer
 * @version create time：Jul 9, 2014 5:41:25 PM
 */
@Service
public class UserServiceImpl implements UserService
{
	@Resource
	private UserDao dao;
	
	@Override
	public User loginCheck(User user) 
	{
		User u = dao.findUserByUserID(user.getName());
		StrUtils.
			writeLog("id="+u.getId()+";name="+u.getName()+";password="+u.getPassword());
		
		if(user.getPassword().equals(u.getPassword()))
		{
			return u;
		}
		return null;
	}

}
