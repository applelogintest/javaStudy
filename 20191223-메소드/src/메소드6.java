import java.util.Scanner;
public class 메소드6 {
	//난수 발생
	static int[] getRand(int no)
	{
		int[] com = new int[no];
		int su=0;
		boolean bCheck = false;
		for(int i=0; i<com.length; i++)
		{
			bCheck = true;
			while(bCheck)
			{
				bCheck = false;
				su = (int)(Math.random()*9)+1;
				for(int j=0; j<i; j++)
				{
					if(com[j] == su)
					{
						bCheck = true;
						break;
					}
				}
			}
			com[i] = su;
			
		}
		
		return com; 
	}
	//사용자 입력
	static int[] setUser()
	{
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("3자리 정수를 입력해주세요(1~9) :");
			int input = scan.nextInt();
			if(input>1000 || input < 0 )
			{
				System.out.println("잘못된 입력입니다!");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1] == user[2] || user[0] == user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			
			if(user[0]==0 || user[1] == 0 || user[2] == 0)
			{
				System.out.println("0은 사용할 수 업습니다");
				continue;
			}
			break;
		}
		return user;
	}
	//비교
	static int compare(int[] com, int[] user)
	{
		int s=0,b=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				
				if(com[i] == user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		hint(user,s,b);
		return s;
		
	}
	//힌트
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number :%d%d%d, Result: %dS-%dB\n",user[0],user[1],user[2],s,b);
	}
	//종료여부
	static boolean isEnd(int s)
	{
		boolean bCheck = false;
		if(s==3)
		{
			bCheck = true;
		}
		return bCheck;
	}
	
	//조립
	static void process()
	{
		int[] com = getRand(5);
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			int[] user = setUser();
			int s = compare(com,user);
			if(isEnd(s))
			{
				System.out.print("종료할까요 (y|n)?");
				String data = scan.next();
				if(data.equals("y"))
				{
					System.out.println("Game Over!!");
					System.exit(0);
				}
				else
				{
					System.out.println("새 게임이 시작되었습니다!!");
					process(); //재귀 호출
				}
			}
			
		
		}
	}
	
	static String start()
	{
		return "게임을 시작합니다";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(start());
		String s=start();
		process();
	}

}





