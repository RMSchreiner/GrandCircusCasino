package GrandCircusRoll;

public class DiceRoller {

       public static int DiceRoller1(int diceSides){
	
	  int dice1=(int)(Math.random()*diceSides+1);
	    return (dice1);
}
       
      public static int DiceRoller2(int diceSides){
       
      int dice2=(int)(Math.random()*diceSides+1);
       return (dice2);
}
}