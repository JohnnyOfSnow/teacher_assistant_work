import java.util.Scanner;

public class ThreeNumberAdd{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.print("Please enter the first number: "); 
		int num1 = scan.nextInt();
		System.err.print("Please enter the second number: ");
		int num2 = scan.nextInt();
		System.err.print("Please enter the final number: ");
		int num3 = scan.nextInt();

		System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + ThreeAdd(num1,num2,num3));
		System.err.print("請去打開你執行程式時指定的檔案");

	}

	static int ThreeAdd(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
}
