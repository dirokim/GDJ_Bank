package com.winter.app.util;




public class Pager {
	
	//페이지
	private Long startRow;
	private Long lastRow;
	private Long page;
	private Long perPage=10L;
	
	//블럭
	private Long totalPage;
	private Long startNum;
	private Long lastNum;
	
	//boolean
	private boolean start;
	private boolean last;
	
	
	public void makeRow() {
	this.lastRow = this.getPage()*this.getPerPage();
	this.startRow = this.getLastRow()-this.getPerPage()+1;	
	}
	
	public void makePage(Long totalCount) {
		totalPage = totalCount/this.getPerPage();
		if(totalCount/this.getPerPage()!=0) {
		totalPage++;
		}
		
		this.setTotalPage(totalPage);	
		Long totalBlock = 0L;
		Long perBlock = 10L;
		totalBlock = totalPage/perBlock;
		if(totalPage/perBlock!=0) {
		totalBlock++;
		}
		
		Long nowBlock =0L;
		nowBlock = this.getPage()/perBlock;
		if(this.getPage()/perBlock!=0) {
		nowBlock++;
		}
		
		
		Long lastNum= nowBlock*perBlock;
		Long startNum=lastNum-perBlock+1L;
		 this.setStartNum(startNum);
		 this.setLastNum(lastNum);
		 
		if(nowBlock==1) {
			this.setStart(true);
		}
		if(nowBlock==totalBlock) {
			this.setLastNum(totalPage);
			this.setLast(true);
		}
		 

	}
	
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page=1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}



	public Long getPerPage() {
		return perPage;
	}



	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}


	
	
	
	
}
