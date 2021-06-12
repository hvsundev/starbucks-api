package com.nuri.todo.dto;

import lombok.Data;

@Data
public class NoticeVO {
	private int idx;
	private String title;
	private String contents;
	private String regdate;
	private String lastdate;
}
