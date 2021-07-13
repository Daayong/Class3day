import java.util.Scanner;

public class Class3day5 {

	public static void main(String [] args) {
		System.out.println("===Test5 Start===");
		//요금조회는 1번 
		//상품가입은 2번
		//고장신고는 3번
		//상담원연결은 0번
		//그외 번호는 잘못눌렀다 다시 선택하라 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("필요한 서비스 번호를 선택해주세요 1.요금조회 / 2.상품가입 / 3.고장신고 / 0.상담원연결");
		
		int push = sc.nextInt();
		
		switch(push) {
		case 1 :
			System.out.println("요금조회를 선택하셨습니다");
			break;
		case 2 :
			System.out.println("상품가입을 선택하셨습니다");
			break;
		case 3 :
			System.out.println("고장신고를 선택하셨습니다");
			break;
		case 0 :	
			System.out.println("상담원연결을 선택하셨습니다");
			break;
		default :
			int num=10;
			System.out.println("잘못누르셨습니다 다시 입력 바랍니다.");
			break;
		}
		
		if(push>0) {
			int num=20;
		}
		

		System.out.println(push);
		
		System.out.println("===Test5 Finish===");
	}
}
