 class Binary_No 
{
	 //main method
	public static void main (String args[]) {
		
		//initiliazing the variable 
		int i,j;
		
		//for loop running
		for( i=1;i<=5;i++)
		{
			     for( j=5;j>=i;j--)
			     {
				    
				    //chacking conditions 
			    	   if( j%2==0) {
			    		   System.out.print( "0"); 
			    	   }
			    	   else {
			    		   System.out.print( "1");
			    	   }
			     }
		       System.out.println();
		}
		
	}

}
