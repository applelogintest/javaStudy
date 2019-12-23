import java.util.Scanner;

// 국어 영어 수학 점수를 받아서 
// 총점 , 평균, 학점
/*
 *  1. 입력
 *  2. 총점
 * 	3. 평균
 * 	4. 학점
 *  5. 출력
 *  
 */
public class 메소드10 {
	//입력
	static int[] jumsu()
	{
		Scanner scan = new Scanner(System.in);
		int[] jumsu = new int[3];
		String[] msg = {"국어","영어","수학"};
		for(int i=0; i<msg.length; i++)
		{
			System.out.print(msg[i]+" 점수 입력:");
			jumsu[i] = scan.nextInt();
			
		}
		
		return jumsu;
	}
	
	//총점
	static int total(int[] jumsu)
	{
		int total = 0;
		for(int i=0; i<jumsu.length; i++)
		{
			total += jumsu[i];
		}
		return total;
	}
	
	//평균 
	static double avg(int total)
	{
		return total/3.0;
	}
	//학점
	static char score(double avg)
	{
		char score;
		switch((int)(avg/10))
		{
		case 10:
		case 9:
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
			
		default :
			score = 'F';
		}
		return score;
	}
	
	static void print(int[] jumsu, int total, double avg, char score)
	{
		System.out.println("국어\t영어\t수학\t평균\t총점\t학점\t");
		for(int i:jumsu)
		{
			System.out.printf(i+"\t");
		}
		System.out.printf("%.1f\t%d\t %c",avg,total,score);
		
	}
	static void process()
	{
		int[] jumsu = jumsu();
		int total = total(jumsu);
		double avg = avg(total);
		char score = score(avg);
		print(jumsu,total,avg,score);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
