import java.util.*;

public class Store{
	public static void main(String[] args) {
		int greenTea = 0;
		int blackTea = 0;
		int oolongTea = 0;
		int amount = 0;

		System.err.println("歡迎光臨，請問你需要什麼？");
		System.err.println("按1 為綠茶 按2 為紅茶 按3為烏龍茶 結束請按4");

		Scanner scan = new Scanner(System.in);

		String choice = scan.next();

		while(choice.equals("1") || choice.equals("2") || choice.equals("3")){
			switch(choice){
				case "1":
					System.err.print("請輸入您需要幾杯綠茶: ");
					amount = scan.nextInt();
					greenTea = greenTea + amount;
				break;
				case "2":
					System.err.print("請輸入您需要幾杯紅茶: ");
					amount = scan.nextInt();
					blackTea = blackTea + amount;
				break;
				case "3":
					System.err.print("請輸入您需要幾杯烏龍茶: ");
					amount = scan.nextInt();
					oolongTea = oolongTea + amount;
				break;

				default:
					System.err.print("Error!");
			}
			System.err.println("還需要什麼嗎? 按1 為綠茶 按2 為紅茶 按3為烏龍茶 結束請按4");
			choice = scan.next();
		}

		if(greenTea != 0 || blackTea != 0 || oolongTea != 0){
			System.err.println("謝謝您的光臨");
			System.err.println("發票在這");
			Date myDate = new Date();
			System.out.println("楓之飲料城 " + "消費日期: " + myDate.toString());
			System.out.println("-----------------------------------------------------");
			System.out.println("以下是你的消費收據");
			if(greenTea != 0){
				System.out.println("綠茶 " + greenTea + "杯 共 " + greenTea * 30 + "元");
			}
			if(blackTea != 0){
				System.out.println("紅茶 " + blackTea + "杯 共 " + blackTea * 25 + "元");
			}
			if(oolongTea != 0){
				System.out.println("烏龍茶 " + oolongTea + "杯 共 " + oolongTea *35 + "元");
			}
			System.out.println("-------------------------------------------------------");
			System.out.println("付清 " + (greenTea * 30 + blackTea * 25 + oolongTea *35) + "元");
			System.out.println("收銀: 雪原之箭");
		}

	}
}
