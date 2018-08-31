package entity;

public class Page {
	private int totalCount=0;//总记录数
	private int currentPageNo=0;//当前页
	private int pageSize=5;//每页记录数
	private int totalPageCount=0;//总页数
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurrentPageNo() {
		if(totalCount==0){
			return 0;
		}
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		if(currentPageNo>0){
			this.currentPageNo = currentPageNo;
		}
		
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		if(totalPageCount>0){
			//总页数
			totalPageCount=this.totalCount%pageSize==0?(this.totalCount/pageSize):(this.totalCount/pageSize+1);
			this.totalPageCount = totalPageCount;
		}
		
	}
	

}
