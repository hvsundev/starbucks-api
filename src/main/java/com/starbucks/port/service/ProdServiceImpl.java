package com.starbucks.port.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starbucks.port.dto.ProdVO;
import com.starbucks.port.mapper.ProdMapper;

@Service
public class ProdServiceImpl implements ProdService {
	
	@Autowired
	private ProdMapper mapper;

	@Override
	public ProdVO getMenuInfo(String prod_code) {
		return mapper.getMenuInfo(prod_code);
	}

	@Override
	public List<ProdVO> getTotalMenulist(String ctg_code) {
		return mapper.getTotalMenulist(ctg_code);
	}

	@Override
	public List<ProdVO> getMenuByFilter(int filter_num) {
		return mapper.getMenuByFilter(filter_num);
	}

	@Override
	public List<ProdVO> getMenuByKeyword(String keyword) {
		return mapper.getMenuByKeyword(keyword);
	}
	
}
