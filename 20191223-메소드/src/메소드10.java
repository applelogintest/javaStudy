import java.util.Scanner;

// ���� ���� ���� ������ �޾Ƽ� 
// ���� , ���, ����
/*
 *  1. �Է�
 *  2. ����
 * 	3. ���
 * 	4. ����
 *  5. ���
 *  
 */
public class �޼ҵ�10 {
	//�Է�
	static int[] jumsu()
	{
		Scanner scan = new Scanner(System.in);
		int[] jumsu = new int[3];
		String[] msg = {"����","����","����"};
		for(int i=0; i<msg.length; i++)
		{
			System.out.print(msg[i]+" ���� �Է�:");
			jumsu[i] = scan.nextInt();
			
		}
		
		return jumsu;
	}
	
	//����
	static int total(int[] jumsu)
	{
		int total = 0;
		for(int i=0; i<jumsu.length; i++)
		{
			total += jumsu[i];
		}
		return total;
	}
	
	//��� 
	static double avg(int total)
	{
		return total/3.0;
	}
	//����
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
		System.out.println("����\t����\t����\t���\t����\t����\t");
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
