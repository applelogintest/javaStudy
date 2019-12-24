import java.util.Scanner;

// year을 입력을 받아서 => 윤년여부 확인
// int 0,1 => boolean
/*
 * 	final LOGIN = 100;
 * 	네트워크
 * 		100|id|pwd => 로그인 (앞에 스트링을 사용하는게 보기 편하나 속도가 느려져서 따로 상수로 선언하여 숫자로 사용한다) 
 * 	  (LOGIN)  
 */
// void 
public class 메소드3 {
	static void isYear(int year)
	{
		if((year%4 == 0 && year%100 != 0)|| year%400 == 0)
		{
			System.out.println(year+"년도는 윤년 입니다.");
		}
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	
	static boolean isYear2(int year)
	{
		if((year%4 == 0 && year%100 != 0)|| year%400 == 0)
		{
			return true;
		}
		else
			return false;
	}
	
	static int input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력해주세요 :");
		int year = scan.nextInt();
		return year;
	}
	static void process()
	{
		isYear(input());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int year=2019; isYear(year); boolean bCheck = isYear2(year);
		 * 
		 * if(bCheck) System.out.println("윤년 입니다"); else System.out.println("윤년 아닙니다");
		 */
		process();
	}

}
