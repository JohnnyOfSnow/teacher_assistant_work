public class whatTimeGrowRice{
	static int riceDay = 0;
	static int time = 2;
	enum Status {GOOD,BAD,CONT};
	public static void main(String[] args){
		printHow();
		try{
			System.in.read();
		}
		catch(Exception e){
		}
		
		
		Status godWill;
		
		int result = rollFourDice();
		System.out.println("第1次投擲 " + result + "點");
		switch(result){
			case 5:
			case 9:
				godWill = Status.GOOD;
				riceDay = 1;
			break;
			case 11:
			case 17:
				godWill = Status.BAD;
				riceDay = 0;
			break;
			default:
				godWill = Status.CONT;
				riceDay = 5;
				System.out.println("種稻日加5天");
		}

		while(godWill == Status.CONT){
			result = rollFourDice();
			if(result % 2 == 1){
				godWill = Status.CONT;
				riceDay = riceDay + 3;
				System.out.println("第" + time + "次投擲，投擲點數為" + result + "點");
				System.out.println("種稻日加3天");
			}else{
				System.out.println("第" + time + "次投擲，投擲點數為" + result + "點");
				godWill = Status.GOOD;
			}
			time = time + 1;
		}
		
		if(godWill == Status.GOOD){
			System.out.println("今年農民們經由投骰子的方式決定種稻日");
			System.out.println("決定於今天後 " + riceDay + " 天");
		}else{
			System.out.println("今年農民們經由投骰子的方式決定種稻日");
			System.out.println("但是今年不宜種稻。");
		}
	}

	static int rollFourDice(){
		int r1 = (int)(Math.random() * 6) + 1;
		int r2 = (int)(Math.random() * 6) + 1;
		int r3 = (int)(Math.random() * 6) + 1;
		int r4 = (int)(Math.random() * 6) + 1;
		return r1 + r2 + r3 + r4;
	}

	
	static void printHow(){
		System.out.println("*************************************************");
		System.out.println("*        這是一個決定種稻日的程式               *");
		System.out.println("*   農民透過擲4顆骰子的方式得到種稻日           *");
		System.out.println("*第1次投到5 9 1天後即可種稻                     *");
		System.out.println("*     投到11  17 今天不宜種稻                   *");
		System.out.println("*     其餘點數先加種稻日5天，接著繼續骰         *");
		System.out.println("*如果骰到奇數點種稻日+3天，然後繼續骰，直到偶數點*");
		System.out.println("*************************************************");
	}



}
