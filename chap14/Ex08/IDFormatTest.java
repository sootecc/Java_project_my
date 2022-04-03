package chap14.Ex08;

//ID�� ���� NULL�� ��� Exception �߻�
//userID�� 8�� �̻� 20�ڰ� �ƴ� ��� Exception

class IDFormatException extends Exception{
	
	public IDFormatException(){
		super();
	}
	IDFormatException(String message){		//���� �߻��� ���� �޽����� ���
		super(message);
	}
}




public class IDFormatTest {

	private String userID;	//null, 8�� �̻� check
		//userID ĸ��ȭ��. private�� ���� �ܺγ� �ٸ� Ŭ�������� ���� ����
		//������, setter�� ����ؼ� ���� �Ҵ�
		
	
	public String getUserID() {			//getter
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {			//setter
		
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");			//�����ڷ� throw�����ָ� �ȴ�.
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ��� �����մϴ�.");
		}
		else {
			System.out.println("���������� �ԷµǾ����ϴ�.");
		}
		
		this.userID = userID;
	}
	

	
	
	public static void main(String[] args) {
		
		IDFormatTest id = new IDFormatTest();
		
		//1. userID�� null�� ���
		//2. userID�� 7���� ���
		//3. null�� �ƴϰ� 8�� �̻� 20�� �̸�
		String userID = null;
		String[] IDs = {null, "1234567","abcdef1234"};
	
				
		
		for(int i = 0; i<IDs.length;i++) {
			try {
				id.setUserID(IDs[i]);
			} catch (IDFormatException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("�����ID: "+id.getUserID()); 
			System.out.println("========================");

		}
		
	}

}
