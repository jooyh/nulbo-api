package com.yh.nulboapi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.yh.nulboapi.vo.UserVO;

@Mapper
public interface UserMapper {

	public List<UserVO> selectUserList(Map params);

}
