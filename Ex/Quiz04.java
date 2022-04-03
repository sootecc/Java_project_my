package Ex;

class E extends Object{		//�ڹٿ� ��� Ŭ������ Object�� �ڽ�Ŭ�����̴�.
								//Object Ŭ������ �̸� ���ǵ� �޼ҵ带 ����� �� �ִ�.
	
	String name;
	
	E(){}					//�⺻ ������: Ŭ�������� �ٸ� �����ڰ� ������ �� �ܺο��� �⺻�����ڸ� ȣ���� �� �����Ǹ� �ȵȴ�.
	E(String name){
		this.name = name;	//�Ű����� �̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ��� ������ ��� this
							//this : �ڽ��� ��ü
	}
	
	@Override
		public String toString() {	//��ü ��ü�� ����� ��(println) toString()�� ȣ��
			
			return "�̸�: "+ name;	//this.name
		}
	@Override
		public boolean equals(Object obj) {		//e2.equals(e3)
		
			if(this.name == ((E)obj).name) {	//objŸ���� EŸ������ �ٿ�ĳ����
				return true;
			}
			else {
				return false;
			}
		}
}

class Student1{
	int studentID;
	String name;
	int kor;
	int eng;
	Student1(int studentID, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student1)obj).studentID){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return studentID+", "+name+", "+kor+", "+eng;
	}
	
}

public class Quiz04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1111,"ȫ�浿",59,38);
		Student1 s2 = new Student1(3334,"��ö��",49,95);
		Student1 s3 = new Student1(2234,"�迵��",55,48);
		Student1 s4 = new Student1(1111,"��ͱ�",98,76);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/*��ü�� studentID column�� ���ؼ� ���� ��� ���� �л��̴ٶ�� ���
			== : �⺻ Ÿ�� (boolean, byte, short, int, long, double, float, char)�� ��� ���� ��
				����Ÿ���� ��� ��ü�� �ּҸ� ���Ѵ�. �迭, ��ü, String(Ư����)
			String: toString(), equals()�� ���� ���ϵ��� ������ �Ǿ��ִ�.
			
		Object�� toString, equals()�� �������ؼ� ���� ����Ѵ�.
			
			toString(): ��ü ��ü�� println(a), ��Ű���̸�.Ŭ�����̸�@�ؽ��ڵ�
				- ���� �������̵��ؼ� ��ü�� �ʵ� ������ ���
			equals(): == �� ����. ��ü�� �ּҸ� ��
				- �������Ͽ� ��ü ���� Ư�� �ʵ��� ���� ��
		*/		
		
		Student1[] array = {s1,s2,s3,s4};
		
		for(int i=0; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])){
					System.out.println(array[i].name+"("+array[i].studentID+") �� "+array[j].name+"("+array[j].studentID+")�� ���� �л��Դϴ�.");
				}
				else {
					System.out.println(array[i].name+"("+array[i].studentID+") �� "+array[j].name+"("+array[j].studentID+")�� �ٸ� �л��Դϴ�.");
				}
			}
		}
		
		E e1 = new E();					//�⺻ ������ ȣ��: Heap���� �ʵ� ���� ���� �ʱ�ȭ�ȴ�.
		System.out.println(e1.name);	//null
		
		E e2 = new E("�����");
		System.out.println(e2.name);
		
		E e3 = new E("�����");
		System.out.println(e2.equals(e3));
		
		System.out.println(e2 == e3);		//����Ÿ��( == ) : ��ü�� �ּҸ� ��
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3));	// Object�� equals(): == ��ü�� �ּҸ� ��
		//Object�� toString(), equals()�� �������Ͽ� ����Ѵ�.
		
	}

}
