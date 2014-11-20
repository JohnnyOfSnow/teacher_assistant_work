public class random{
	public static void main(String[] args) {
		int randomNumber = 1 + (int)(Math.random()*50);
		int randomNumberByMode = randomNumber % 4;

		switch(randomNumberByMode){
			case 0:
					System.out.println("Zero: pineapple ,and your random number is: " + randomNumber);
			break;
			case 1:
					System.out.println("One: apple ,and your random number is: " + randomNumber);
			break;
			case 2:
					System.out.println("Two: watermelon ,and your random number is: " + randomNumber);
			break;
			case 3:
					System.out.println("Three: peach ,and your random number is: " + randomNumber);
			break;
			default:
					System.out.println("Error ,and your random number is: " + randomNumber);			
		}
	}
}
