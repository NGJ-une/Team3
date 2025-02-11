package team3;

public interface BookAdminIF {
	// ȸ�� ���
	String userList() throws Exception;
	void userAdd() throws Exception;
	
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

