package Ex;

class Student{
	String name;		//�л� �̸�
	int studentID;		//�й�
	int kor;			//���� ����
	int eng;			//���� ����
	int math;			//���� ����
	int sum;			//���� �հ�
	double avg;			//���� ���

	void hobby() {
		System.out.println("�л��� ��̴�"+ "�Դϴ�.");
	}

	@Override
	public String toString() {
		return "�̸�: "+name+", �й�: "+studentID+", ����: "+kor+", ����: "+eng+", ����: "+math+", ���� �հ�: "+sum+", ���: "+avg;
	}
}

class S_ö�� extends Student{
	
	
	S_ö��(){}
	S_ö��(String name, int StudentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		super.sum = kor + eng + math;
		super.avg = (kor + eng + math) / 3.0;
		
	}
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
}
class S_���� extends Student{
	
	S_����(){}
	S_����(String name, int StudentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		super.sum = kor + eng + math;
		super.avg = (kor + eng + math) / 3.0;
		
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� ���ǵ���Դϴ�.");
	}
}

class S_���� extends Student{
	
	S_����(){}
	S_����(String name, int StudentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		super.sum = kor + eng + math;
		super.avg = (kor + eng + math) / 3.0;
		
	}
	@Override
	void hobby() {
	System.out.println("������ ��̴� å�б��Դϴ�.");
	}
}



public class Quiz03 {

	public static void main(String[] args) {
		
		Student one = new S_ö��("ö��",1111,20,30,40);
		Student two = new S_����("����",2222,50,36,44);
		Student three = new S_����("����",3333,73,57,98);
		
		Student[] arr = {one, two, three};
		
		for(Student k : arr) {
			System.out.println(k);
			k.hobby();
			System.out.println("=======================");
		}
		
		
	}

}
