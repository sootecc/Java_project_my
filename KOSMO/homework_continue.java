package KOSMO;

public class homework_continue {

	public static void main(String[] args) {
	
	//continue를 사용해서 1단 ~ 19단 중 3배수단만 출력
		
		for(int i=1;i<20;i++) {
			
			if(i%3==0) {System.out.println("====="+i+"단=====");
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

