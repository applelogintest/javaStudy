/*
 * 		�޼ҵ�
 * 		= �Ű����� (����� ��û��) => ���� ==> ������(�Ű�����)
 * 			movieId=135716
 * 			movieDetail(int movieId)
 * 
 * 		= ������ => ��û���뿡 ���� ����� ���� ====> �Ѱ�(������ ������ => ���)
 * 				 ==================
 * 				      �⺻��, �迭, Ŭ����
 * 		=======================================================
 * 		  ����)
 * 			������ �޼ҵ��(�Ű�����,...) => �����
 * 			{
 * 				==> ������
 * 				return �����    ====> (������ = �����)
 * 					   ====   			  ====== ���� ���������� ��� �� �� �ִ�
 * 			}
 * 
 * 			int aaa()
 * 			{
 * 				return (int,char,byte,short) ���� (������ ���� ���ִ°��� ����) 
 * 			}
 * 
 * 			********ȣ��
 *  			int a = aaa();
 * 
 * 			==> return ������ �Ǵ� ��� ==> ������ (void �϶�)
 * 
 * 			�迭
 * 			int[] aaa()
 * 			{
 * 				return �迭��;
 * 			}
 * 			int[] arr=aaa();
 * 			double[] arr=aaa(); (����) 			
 *  		
 * 			Ŭ����
 * 			String aaa()
 * 			{
 * 				return "";(���ڿ�)
 * 			}
 * 			String s=aaa();
 * 
 * 
 * 			������� ���� ���
 * 			void aaa()
 * 			{
 * 				return;(���� ����)
 * 			}
 * 			aaa();
 * 
 * 
 * 			�Ű������� �ִ� ���
 * 			int plus(int a, int b)
 * 			===      ============
 * 			{
 * 				a=10,b=30
 * 				return a+b;
 * 				===========   �߿�(����)
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
 * 			aaa(); => 1234567 ===> �ݺ��� ����
 * 
 * 			1234567 (�޼ҵ��� ����)
 * 			780
 * 			345
 * 			1234567 (ȣ�� �ϸ��)
 * 			70
 * 			90
 * 			1234567
 * 
 * 			��� ==> �ݵ�� ������ ����
 * 			
 * 			1 5 7 4 3 2 1 2 8 9
 *  		=================== (������ ��� ��� ��� �ϱ� ����)
 *  		
 *  		1 232 43434 434 3434 4 34 34 34343434 ==> �迭�� �����ش�. (���� ���������� 3�� �̻��̸� ���)
 *  	
 *  		113 "aaa" "aadad" 0.9 10.2F 10L 'A' ==> Ŭ������ �����ش�.(���������� �ٸ��� 3�� �̻��̸� ���) 
 */
public class �޼ҵ�1 {
	String name;
	static void message()
	{
		System.out.println("Hello Java!!");
		return; // ������ �Ǹ� ==> JVM�� �ڵ����� �ڵ��� ���ش�.
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
		//ȣ�� ===> �����, �Ű�����
		
	}

}
