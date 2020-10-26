package kosta1200.todayroom.vo;

import java.util.List;

//paging처리를 위해 필요한 모든 정보를 담음
public class Review_PagingVO {
	private List<ReviewVO> list;
	private int requestPage;
	private int totalPageCount;
	private int startPage;
	private int endPage;
	private int totalCount;
	
	
	public Review_PagingVO(){	}


	public Review_PagingVO(List<ReviewVO> list, int requestPage, int totalPageCount, int startPage, int endPage,
			int totalCount) {
		super();
		this.list = list;
		this.requestPage = requestPage;
		this.totalPageCount = totalPageCount;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalCount = totalCount;
	}




	public List<ReviewVO> getList() {
		return list;
	}


	public void setList(List<ReviewVO> list) {
		this.list = list;
	}


	public int getRequestPage() {
		return requestPage;
	}


	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}


	public int getTotalPageCount() {
		return totalPageCount;
	}


	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}


	public int getStartPage() {
		return startPage;
	}


	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}


	public int getEndPage() {
		return endPage;
	}


	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "Review_PagingVO [list=" + list + ", requestPage=" + requestPage + ", totalPageCount=" + totalPageCount
				+ ", startPage=" + startPage + ", endPage=" + endPage + ", totalCount=" + totalCount + "]";
	}


	
	
}
