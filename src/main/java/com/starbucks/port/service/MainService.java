package com.starbucks.port.service;

import java.util.List;

import com.starbucks.port.dto.LayoutVO;
import com.starbucks.port.dto.MenuVO;

public interface MainService {
	// 메인메뉴 가져오기
	public List<MenuVO> getMenuOfMain();
	
	// 레이아웃 순서 및 정보 가져오기
	public List<LayoutVO> getLayoutInfo();

}
