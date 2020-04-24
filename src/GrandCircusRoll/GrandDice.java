package GrandCircusRoll;

import java.util.Scanner;


public class GrandDice {
	
			public static void main(String[] args) {

				Scanner scnr = new Scanner (System.in);

				System.out.println("Welcome to Grand Circus Casino!\nWhere you too can become a millionaire!");

				System.out.println("");

				boolean shouldContinue = true;//boolean original true
				while(shouldContinue) {
				
					int cnt=0;
					shouldContinue = true;//boolean reinteated as true
					
					while(shouldContinue)//boolean while true adds cnt of one rotation or itteration
					{
						cnt+=1;
			
					System.out.println("How many sides would you like your two dice to have?");

					int diceSides = scnr.nextInt();
					
					 int dice1=DiceRoller.DiceRoller1(diceSides);
					 int dice2=DiceRoller.DiceRoller2(diceSides);

					System.out.println("Roll " + cnt + "\n" + dice1 + "\n" + dice2);
					
					/* need an interation method which sequences through the number of rolls that are kept count at roll*/

				System.out.println("Would you like to roll again?");
				String response = scnr.next();
				System.out.println("");
				shouldContinue = response.equals("yes");
					}
			}
				System.out.println("Ok, thanks for playing!");
			}
			
			
		

		//private static int interation () {


	}


