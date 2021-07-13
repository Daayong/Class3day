import java.util.Scanner;

public class Class3day2 {

	public static void main(String[] args) {
		System.out.println("===Test2 Start===");
		
		Scanner sc = new Scanner(System.in);
		
		int select = sc.nextInt(); 
		
		if(select==1) {
			System.out.println("입금");
		}else if(select==2) {
			System.out.println("출금");
		}else if(select==3) {
			System.out.println("이체");
		}else {
			System.out.println("조회");
		}
		
		
		System.out.println("===Test2 Finish===");
	}
}
