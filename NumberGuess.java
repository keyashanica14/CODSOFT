import java.util.*;

class NumberGuess{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int chance=10;
		
		boolean play = true; 
		System.out.println();
		System.out.println("WELCOME TO THE NUMBER GUESSING GAME !");
		System.out.println();
		System.out.println(" YOU HAVE 10 CHANCES TO FIND THE NUMBER");
		System.out.println();
		System.out.println("LET'S GET STARTED");
		System.out.println();
		while(play){
			boolean guess = false;
			int min = 1; 
			int max = 100; 
			int num = (int) (Math.random() * (max - min + 1)) + min;
			
			for (int i=1;i<=chance;i++){
				System.out.println("ENTER YOUR GUESS ");
				System.out.println("CHANCE "+i);
				int ans = sc.nextInt();

				if(ans==num){
					guess = true;
					System.out.println();
					System.out.println("YOU GOT IT....YAY!!!");
					System.out.println();
					System.out.println("YOUR SCORE IS : "+(100-(i*10)) + "/100");
					
					break;
				}

				else if(ans>num){
					System.out.println("OOPS ! TOO HIGH, GUESS A SMALLER NUMBER");
					System.out.println();
				}

				else{
					System.out.println("OOPS ! TOO LOW, GUESS A GREATER NUMBER");
					System.out.println();
				}

			}

			if (guess==false){
				System.out.println("SORRY YOU LOST THE CHANCES, THE NUMBER WAS "+ num);
			}

			System.out.println("DO YOU WANT TO PLAY AGAIN ?");
			System.out.println("ENTER Y FOR YES AND N FOR NO...");

			String playagain = sc.next();

			play= playagain.equalsIgnoreCase("y");
			
		}
		System.out.println();
		System.out.println("HOPE YOU ENJOYED IT...SEE YOU SOON !!");


	}
}