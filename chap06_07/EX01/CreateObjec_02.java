package chap06_07.EX01;


class Aaa{
	
	String name;		//�ʵ�: ��üȭ ���Ѿ� ��� ����, Ŭ���� block���� ����
	int age;			//�ʵ��� ������ Heap ������ ����, Heap ������ ���������� �ڵ� �ʱ�ȭ
	String email;
	boolean man;
	double weight;
	
	public String getName() {		//�޼ҵ�
		return name;
	}
	public void setName(String name) {		//��ǲ�Ǵ� ����, �޴� ���� �̸�, �޸� �̸��� ��� ������ ���
		this.name = name;					//�޸� �̸��� this: �ڽ��� Ŭ������'" ����
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}





public class CreateObjec_02 {
	public static void main(String[] args) {
		
		//�ʵ��� �ʱ� ���� ���(Heap ������ �ڵ� �ʱ�ȭ)
		Aaa aaa = new Aaa();	//��ü ���� (aaa)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		System.out.println("================");
		//������ ���� ���� ����[Heap]. ���Ȼ� ����
		aaa.name = "ȫ�浿";
		aaa.age	= 30;
		aaa.weight = 70.5;
		aaa.man = true;
		aaa.email = "aaa@aaa.com";
			
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("================");
		//setter�� ���ؼ� ���� ����, �޸𸮿� ���� ���� �� ��� �� �� �ִ�.
			//month �����ϴ� ����
		aaa.setName("�������");
		aaa.setAge(60);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		
		//getter�� ���ؼ� �޸��� ���� ���
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.isMan());
		System.out.println(aaa.getWeight());
		
		//�ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
	
	}
	
	
}
