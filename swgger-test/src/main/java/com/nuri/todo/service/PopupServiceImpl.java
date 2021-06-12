package com.nuri.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuri.todo.dto.NoticeVO;
import com.nuri.todo.mapper.PopupMapper;

@Service
public class PopupServiceImpl implements PopupService {

	@Autowired
	private PopupMapper popupMapper;
	
	@Override
	public List<NoticeVO> getNoticeList() {
		return popupMapper.getNoticeList();
	}

	@Override
	public NoticeVO getNoticeContents(String idx) {
		return popupMapper.getNoticeContents(idx);
	}
}
