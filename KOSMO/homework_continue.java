package KOSMO;

public class homework_continue {

	public static void main(String[] args) {
	
	//continue�� ����ؼ� 1�� ~ 19�� �� 3����ܸ� ���
		
		for(int i=1;i<20;i++) {
			
			if(i%3==0) {System.out.println("====="+i+"��=====");
				for(int j=1;j<20;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
				}
			}
			else{
				continue;
				}
			}
		}
	
	}

