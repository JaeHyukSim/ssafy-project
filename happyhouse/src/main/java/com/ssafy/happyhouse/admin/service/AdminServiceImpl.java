package com.ssafy.happyhouse.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.repository.dto.Member;
import com.ssafy.happyhouse.repository.mapper.AdminMapper;

@Service
public class AdminServiceImpl implements AdminService {

	private AdminMapper adminMapper;
	
	@Override
	public List<Member> select() throws Exception {
		System.out.println(adminMapper);
		return adminMapper.select();
	}

}
