package com.infotech.snakeandladder;

import java.util.Random;

public class SankeAndLadder {
	/** Defining Player Position in Game**/


	public static void main(String[] args) {
	int position = 0;
	
	final int NO_PLAY = 1;
	final int LADDER = 2;
	final int SNAKE = 3;
	/** Random class object to generate die No 1-6**/
	Random random = new Random();
	
	System.out.println("Player 1 start Position is ="+position);
	
    int dieno = random.nextInt(6)+1;
    System.out.println("Die Number="+dieno);
    
	int option = random.nextInt(3)+1;
	System.out.println("Option Number="+option);
	switch(option) {
	case NO_PLAY :
		     System.out.println("Option=NOPLAY");
	         position = position;
		     break;
	case LADDER :
		     System.out.println("Option=LADDER");
		     position = position + dieno;
		 break;
	case SNAKE :
		System.out.println("Option=LADDER");
	     position = position -  dieno;
	     if(position < 0) {
	    	 position = 0;
	     }
		 break;
	}
	System.out.println("New Position="+position);
	}

}
