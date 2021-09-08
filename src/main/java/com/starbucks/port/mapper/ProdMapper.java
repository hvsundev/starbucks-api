package com.starbucks.port.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.starbucks.port.dto.ProdVO;

@Mapper
public interface ProdMapper {
	
	// 전체메뉴 가져오기
	public List<ProdVO> getTotalMenulist(String ctg_code);
	
	// 메뉴의 전체정보 가져오기
	public ProdVO getMenuInfo(String prod_code);
		
	// 정렬 별 상품 가져오기
	// (1: 이름순, 2: 인기순, 3: 낮은 가격순, 4: 높은 가격순)
	public List<ProdVO> getMenuByFilter(int filter_num);
	
	// 검색어 별 상품 가져오기
	public List<ProdVO> getMenuByKeyword(String keyword);
}
