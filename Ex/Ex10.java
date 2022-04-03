package Ex;
	
public class Ex10 {
	
	public static void main(String[] args) {
		
		int count_ten = 0;
		int count_one = 0;
		int i_copy = 0;
		
		for (int i =1; i<100; i++) {
			count_ten = 0;
			count_one = 0;
			i_copy = i;
			
			while(true) {
				if(i_copy>=10) {
					count_ten =i_copy / 10;
					i_copy = i_copy - count_ten*10;
				}
				else if(i_copy>=1) {
					count_one = i_copy;
					i_copy = 0;
				}
				else {
					break;
				}	
			}
			System.out.print(i+" ¹Ú¼ö ");
			if(count_ten==3 || count_ten==6||count_ten==9) {
				System.out.print("Â¦");
			}
			if(count_one==3 || count_one==6||count_one==9) {
				System.out.print("Â¦");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
