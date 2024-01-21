package com.winter.app.board;

import java.sql.Date;
import java.util.List;

public class BoardDTO {

	
	private Long noticeNum;
	private String noticeWriter;
	private String noticeHead;
	private String noticeContents;
	private Date noticeDate;
	private Long noticeViews;
	
	
	private List<BoardFileDTO> fileDTOs;

	 
	
	public List<BoardFileDTO> getFileDTOs() {
		return fileDTOs;
	}
	public void setFileDTOs(List<BoardFileDTO> fileDTOs) {
		this.fileDTOs = fileDTOs;
	}
	public Long getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Long noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public String getNoticeHead() {
		return noticeHead;
	}
	public void setNoticeHead(String noticeHead) {
		this.noticeHead = noticeHead;
	}
	public String getNoticeContents() {
		return noticeContents;
	}
	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	public Long getNoticeViews() {
		return noticeViews;
	}
	public void setNoticeViews(Long noticeViews) {
		this.noticeViews = noticeViews;
	}
	
	
	
}
