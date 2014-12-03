import java.util.Scanner;

public class TestEnumeration{	
	enum Status { WIND, FIRE, RAIN };
	static Status weatherStatus;

	public static void main(String[] args) {		
		Scanner key = new Scanner(System.in);
		System.out.print("Please enter a day number: ");
		int day = key.nextInt();

		switch(day % 3){
			case 0:
				weatherStatus = Status.WIND;
			break;
			case 1:
				weatherStatus = Status.FIRE;
			break;
			case 2:
				weatherStatus = Status.RAIN;
			break;
			default:
		}

		if(weatherStatus == Status.WIND){
			System.out.println("It's windly");
		}else if(weatherStatus == Status.FIRE){
			System.out.println("It's fire");
		}else if(weatherStatus == Status.RAIN){
			System.out.println("It's rainly");
		}else{

		}
	}
}
