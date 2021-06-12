package com.nuri.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nuri.todo.dto.NoticeVO;

@Mapper
public interface PopupMapper {
	public List<NoticeVO> getNoticeList();
	public NoticeVO getNoticeContents(String idx);
}
