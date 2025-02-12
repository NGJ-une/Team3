package team3;

public interface BookAdminIF {
	//�α���
	void login() throws Exception;
	void adminAdd() throws Exception;
	boolean getLoginStatus();
	void setLoginStatus(boolean st);
	
	// ȸ�� ���
	String userList() throws Exception;
	void userAdd() throws Exception;
	
	// ȸ�� ����
	void userUpdate() throws Exception;
	void userInfo() throws Exception;
	   
	// å ��� �� ����
	String bookList() throws Exception;
	void bookAdd() throws Exception;
	void bookDelete() throws Exception;
	
	// å �뿩 �� �ݳ�
	String bookLendList() throws Exception;
	void bookLend() throws Exception;
	void bookReturn() throws Exception;
	void searchInfo() throws Exception;
	
	// ��ü ���� ����
	void delayInfo() throws Exception;
	
	
	// ž ��
	void topTen() throws Exception;
	
}