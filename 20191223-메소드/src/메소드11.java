import java.util.Scanner;

// 정수 입력 => 출력
/*
 * 입력
 * 출력
 * ===
 * 조립
 * 
 */
public class 메소드11 {
	static int input()
	{
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}
	
	static void output(int input)
	{
		System.out.println(input);
	}
	
	static void process()
	{
		int input = input();
		output(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
