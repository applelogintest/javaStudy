/*
 * 	메소드의 목적
 * 	=========
 * 		1. 재사용 (기능별 한개의 기능만 수행 가능)
 * 		2. 반복사용 
 */
public class 메소드5 {
	static int a;
	static void star()
	{
		System.out.println("★");
		System.out.println("★★");
		System.out.println("★★★");
		System.out.println("★★★★");
		a=1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
		{
			star();
		}
		System.out.println(a);
	}

}
