package com.dean.web.dao.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.dean.web.dao.UserDao;
import com.dean.web.model.User;

/**
 * @author Lucifer
 * @version create time：Jul 9, 2014 5:42:12 PM
 */
@Repository
public class UserDaoImpl implements UserDao{

	@Resource
	private JdbcTemplate jdbcTemplate;
	@Override
	public User findUserByUserID(String id) {
		String sqlStr = "select id,username,password from buser where id=?";
		
		final User u = new User();
		
		jdbcTemplate.query(sqlStr, new String[]{id}, new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
			}
			
		});
		return u;
	}

}
