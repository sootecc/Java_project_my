package chap13.Ex10;

class Button{
	//OnClickListener: ��ü Ÿ��, ocl: ��������
	OnClickListener ocl;		//  �⺻������ null
	
	
	//setter�� ���ؼ� OnClickListener�� ���� ���� ocl�� ��ü �ּҸ� ��´�.
	void setOnClickListener(OnClickListener ocl) {	
		this.ocl = ocl;				
	}

	//�������̽��� �����ϰ� ������ �ڽ� Ŭ������ ����.
	//ȣ���ϴ� ������ onClick()�� �������Ͽ� ȣ��
	interface OnClickListener{	//�̳� �������̽�, static Ű �����Ǿ� ����, Button.OnClickListener
		void onClick();			//�޼ҵ� ���� ��. �������� �������̵��Ͽ� ������
	}

	void click() {				//�������� �� ocl.OnClick()�� ȣ��
		ocl.onClick();
		System.out.println(ocl);
	}
}





public class ButtonAPIExample {

	public static void main(String[] args) {
		
		Button button1 = new Button();
		
		
		//A.B a = new A.B(){�̳� �������̽�B�� �޼ҵ带 ������ �ڵ�};
		
		//OnClickListener ��ü Ÿ������ ��ü ���� �Ű����� ����
		
		//������ 1: Ŭ�� �� ���� ���
		button1.setOnClickListener(new Button.OnClickListener() {		//OnClickListener ��üŸ������ ��ü ����
			
			@Override
			public void onClick() {
				System.out.println("������1. ���� ���");
			}
		}
		);
		
		button1.click();
		
		
		System.out.println("====================");
		
		//������ 2: Ŭ�� �� ���̹� ����
		Button button2 = new Button();
		///setOnClickListener �޼ҵ忡 �Ű������� OnClickListener�� ���� �͸� ��ü�� ���� �� OnClickListener
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������2. ���̹� ����");
			}
		});
		
		button2.click();
		
		
	}

}
