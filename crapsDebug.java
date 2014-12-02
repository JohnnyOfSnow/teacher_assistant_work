import java.util.Random;

public class craps{
	public static void main (String[] args){
		Random r = new Random();
		int a = r.nextInt(6)+1;
		int b = r.nextInt(6)+1;
		int ab = a+b;

		switch (ab) {
			case 2: System.out.println("You rolled " + a + "+" + b + "=" + ab + "  You lose");break;
			case 3: System.out.println("You rolled " + a + "+" + b + "=" + ab + "  You lose");break;
			case 12: System.out.println("You rolled " + a + "+" + b + "=" + ab +"  You lose");break;
			case 7: System.out.println("You rolled " + a + "+" + b + "=" + ab +"  You win");break;
			case 11:System.out.println("You rolled " + a + "+" + b + "=" + ab +"  You win");break;
			default:int p= ab;
				System.out.println("You rolled " + a + "+" + b + "=" + ab);
				do{
					a = r.nextInt(6)+1;
					b = r.nextInt(6)+1;
					ab = a+b;
					System.out.println("You rolled " + a + "+" + b + "=" + ab);
					if(ab == 7)
						 System.out.println("You lose");break;
					if(ab == p)
						 System.out.println("You win");break;
				}while(p != ab);
		}
	}
}
