package entity;

public class Page {
	private int totalCount=0;//�ܼ�¼��
	private int currentPageNo=0;//��ǰҳ
	private int pageSize=5;//ÿҳ��¼��
	private int totalPageCount=0;//��ҳ��
	
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
			//��ҳ��
			totalPageCount=this.totalCount%pageSize==0?(this.totalCount/pageSize):(this.totalCount/pageSize+1);
			this.totalPageCount = totalPageCount;
		}
		
	}
	

}
