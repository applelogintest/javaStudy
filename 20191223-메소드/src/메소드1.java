/*
 * 		메소드
 * 		= 매개변수 (사용자 요청값) => 행위 ==> 여러개(매개변수)
 * 			movieId=135716
 * 			movieDetail(int movieId)
 * 
 * 		= 리턴형 => 요청내용에 대한 결과값 전송 ====> 한개(데이터 여러개 => 묶어서)
 * 				 ==================
 * 				      기본형, 배열, 클래스
 * 		=======================================================
 * 		  형식)
 * 			리턴형 메소드명(매개변수,...) => 선언부
 * 			{
 * 				==> 구현부
 * 				return 결과값    ====> (리턴형 = 결과값)
 * 					   ====   			  ====== 작은 데이터형을 사용 할 수 있다
 * 			}
 * 
 * 			int aaa()
 * 			{
 * 				return (int,char,byte,short) 가능 (하지만 같게 해주는것이 좋다) 
 * 			}
 * 
 * 			********호출
 *  			int a = aaa();
 * 
 * 			==> return 생략이 되는 경우 ==> 리턴형 (void 일때)
 * 
 * 			배열
 * 			int[] aaa()
 * 			{
 * 				return 배열명;
 * 			}
 * 			int[] arr=aaa();
 * 			double[] arr=aaa(); (가능) 			
 *  		
 * 			클래스
 * 			String aaa()
 * 			{
 * 				return "";(문자열)
 * 			}
 * 			String s=aaa();
 * 
 * 
 * 			결과값이 없는 경우
 * 			void aaa()
 * 			{
 * 				return;(생략 가능)
 * 			}
 * 			aaa();
 * 
 * 
 * 			매개변수가 있는 경우
 * 			int plus(int a, int b)
 * 			===      ============
 * 			{
 * 				a=10,b=30
 * 				return a+b;
 * 				===========   중요(밑줄)
 * 			}
 * 
 * 			int a = plus(10,30)
 * 			
 * 			void aaa()
 * 			{
 * 				=== 1
 * 				=== 2
 * 				=== 3
 * 				=== 4 
 * 				=== 5
 * 				=== 6
 * 				=== 7
 * 			}
 * 
 * 			aaa(); => 1234567
 * 			aaa(); => 1234567 ===> 반복과 관련
 * 
 * 			1234567 (메소드의 편리성)
 * 			780
 * 			345
 * 			1234567 (호출 하면됨)
 * 			70
 * 			90
 * 			1234567
 * 
 * 			제어문 ==> 반드시 패턴이 존재
 * 			
 * 			1 5 7 4 3 2 1 2 8 9
 *  		=================== (패턴이 없어서 제어문 사용 하기 힘듬)
 *  		
 *  		1 232 43434 434 3434 4 34 34 34343434 ==> 배열로 묶어준다. (같은 데이터형이 3개 이상이면 고려)
 *  	
 *  		113 "aaa" "aadad" 0.9 10.2F 10L 'A' ==> 클래스로 묶어준다.(데이터형이 다른게 3개 이상이면 고려) 
 */
public class 메소드1 {
	String name;
	static void message()
	{
		System.out.println("Hello Java!!");
		return; // 생략이 되면 ==> JVM이 자동으로 코딩을 해준다.
	}
	
	static int aaa()
	{
		return 10;
	}
	
	static double bbb()
	{
		return 10.5;
	}
	
	static String ccc()
	{
		return "Hello Java";
		
	}
	
	static int[] ddd()
	{
		int[] arr = {1,2,3,4,5};
		return arr;
	}
	
	static int eee(int a)
	{
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message();
		int a = aaa();
		double d = bbb();
		String s = ccc();
		int[] arr = ddd();
		int aa = eee(10);
		//호출 ===> 결과값, 매개변수
		
	}

}
