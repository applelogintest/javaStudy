import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*	
 * 	1. ��� ���
 * 		�迭 ===> Ŭ���� ===> ��Ű�� ===> ���̺귯�� (jar)
 * 		===
 * 		
 * 		���α׷�
 * 		 ������ + ��ɹ� (�޼ҵ�) => Ŭ����
 * 		===========
 * 		Ŭ���� ������ ======> ���� (�ڹ� CBD)
 * 	
 * 	2. �ڹ� ===> ����Ŭ ===> HTML(CSS,JavaScript) ===> JSP ===> MVC ===> Spring 
 *  	  				===============================    ================
 *  						       Front						 Back
 *  	  ===> kotlin(�����)
 *  	  ====================> ��,��
 *  
 *  �迭 ���� : ������ ===> ������ (ArrayList Class) ===> ���� ���������� ��Ƽ� ���
 *  ======
 *  ����� => �޸� ũ�� ����
 *  ==================
 *  1) ���� 
 *  	int[] arr;
 *      ===	  === �迭�� (���� ����� �������� �ּ�)
 *      ��������
 *  2) �ʱ�ȭ (���������� �ʱ�ȭ�� ������������ ����)
 *  	arr={1,2,3,4,5};
 *  	arr = new int[5]; => �޸� ���� �Ҵ� ==> ���߿� �����͸� ����
 *  3) ���� �б�, ���� ==> �ε���
 *  	int[] arr = {10,20,30,40,50};
 *  			   �Ϲݺ����� ����
 *  			  int a=10; a=11......
 *  	arr		 arr[0] arr[1] ....... ������ ==> for
 *  			 arr[0] = 10; ,arr[0]=20;
 *     ======	==============================
 *      100	 	    10   20   30   40   50
 *     ======  |==============================
 *     		  100
 */
// �޷�
/*
 * 	�޷�
 * 	===
 * 	 1) �⵵, ���� �Է¹޴´�.
 * 	 2) ����
 * 	 3) ��������
 * 	 4) ��� 
 */
import java.text.*;
public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/*
		 * while(true) { Date date = new Date(); SimpleDateFormat sdf = new
		 * SimpleDateFormat("hh:mm:dd"); System.out.println(sdf.format(date)); try {
		 * Thread.sleep(1000); }catch(Exception ex) {} }
		 */
		//�⵵ , ��
		char[] strWeek = {'��','��','ȭ','��','��','��','��'};
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		int w = cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== " + y+"�⵵"+m+"��"+d+"��"+strWeek[w-1]+"���� ======");
		int year,month;
		
		System.out.print("�⵵ �Է�:");
		year = scan.nextInt();
		System.out.print("�� �Է�:");
		month = scan.nextInt();
		
		System.out.println(year + "�� "+ month + "��");
		System.out.println("\n");
		
		
		for(int i=0; i<strWeek.length; i++)
		{
			System.out.print(strWeek[i] + "\t");
		}
		
		//1������ ������ ���Ѵ�
		// ���⵵�� 12/31 => ����
		int total = (year-1)*365+(year/4)-(year/100)+(year/400);
		// ����
		int[] lastDay = {31,28,31,30,31,30, 
				 		 31,31,30,31,30,31};
		if((year%4==0 && year%100 != 0 )||(year%400==0))
		{
			lastDay[1] = 29;
		}
		else 
			lastDay[1] = 28;
		
		for(int i=0; i<month-1; i++)
		{
			total += lastDay[i];
		}
		// +1
		total++; // ������ 1����
		
		int week = total%7;
	
		
		System.out.println();
		for(int i=1; i<=lastDay[month-1]; i++)
		{
			if(i==1)
			{
				for(int j=0; j<week; j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6)
			{
				week = 0;
				System.out.println();
			}
		}
		
		
	}

}
