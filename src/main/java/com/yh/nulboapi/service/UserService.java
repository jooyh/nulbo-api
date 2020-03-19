package com.yh.nulboapi.service;

import java.util.List;
import java.util.Map;

import com.yh.nulboapi.vo.UserVO;

public interface UserService {

	public List<UserVO>getUserList(Map params);

}
