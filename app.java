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
		
		
		
		
}
}
