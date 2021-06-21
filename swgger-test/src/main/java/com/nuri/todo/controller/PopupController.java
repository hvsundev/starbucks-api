package com.nuri.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import com.nuri.todo.dto.NoticeVO;
import com.nuri.todo.service.PopupService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/popup")
public class PopupController {
	
	@Autowired
	private PopupService popupService;
	
	private Gson gson = new Gson();
	
	@ApiOperation(value = "공지사항 제목 가져오기")
	@RequestMapping(value="/notice/title", method = RequestMethod.GET)
	@ResponseBody
	public String getNotice() {
		List<NoticeVO> list = popupService.getNoticeList();
		System.out.println("list: " + list);
		
		return gson.toJson(list);
	}
	
	@ApiOperation(value = "공지사항 전체 내용 가져오기")
	@RequestMapping(value="/notice/contents", method = RequestMethod.POST)
	@ResponseBody
	public String getNoticeContents(@RequestParam String idx) {
		
		System.out.println("idx: " + idx);
		NoticeVO noticeInfo = popupService.getNoticeContents(idx);
		System.out.println("noticeInfo: " + noticeInfo);
		
		return gson.toJson(noticeInfo);
	}
	
	@ApiOperation(value="메인화면의 스크롤뷰 콘텐츠 가져오기")
	@RequestMapping(value="/main/contents", method = RequestMethod.GET)
	@ResponseBody
	public String getMainContents() {
		List<NoticeVO> list = popupService.getScrollNoticeList();
		System.out.println(list);
		return gson.toJson(list);
	}
}
