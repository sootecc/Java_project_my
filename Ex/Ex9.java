package Ex;

public class Ex9 {

	public static void main(String[] args) {
		
		int[] ran_num = new int[10];
		float sum = 0;
		
		for(int k = 0; k<ran_num.length;k++) {
			int i = (int)(Math.random()*10+1);
			ran_num[k] = i;
		}
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i = 0; i<ran_num.length;i++) {
			System.out.print(ran_num[i]+" ");
			sum+=ran_num[i];
		}
		
		System.out.println("\nÆò±ÕÀº "+sum/ran_num.length);
		
	}

}
