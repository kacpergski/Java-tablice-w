class app {
	public static void main(String args[]) {

	int[][] array = new int[3][3];
	array [0][0] = 1;
	array [0][1] = array [1][0] = 2;
	array [0][2] = array [2][0] = 3;
	array [1][1] = array [0][1] * array [1][0];
	array [1][2] = array [1][0] * array [0][2];
	array [2][1] = array [2][0] * array [0][1];
	array [2][2] = array [0][2] * array [2][0];
	
	System.out.println("--------ZADANIE 1 ------------------");
	System.out.println("------------------------------------");
	System.out.println(array [0][0] + " " + array [0][1] + " " + array [0][2]);
	System.out.println(array [1][0] + " " + array [1][1] + " " + array [1][2]);
	System.out.println(array [2][0] + " " + array [2][1] + " " + array [2][2]);
	
	//ZADANIE2
	char[][] shoes = new char [3][];
	shoes[0] = new char[4];
	shoes[1] = new char[2];
	shoes[2] = new char[5];
	
	// get product
	shoes[0][0] = 'b';
	shoes[0][1] = 'u';
	shoes[0][2] = 't';
	shoes[0][3] = 'y';
	
	//get size
	shoes[1][0] = 52;
	shoes[1][1] = 50;
	
	// get price
	shoes[2][0] = 52;
	shoes[2][1] = 50;
	shoes[2][2] = '.';
	shoes[2][3] = 53;
	shoes[2][4] = 55;
			
	System.out.println("---------ZADANIE 2-----------------");
	System.out.println("--------------------------");
	System.out.println("Product: " + shoes[0][0] + shoes[0][1] + shoes[0][2]+ shoes[0][3]);
	System.out.println("Size: " +  shoes[1][0] + shoes[1][1]);
	System.out.println("Price: " + shoes[2][0] + shoes[2][1] + shoes[2][2] + shoes[2][3] + shoes[2][4]);
	System.out.println("--------------------------");
		
	//ZADANIE3
	char[][] cross = new char [3][];
	cross[0] = new char[4];
	cross[1] = new char[3];
	cross[2] = new char[6];
	
	// get 
	cross[0][0] = 'w';
	cross[0][1] = 'i';
	cross[0][2] = 'l';
	cross[0][3] = 'k';
	
	//get 
	cross[1][0] = 'k';
	cross[1][1] = 'o';
	cross[1][2] = 't';
	
	// get 
	cross[2][0] = 380;
	cross[2][1] = 'y';
	cross[2][2] = 'r';
	cross[2][3] = 'a';
	cross[2][4] = 'f';
	cross[2][5] = 'a';
			
	System.out.println("---------ZADANIE 3-----------------");
	System.out.println("--------------------------");
	System.out.println("3 litera 2 hasła: " + cross[1][2]);
	System.out.println("1 litera 1 hasła: " + cross[2][0]);
	cross[2][5] ='y';
	System.out.println(" Długoś2 hasła: " + cross[1].length);
	
	System.out.println("--------------------------");	
	System.out.println(""+cross[0][0] + cross[0][1] + cross[0][2] + cross[0][3]);
	System.out.println(""+cross[1][0] + cross[1][1] + cross[1][2]);
	System.out.println(""+cross[2][0] + cross[2][1] + cross[2][2] + cross[2][3] + cross[2][4]+ cross[2][5]);
	System.out.println("--------------------------");	
	
	//System.out.println("-----------Zadanie 4---------------");


	char[][] lh = new char[10][10];

	lh[0][0] = 49;
	lh[0][1] = 'x';
	lh[0][2] = 'x';
	lh[0][3] = 'x';
	lh[0][3] = 'x';
	lh[0][4] = 'x';
	lh[0][5] = 'x';
	lh[0][6] = 'x';
	lh[0][7] = 's';
	lh[0][8] = 'x';
	lh[0][9] = 50;
	lh[1][0] = 49;
	lh[1][1] = 'x';
	lh[1][2] = 'x';
	lh[1][3] = 'x';
	lh[1][4] = 'x';
	lh[1][5] = 'x';
	lh[1][6] = 'x';
	lh[1][7] = 's';
	lh[1][8] = 'x';
	lh[1][9] = 50;
	lh[2][0] = 'x';
	lh[2][1] = 's';
	lh[2][2] = 'x';
	lh[2][3] = 'x';
	lh[2][4] = 'x';
	lh[2][5] = 'x';
	lh[2][6] = 'x';
	lh[2][7] = 's';
	lh[2][8] = 'x';
	lh[2][9] = 'x';
	lh[3][0] = 'x';
	lh[3][1] = 'x';
	lh[3][2] = 'x';
	lh[3][3] = 'x';
	lh[3][4] = 'x';
	lh[3][5] = 'x';
	lh[3][6] = 'x';
	lh[3][7] = 's';
	lh[3][8] = 'x';
	lh[3][9] = 50;
	lh[4][0] = 'x';
	lh[4][1] = 'x';
	lh[4][2] = 'x';
	lh[4][3] = 'x';
	lh[4][4] = 'x';
	lh[4][5] = 'x';
	lh[4][6] = 'x';
	lh[4][7] = 's';
	lh[4][8] = 'x';
	lh[4][9] = 50;
	lh[5][0] = 'x';
	lh[5][1] = 's';
	lh[5][2] = 'x';
	lh[5][3] = 'x';
	lh[5][3] = 'x';
	lh[5][4] = 'x';
	lh[5][5] = 'x';
	lh[5][6] = 'x';
	lh[5][7] = 'x';
	lh[5][8] = 'x';
	lh[5][9] = 50;
	lh[6][0] = 'x';
	lh[6][1] = 'x';
	lh[6][2] = 'x';
	lh[6][3] = 'x';
	lh[6][4] = 'x';
	lh[6][5] = 'x';
	lh[6][6] = 'x';
	lh[6][7] = 's';
	lh[6][8] = 'x';
	lh[6][9] = 50;
	lh[7][0] = 'x';
	lh[7][1] = 'x';
	lh[7][2] = 'x';
	lh[7][3] = 'x';
	lh[7][4] = 'x';
	lh[7][5] = 'x';
	lh[7][6] = 'x';
	lh[7][7] = 'x';
	lh[7][8] = 'x';
	lh[7][9] = 50;
	lh[8][0] = 'x';
	lh[8][1] = 'x';
	lh[8][2] = 'x';
	lh[8][3] = 'x';
	lh[8][4] = 'x';
	lh[8][5] = 'x';
	lh[8][6] = 'x';
	lh[8][7] = 'x';
	lh[8][8] = 'x';
	lh[8][9] = 50;
	lh[9][0] = 'x';
	lh[9][1] = 'x';
	lh[9][2] = 'x';
	lh[9][3] = 'x';
	lh[9][4] = 'x';
	lh[9][5] = 's';
	lh[9][6] = 'x';
	lh[9][7] = 's';
	lh[9][8] = 'x';
	lh[9][9] = 50;
	
	
	
	System.out.println("ZADANIE 4" );
	System.out.print(" "+lh[0][0] );
	System.out.print(" "+ lh[0][1] );
	System.out.print(" "+ lh[0][2] );
	System.out.print(" "+ lh[0][3] );
	System.out.print(" "+ lh[0][4] );
	System.out.print(" "+ lh[0][5] );
	System.out.print(" "+ lh[0][6] );
	System.out.print(" "+ lh[0][7] ); 
	System.out.print(" "+ lh[0][8] );
	System.out.println(" "+ lh[0][9] );
	System.out.print(" "+ lh[1][0] );
	System.out.print(" "+ lh[1][1] );  
	System.out.print(" "+ lh[1][2] );  
	System.out.print(" "+ lh[1][3] );  
	System.out.print(" "+ lh[1][4] );  
	System.out.print(" "+ lh[1][5] );  
	System.out.print(" "+ lh[1][6] );  
	System.out.print(" "+ lh[1][7] ); 
	System.out.print(" "+ lh[1][8] );  
	System.out.println(" "+ lh[1][9] ); 
	System.out.print(" "+ lh[2][0] );  
	System.out.print(" "+ lh[2][1] );  
	System.out.print(" "+ lh[2][2] );  
	System.out.print(" "+ lh[2][3] );  
	System.out.print(" "+ lh[2][4] );  
	System.out.print(" "+ lh[2][5] );  
	System.out.print(" "+ lh[2][6] );  
	System.out.print(" "+ lh[2][7] ); 
	System.out.print(" "+ lh[2][8] );  
	System.out.println(" "+ lh[2][9] ); 
	System.out.print(" "+ lh[3][0] );  
	System.out.print(" "+ lh[3][1] );  
	System.out.print(" "+ lh[3][2] );  
	System.out.print(" "+ lh[3][3] );  
 	System.out.print(" "+ lh[3][4] );  
	System.out.print(" "+ lh[3][5] );  
	System.out.print(" "+ lh[3][6] );  
	System.out.print(" "+ lh[3][7] ); 
	System.out.print(" "+ lh[3][8] );  
	System.out.println(" "+ lh[3][9] ); 
	System.out.print(" "+ lh[4][0] );  
	System.out.print(" "+ lh[4][1] );  
	System.out.print(" "+ lh[4][2] );  
	System.out.print(" "+ lh[4][3] );  
	System.out.print(" "+ lh[4][4] );  
	System.out.print(" "+ lh[4][5] );  
	System.out.print(" "+ lh[4][6] );  
	System.out.print(" "+ lh[4][7] ); 
	System.out.print(" "+ lh[4][8] );  
	System.out.println(" "+ lh[4][9] ); 
	System.out.print(" "+ lh[5][0] );  
	System.out.print(" "+ lh[5][1] );  
	System.out.print(" "+ lh[5][2] );  
	System.out.print(" "+ lh[5][3] );  
	System.out.print(" "+ lh[5][3] );  
	System.out.print(" "+ lh[5][4] );  
	System.out.print(" "+ lh[5][6] );  
	System.out.print(" "+ lh[5][7] ); 
	System.out.print(" "+ lh[5][8] );  
	System.out.println(" "+ lh[5][9] ); 
	System.out.print(" "+ lh[6][0] );  
	System.out.print(" "+ lh[6][1] );  
	System.out.print(" "+ lh[6][2] );  
	System.out.print(" "+ lh[6][3] );  
	System.out.print(" "+ lh[6][4] );  
	System.out.print(" "+ lh[6][5] );  
	System.out.print(" "+ lh[6][6] );  
	System.out.print(" "+ lh[6][7] ); 
	System.out.print(" "+ lh[6][8] );  
	System.out.println(" "+ lh[6][9] );
	System.out.print(" "+ lh[7][0] );  
	System.out.print(" "+ lh[7][1] );  
	System.out.print(" "+ lh[7][2] );  
	System.out.print(" "+ lh[7][3] );  
	System.out.print(" "+ lh[7][4] );  
	System.out.print(" "+ lh[7][5] );  
	System.out.print(" "+ lh[7][6] );  
	System.out.print(" "+ lh[7][7] ); 
	System.out.print(" "+ lh[7][8] );  
	System.out.println(" "+ lh[7][9] ); 
	System.out.print(" "+ lh[8][0] );  
	System.out.print(" "+ lh[8][1] );  
	System.out.print(" "+ lh[8][2] );  
	System.out.print(" "+ lh[8][3] );  
	System.out.print(" "+ lh[8][4] );  
	System.out.print(" "+ lh[8][5] );  
	System.out.print(" "+ lh[8][6] );  
	System.out.print(" "+ lh[8][7] ); 
	System.out.print(" "+ lh[8][8] );  
	System.out.println(" "+ lh[8][9] ); 
	System.out.print(" "+ lh[9][0] );  
	System.out.print(" "+ lh[9][1] );  
	System.out.print(" "+ lh[9][2] );  
	System.out.print(" "+ lh[9][3] );  
	System.out.print(" "+ lh[9][4] );  
	System.out.print(" "+ lh[9][5] );  
	System.out.print(" "+ lh[9][6] );  
	System.out.print(" "+ lh[9][7] ); 
	System.out.print(" "+ lh[9][8] );  
	System.out.print(" "+ lh[9][9] ); 
	
}
}
