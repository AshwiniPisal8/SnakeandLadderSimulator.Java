package com.infotech.snakeandladder;

import java.util.Random;

public class SankeAndLadder {
	/** Defining Player Position in Game**/


	public static void main(String[] args) {
	int position=0;
	/** Random class object to generate die No 1-6**/
	Random random = new Random();
	
	System.out.println("Player first Position="+position);
	
    int dieno = random.nextInt(6)+1;
    System.out.println("Die Number="+dieno);
    
    position = position + dieno;
    
    System.out.println("New Position after Rolling die="+position);
	}

}
