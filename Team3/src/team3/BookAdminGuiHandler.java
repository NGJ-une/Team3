package team3;

public interface BookAdminGuiHandler {
	// ȸ�� ���
	String getUserAddName();
	String getUserAddTel();
	String getUserAddAddr();
	String getUserAddBirth();
	void setUserAddMsg(String message);
	void setUserList(String userList);
	
	// å ���
	String getBookAddGenre();
	String getBookAddtitle();
	String getBookAddAuthor();
	String getBookAddPublisher();
	void setBookAddMsg(String message);
	void setBookAddList(String bookList);
	
	// å ���� 
	String getBookDeleteId();
	void setBookDeleteMsg(String message);
	void setBookDeleteList(String bookList);
	
	// å �뿩 
	String getBookLendPid();
	String getBookLendBid();
	void setBookLendMsg(String message);
	void setBookLendList(String bookList);
	
	// �˻��ϱ�
	String getSearchInfoKey();
	boolean getBookSearchState();
	boolean getPersonSearchState();
	void setSearchResult(String result);
	void appendSearchResult(String result);
	
	// ��ü ����
	void addDelayInfo(String delayInfo);
	
	// ž ��
	void addTopTenRank(String rank);
	
	// DB ���� ��� ž��
	void setFeatures(BookAdminIF features);
	
}
