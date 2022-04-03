package chap14.Ex05;

//���� ������ ��ü���� AutoCloseable�� ����غ���,
	//try (��ü ���� ����){} catch{} : �ڵ����� close()��. 	try (with resource)
	//1. AutoCloseable �������̽��� close() �޼ҵ带 �������̵� �ؾ� �Ѵ�.
	
	//java.lang.AutoCloseable: java.lang <- import���� ������� �ʾƵ� �ȴ�.
	//java.lang.Object

//���ܸ� ó���ϴ� ���
	//1. try catch�� ����Ͽ� ���� ó��: �ڽ��� ���� ���ܸ� ó���Ѵ�.
	//2. throws�� ���Ͽ� ���� ó��: ���ܸ� ���� ó������ �ʰ� throws �޴� ������ ���ܸ� ó���ϵ��� �̷��.
			//���� ����. �޼ҵ忡�� ���� ���� 
			//throw: ���ܸ� ������ �߻���Ų��.

class A implements AutoCloseable{
	String resource;					//resource = null
	
	A(String resource){					//�������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε�
		this.resource = resource;
	}

	@Override
	public void close() throws Exception {		//close() �޼ҵ尡 �ڵ����� ȣ��ȴ�.
		System.out.println(resource);
		
		if (resource != null) {
			resource = null;
			System.out.println("���ҽ��� �����Ǿ����ϴ�.");
			System.out.println(resource);
		}
	}
	
	
}

public class TryWithResource_2 {

	public static void main(String[] args) {
		
		//1. �ڵ� ���ҽ� ���� ���
		
		
		try(A a1 = new A("Ư�� ����");){
			
		}
		catch(Exception e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
		//finally block���� a1.close() ȣ���� ���� �ʴ��� �ڵ����� ȣ��ȴ�.
		
		System.out.println("======================================");
		
		//2. �������� ���ҽ� ����
		
		A a2 = null;
		try{
			a2 = new A("������ �ʱⰪ �Ҵ�");
		}
		catch(Exception e) {
			
		}
		finally {		
			if(a2.resource != null) {
				
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("======================================");

	}

}
