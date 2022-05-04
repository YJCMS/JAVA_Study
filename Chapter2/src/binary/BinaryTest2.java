package binary;

public class BinaryTest2 {
	public static void main(String[] args) {
		
		// 음수를 구하는 법 = 1의 보수를 구한다음 1을 더해준다
		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		
		int sum = num1 + num2; 
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}
}
