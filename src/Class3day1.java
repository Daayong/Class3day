
public class Class3day1 {

	public static void main(String [] args) {
		System.out.println("===Test1 Start===");
		
		boolean check = true;
		
		System.out.println(check);
		
		check = !check;
		
		if(!check) {
			System.out.println("Test");
		}
		
		int age = 30;
		
		//조건식 ? true일 때 실행 : false 일 때 실행
		String result = age > 19 ? "성년" : "미성년";
		System.out.println("Result : "+result);
		
		System.out.println(1+"1");
		System.out.println(2*1+"1");
		System.out.println("1"+1+1);
		System.out.println("1"+1*3);
		System.out.println('1'+"1");
		System.out.println(1+'1'+"1"); //중간에 있는 1은 char타입으로 아스키코드 변환시 49 이므로 앞에 1과 더해서 50이 됨  
		
		System.out.println("===Test1 Finish===");
	}
}
