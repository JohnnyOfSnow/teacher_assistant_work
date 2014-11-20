import java.util.Scanner;
public class TestFlog{
	public static void main(String[] para){

		printBegin();
		try{
			System.in.read();
		}
		catch(Exception e){
		}

		Scanner input = new Scanner(System.in);
		System.out.print("請輸入池中有多少隻蛤膜: ");
		int amount = input.nextInt();

		for(int i = 1; i <= amount; i++){
			System.out.printf("%d %s %d %s\n",i,"隻蛤膜",i,"張嘴");
			System.out.printf("%d %s %d %s\n",i*2,"個眼睛",i*4,"條腿");
			System.out.printf("%s\n","撲通撲通跳下水");
			System.out.printf("%s\n","蛤膜不吃水 太平年");
		}
		System.out.print("-------------------------------");	
		System.out.print("池中總共有 " + amount + "隻蛤膜");
		
		

	}


	static void printBegin(){
		System.out.println("*****************************");
		System.out.println("*          程式目的         *");
		System.out.println("*  為了迴圈所寫的程式範例   *");
		System.out.println("*****************************");
		System.out.println("*    請按enter鍵繼續程式    *");
		System.out.println("*****************************");	
	}

}
