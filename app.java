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
	
	
	
		
	System.out.println("---------ZADANIE 2-----------------");
	System.out.println();
	System.out.println();
	System.out.println();
		
		
		
		
}
}
