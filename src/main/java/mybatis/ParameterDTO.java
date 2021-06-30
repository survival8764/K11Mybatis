package mybatis;

import java.util.ArrayList;

public class ParameterDTO {

	private String user_id;
	private String board_idx;
	private String searchField;
	//private String searchTxt;// 검색어 2차버전
	private ArrayList<String> searchTxt;// 검색어 3차버전
	private int start;
	private int end;

//============================= 검색어 2차버전 =============================	
//	public String getSearchTxt() {                                     |
//		return searchTxt;                                              |
//	}                												   |
//	public void setSearchTxt(String searchLists) { 					   |
//		this.searchTxt = searchLists;								   |
//	}																   |
//======================================================================	
	public String getSearchField() {
		return searchField;
	}
	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}
	public ArrayList<String> getSearchTxt() {
		return searchTxt;
	}
	public void setSearchTxt(ArrayList<String> searchLists) {
		this.searchTxt = searchLists;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBoard_idx() {
		return board_idx;
	}
	public void setBoard_idx(String board_idx) {
		this.board_idx = board_idx;
	}
	
}
