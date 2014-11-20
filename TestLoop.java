import java.util.Scanner;
public class TestLoop{
	public static void main(String[] para){
		printBegin();
		try{
			System.in.read();
		}
		catch(Exception e){
		}
		printHow();

		//You should write your code from this row.

		Scanner input = new Scanner(System.in);
		System.out.println("某人數到第幾隻羊會醒過來?");
		System.out.print("請輸入: ");
		int sheep = input.nextInt();
		System.out.println("你想讓某人用哪個迴圈數羊? 輸入1 for loop 輸入2 while loop 輸入3 do while");
		int choice = input.nextInt();
		Loop myLoop = new Loop(sheep);
		
		switch(choice){
			case 1:
				myLoop.ForLoopCountSheep();
			break;
			case 2:
				myLoop.WhileLoopCountSheep();
			break;
			case 3:
				myLoop.DoWhileLoopCountSheep();
			break;
			default:
				System.out.println("error!!");
		}

	
		//You should end your code.

	}

	static void printBegin(){
		System.out.println("*****************************");
		System.out.println("*         程式目的          *");
		System.out.println("*  為了練習迴圈所寫的程式   *");
		System.out.println("*****************************");
		System.out.println("*    請按enter鍵繼續程式    *");
		System.out.println("*****************************");	
	}

	static void printHow(){
		System.out.println("*************************************************");
		System.out.println("*        這是一個數羊的程式                     *");
		System.out.println("*使用者須輸入某人數到第幾隻羊會醒過來           *");
		System.out.println("*然後再輸入1個數字，選擇數羊要用哪個方法數      *");
		System.out.println("*輸入1 請建一個物件呼叫用For loop數羊的方法     *");
		System.out.println("*輸入2 請建一個物件呼叫用While loop數羊的方法   *");
		System.out.println("*輸入3 請建一個物件呼叫用do While loop數羊的方法*");
		System.out.println("*************************************************");
	}
}
class Loop{
	int sheep = 0;

	Loop(){

	}

	Loop(int newSheep){
		sheep = newSheep; // By means of creating an object, it invokes this constructor to set sheep's value.
	}

	void ForLoopCountSheep(){
		// You shold write for loop.
		for(int j = 1; j <= sheep; j++){
			System.out.printf("%d%s\n",j,"隻羊");
		}

		Result();
	}

	void WhileLoopCountSheep(){
		// You shold write while loop.
		int j = 1;
		while(j <= sheep){
			System.out.printf("%d%s\n",j,"隻羊");
			j++;
		}

		Result();
	}

	void DoWhileLoopCountSheep(){
		// You shold write do while loop.
		int j = 1;
		do{
			
			System.out.printf("%d%s\n",j,"隻羊");
			j++;
		}while(j <= sheep);

		Result();

	}

	void Result(){
		System.out.println("------------------------------------------------------");
		System.out.printf("%s%d%s\n","某人因為數了",sheep,"隻羊因此從詛咒中而醒了");

	}	
}
