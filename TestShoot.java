import java.util.Scanner;

public class TestShoot{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("要開始遊戲嗎? 要開始請輸入1 要結束輸入0");
		System.out.print("你的選擇是:");
		int choice = input.nextInt();
		int ranX = 0;
		int ranY = 0;
		int sc = 0;

		while(choice == 1){
			System.out.print("請輸入你這一局想要丟幾個飛鏢:");
			int how = input.nextInt();
		
			while(how > 0){
				ranX = ((int)(Math.random()*41)) - 20;
				ranY = ((int)(Math.random()*41)) - 20;
				Shoot a = new Shoot(ranX,ranY);
				System.out.println("你的飛鏢射中(" + ranX + "," + ranY + ")這點");
				switch(a.TwoPointDistance()){
					case 0:
						System.out.println("你這鏢得了 10 分");
						sc = sc + 10;
					break;
					case 1:
						System.out.println("你這鏢得了 9 分");
						sc = sc + 9;
					break;
					case 2:
						System.out.println("你這鏢得了 8 分");
						sc = sc + 8;
					break;
					case 3:
						System.out.println("你這鏢得了 7 分");
						sc = sc + 7;
					break;
					case 4:
						System.out.println("你這鏢得了 6 分");
						sc = sc + 6;
					break;
					case 5:
						System.out.println("你這鏢得了 5 分");
						sc = sc + 5;
					break;
					case 6:
						System.out.println("你這鏢得了 4 分");
						sc = sc + 4;
					break;
					case 7:
						System.out.println("你這鏢得了 3 分");
						sc = sc + 3;
					break;
					case 8:
						System.out.println("你這鏢得了 2 分");
						sc = sc + 2;
					break;
					case 9:
						System.out.println("你這鏢得了 1 分");
						sc = sc + 1;
					break;
					default:
						System.out.println("你這鏢沒得分");
				}// end switch
				System.out.println("-----------------------------");
				how = how - 1;
			}// end while
			System.out.println("**************************************");
			System.out.println("你這局結束後，你的分數為: " + sc + "分");
			System.out.println("**************************************");
			System.out.println("");
			System.out.println("還要繼續玩嗎? 要玩請輸入1 不完請輸入0");
			System.out.print("你的最後選擇是:");
			choice = input.nextInt();
		}// end while
	}
}

class Shoot{

	int xLocation = 0;
	int yLocation = 0;
	int reX = 0;
	int reY = 0;
	int distance = 0;

	Shoot(){


	}

	Shoot(int xNewLocation, int yNewLocation){
		xLocation = xNewLocation;
		yLocation = yNewLocation;
	}

	int TwoPointDistance(){
		distance = (int)Math.ceil(Math.pow(Math.pow(xLocation - reX,2) + Math.pow(yLocation - reY,2),0.5));
		return distance;
	}



}
