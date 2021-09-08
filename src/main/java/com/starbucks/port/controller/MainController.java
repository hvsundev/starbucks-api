package com.starbucks.port.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.starbucks.port.dto.LayoutVO;
import com.starbucks.port.dto.MenuVO;
import com.starbucks.port.service.MainService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/service")
public class MainController {
	
	@Autowired
	private MainService service;
	
	private Gson gson = new Gson();
	
	@ApiOperation(value = "메인메뉴 가져오기")
	@RequestMapping(value = "/menu/main", method = RequestMethod.GET)
	@ResponseBody
	public String getMenuInfo() {
		List<MenuVO> menuList = service.getMenuOfMain();
		return gson.toJson(menuList);
	}
	
	@ApiOperation(value = "레이아웃 정보 가져오기")
	@RequestMapping(value = "/menu/layout", method = RequestMethod.GET)
	@ResponseBody
	public String getLayouyInfo() {
		List<LayoutVO> layoutInfo = service.getLayoutInfo();
		return gson.toJson(layoutInfo);
	}
	
}
