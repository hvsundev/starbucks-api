package com.nuri.todo.service;

import java.util.List;

import com.nuri.todo.dto.NoticeVO;

public interface PopupService {
	public List<NoticeVO> getNoticeList();
	public NoticeVO getNoticeContents(String idx);
	public List<NoticeVO> getScrollNoticeList();
}
