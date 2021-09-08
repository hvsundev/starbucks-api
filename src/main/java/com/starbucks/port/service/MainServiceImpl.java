package com.starbucks.port.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starbucks.port.dto.LayoutVO;
import com.starbucks.port.dto.MenuVO;
import com.starbucks.port.mapper.MainMapper;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainMapper mapper;


	@Override
	public List<MenuVO> getMenuOfMain() {
		return mapper.getMenuOfMain();
	}

	@Override
	public List<LayoutVO> getLayoutInfo() {
		return mapper.getLayoutInfo();
	}
}
