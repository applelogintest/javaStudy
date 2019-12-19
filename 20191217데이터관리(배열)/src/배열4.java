/*
 * 	관련된 내용을 묶어서 사용
 * 
 * 	=> 같은 데이터형 묶어서 한개 이름으로 제어 : 배열
 * 	   ========
 * 	   int[] arr={'A','B'...} => arr[0],arr[1],arr[2]
 * 	   int[] arr=new int[3];  // 나중에 값을 채워넣어도 될 때 , 값이 너무 많을 때 사용
 * 	   double[] arr={10,20,30,40...}
 * 	   String[] arr={"","","",...} => 클래스 (값이 없는 경우:null)
 *	   
 *      	     
 */
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaaaa";
		String b=null; 
		String c="";
		a.length();
		b.length(); // 주소값이 비어있어서 찾아갈수없음 그로인해 Null Pointer Exception 오류 발생
		c.length();

	}

}
