package com.yh.nulboapi.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.nulboapi.mapper.UserMapper;
import com.yh.nulboapi.service.UserService;
import com.yh.nulboapi.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserVO> getUserList(Map params) {
		List<UserVO> userList = userMapper.selectUserList(params);
		return userList;
	}

}
