package com.winter.app.board.qna;

import com.winter.app.board.BoardDTO;

public class QnaDTO extends BoardDTO{
	
	private Long noticeRef;
	private Long noticeStep;
	private Long noticeDepth;
	
	
	
	
	
	
	public Long getNoticeRef() {
		return noticeRef;
	}
	public void setNoticeRef(Long noticeRef) {
		this.noticeRef = noticeRef;
	}
	public Long getNoticeStep() {
		return noticeStep;
	}
	public void setNoticeStep(Long noticeStep) {
		this.noticeStep = noticeStep;
	}
	public Long getNoticeDepth() {
		return noticeDepth;
	}
	public void setNoticeDepth(Long noticeDepth) {
		this.noticeDepth = noticeDepth;
	}



	
	
	
}
