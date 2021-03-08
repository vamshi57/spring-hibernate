package com.vamshi.dao;

import com.vamshi.bo.UserDetailsBo;

public interface AuthenticationDao {
	public int validate(UserDetailsBo bo);

}
