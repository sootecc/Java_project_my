package Ex;
	
public class Ex10_1 {
	
	public static void main(String[] args) {
		
		int count_ten = 0;
		int count_one = 0;
		
		for (int i = 1; i<100; i++) {
			count_ten = i / 10;
			count_one = i % 10;
			
			if((count_ten == 3||count_ten == 6||count_ten == 9)&&(count_one == 3||count_one == 6||count_one == 9)) {
				System.out.println(i + " :¹Ú¼ö Â¦Â¦");
			}
			else if((count_ten == 3||count_ten == 6||count_ten == 9)&&(count_one != 3||count_one != 6||count_one != 9)){
				System.out.println(i + " :¹Ú¼ö Â¦");
			}
			else if((count_ten != 3||count_ten != 6||count_ten != 9)&&(count_one == 3||count_one == 6||count_one == 9)){
				System.out.println(i + " :¹Ú¼ö Â¦");
			}
		
		
		}
		
		
		
		
	}
}
