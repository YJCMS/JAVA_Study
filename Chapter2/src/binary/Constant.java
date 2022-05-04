package binary;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final float PI = 3.14F;
		
		// PI = 3.15F;  final로 상수로 만들었기 떄문에 값을 변경할 수 없어서 오류
		
		
		// 상수를 이용하면 코드를 수정하는 것이 편함 
		final int STUDENT_NUM = 30;
		
		int num = 0;
		if ( num == STUDENT_NUM ) {
			
		}
		System.out.println(STUDENT_NUM);
	}

}
