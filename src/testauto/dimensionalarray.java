package testauto;

import java.util.Arrays;

public class dimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[][] student = new int[2][2];
		
		
		student[0][0]= 5;
		student[0][1]= 10;
		student[1][0]= 15;
		student[1][1]= 20;
		
		System.out.println(student[0][1]);
		
		
		
		for (int i = 0 ;i<2;i++) {
			
			
			for (int j = 0 ;j<2;j++) {
			
				
				System.out.print(student[i][j]);

				System.out.print(" ");
			
		}
		
			
			System.out.println("");
			
		
		}
		
		
		
		
				;
	
		
		// 2d Array example
		
		
		 int[][] arr = { { 1, 2 }, { 3, 4 } };
		 
	        for (int i = 0; i < 2; i++) {
	        	
	            for (int j = 0; j < 2; j++) {
	            	
	                System.out.println("arr[" + i + "][" + j + "] = "
	                                + arr[i][j]);
		
	            }
		
	}
	        
	
	
	}
	
	
	// 3d Array example
	
	 int[][] arr = { { 1, 2 }, { 3, 4 },{5, 6} };

	
	
	
	
	

}
