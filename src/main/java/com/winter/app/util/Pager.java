package com.winter.app.util;

public class Pager {

	
	private Long startRow;
	private Long lastRow;
	private Long perPage =10L;//몇개씩 볼거냐
	//startRow 랑 lastRow 계싼하는 메서드
	private Long page;
	private Long totalPage;
	private Long startNum;
	private Long lastNum;
	
	private boolean start;
	private boolean last;
	
	//게시판 검색 선언
	private String search;
	private String kind;
	
	
	
	public void makeNum(Long totalCount) {
		//1.총갯수로 총페이지수 구하기
		//2.총 페이지수로 총 블럭수 구하기
		//3.현재 페이지 번호로 현재 블럭번호 구하기
		//4.현재 블럭 번호로 시작 번호와 끝번호 구하기 
		//5.이전, 다음 블럭 유무 구하기
		
		
		//1.총갯수로 총페이지수 구하기
	
	 	totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}
		this.setTotalPage(totalPage);
		
		//2.총 페이지수로 총 블럭수 구하기
		Long totalBlock = 0L;  //총블럭갯수
		Long perBlock = 10L;    //몇개로 보여질지 
		totalBlock = totalPage/perBlock;
		if(totalPage%perBlock!=0) {
			totalBlock++;
		}
	
		//3.현재 페이지 번호로 현재 블럭번호 구하기
		Long curBlock = 0L; //현재 블럭
		curBlock = this.getPage()/perBlock;
		if(this.getPage()%perBlock !=0) {
			curBlock++;
		}
		//4.현재 블럭번호로 시작번호와 끝번호 구하기
		Long startNum = 0L;
		Long lastNum = curBlock*perBlock;
		startNum = lastNum-perBlock+1;
		this.setStartNum(startNum);
		this.setLastNum(lastNum);
		
		//5.이전 ,다음 블럭 유무 구하기
		if(curBlock==1) {
			this.setStart(true);
		}
		if(curBlock==totalBlock) {
			this.setLastNum(totalPage);
			this.setLast(true);
		}
		
		
	}
	
	
	
	public void makeRow() {
		this.startRow = ((this.getPage()-1)*this.getPerPage())+1;
		this.lastRow =  this.getPage()*this.getPerPage();

	
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



	public Long getPerPage() {
		if(this.perPage==null||this.perPage<1) {
			this.perPage=10L;
		}
		return perPage;
	}


	public void setPerPage(Long perPage) {
		this.perPage = perPage;
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



	public String getSearch() {
		if(this.search==null) {
			search="";
		}
		return search;
	}



	public void setSearch(String search) {
		this.search = search;
	}



	public String getKind() {
		return kind;
	}



	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
	
}
