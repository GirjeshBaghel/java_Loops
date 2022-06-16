class Pyramid_Reverse 
{

	public static void main(String[] args) {
    int i,j,k;
    for( i=5;i>=1;i--) 
    {
    	     for(k=4;k>=i;k--)//k for space 
    	     {
    	    	 System.out.print(" ");
    	     }
    	     for( j=1;j<=2*i-1;j++) {
    	    	 System.out.print("*");
      	     }
                 System.out.println();
    }
    
	}

}
