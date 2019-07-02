package com.dearbinge.data.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dearbinge.data.api.SecurityService;
import com.dearbinge.data.dao.SecurityMapper;
import com.dearbinge.data.pojo.Security;

@Service(value = "securityService")
public class SecurityServiceImpl implements SecurityService {

	@Resource
	@Autowired
	private SecurityMapper securityMapper;

	public Security getSecurityByKey(String key) {
		Security security = securityMapper.selectByPrimaryKey(key);
//		Security security = new Security();
//		security.setfCreateuser("1212");

		return security;
	}
}
