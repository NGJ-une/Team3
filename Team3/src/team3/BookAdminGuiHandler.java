package team3;

public interface BookAdminGuiHandler {
	//�α���
	String getloginId();
	String getloginPw();
	void setLoginMsg(String Message);
	void setMenubar(boolean login_info);
	
	//ȸ������
	String getAdminId();
	String getAdminPw();
	String getAdminKey();
	void setAdminId(String id);
	void setAdminPw(String pw);
	void setAdminKey(String key);
	void setAdminAddMsg(String Message);
	
	// ȸ�� ���
	String getUserAddName();
	String getUserAddTel();
	String getUserAddAddr();
	String getUserAddBirth();
	void setUserAddMsg(String message);
	void setUserList(String userList);
	
	// ȸ�� ���� ����
	String getUserUpdateId();

	String getUserUpdateName();

	String getUserUpdateTel();

	String getUserUpdateAddr();

	String getUserUpdateBirth();

	void setUserUpdateId(String id);

	void setUserUpdateName(String name);

	void setUserUpdateAddr(String addr);

	void setUserUpdateTel(String tel);

	void setUserUpdateBirth(String birth);

	void setUserUpdateMsg(String message);

	void setUserUpdateList(String userList);
	
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