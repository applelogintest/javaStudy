import java.util.Scanner;

// year�� �Է��� �޾Ƽ� => ���⿩�� Ȯ��
// int 0,1 => boolean
/*
 * 	final LOGIN = 100;
 * 	��Ʈ��ũ
 * 		100|id|pwd => �α��� (�տ� ��Ʈ���� ����ϴ°� ���� ���ϳ� �ӵ��� �������� ���� ����� �����Ͽ� ���ڷ� ����Ѵ�) 
 * 	  (LOGIN)  
 */
// void 
public class �޼ҵ�3 {
	static void isYear(int year)
	{
		if((year%4 == 0 && year%100 != 0)|| year%400 == 0)
		{
			System.out.println(year+"�⵵�� ���� �Դϴ�.");
		}
		else
			System.out.println(year+"�⵵�� ������ �ƴմϴ�.");
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
		System.out.print("�⵵�� �Է����ּ��� :");
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
		 * if(bCheck) System.out.println("���� �Դϴ�"); else System.out.println("���� �ƴմϴ�");
		 */
		process();
	}

}
