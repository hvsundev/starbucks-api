package com.starbucks.port.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.starbucks.port.dto.LayoutVO;
import com.starbucks.port.dto.MenuVO;

@Mapper
public interface MainMapper {
	public List<MenuVO> getMenuOfMain();
	public List<LayoutVO> getLayoutInfo();
}
