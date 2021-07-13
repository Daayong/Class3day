
public class Class3day6 {

	public static void main(String [] args) {
		System.out.println("===Test6 Start===");
		
		//평균을 이용해서 A,B,C,D,F
		
		
		int avg = 44;
		
		int result = 0;
		
		if(avg>=90) {
			result = 1;
		}else if(avg>=80) {
			result = 2;
		}else if(avg>=70) {
			result = 3;
		}else if(avg>=60) {
			result=4;
		}else {result=5;}
		
		
		
		switch(result) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		case 5:
			System.out.println("F");
			break;	
		}
		
		
		
		System.out.println("===Test6 Finish===");
	}
	
	
}
