package com.example.demo.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LoginUser;

/**
 * DBへのアクセスメソッドを呼び出すDao
 *
 */
@Repository
public class LoginUserDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public LoginUserDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * フォームの入力値から該当するユーザを検索 合致するものが無い場合Nullが返される
	 * @param userName
	 * @return loginUser
	 */
	public LoginUser findUser(String userName) {

		String sql = "";
		sql += "SELECT * ";
		sql += "FROM user ";
		sql += "WHERE username = ?";

		Map<String, Object> result = jdbcTemplate.queryForMap(sql, userName);

		LoginUser loginUser = new LoginUser();
		loginUser.setId((int)result.get("id"));
		loginUser.setUsername((String)result.get("username"));
		loginUser.setPassword((String)result.get("password"));

		return loginUser;
	}


}
