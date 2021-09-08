package com.starbucks.port.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.starbucks.port.dto.ProdVO;
import com.starbucks.port.service.ProdService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/service/prod")
public class ProdController {
	
	private Gson gson = new Gson();
	
	@Autowired
	private ProdService service;
	
	@ApiOperation(value = "전체 메뉴 가져오기")
	@RequestMapping(value = "/total", method = RequestMethod.GET)
	@ResponseBody
	public String getTotalMenulist() {
		String testCd = "blended_01";
		ProdVO prod = service.getMenuInfo(testCd);
		System.out.println(">>>>>>>>>>>> [test] prod " + prod);
		return gson.toJson(prod);
	}
	
	@ApiOperation(value = "개별 상품정보 가져오기")
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public String getMenuInfo(String prod_code) {
		ProdVO prodInfo = service.getMenuInfo(prod_code);
		return gson.toJson(prodInfo);
	}
	
	@ApiOperation(value = "필터 별 상품정보 가져오기")
	@RequestMapping(value = "/filter", method = RequestMethod.GET)
	@ResponseBody
	public String getMenuByFilter(int menu_num) {
		List<ProdVO> prodList = service.getMenuByFilter(menu_num);
		return gson.toJson(prodList);
	}
	
	@ApiOperation(value = "검색어 별 상품정보 가져오기")
	@RequestMapping(value = "/keyword", method = RequestMethod.GET)
	@ResponseBody
	public String getMenuByKeyword(String keyword) {
		List<ProdVO> prodList = service.getMenuByKeyword(keyword);
		return gson.toJson(prodList);
	}

}
