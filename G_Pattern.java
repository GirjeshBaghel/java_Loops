class G_Pattern
{
    //intilize the class variable 
    static int height = 5;
    static int width = (2 * height) - 1;

    //main method
    public static void main(String[] args)
    {
        //printG function is calling inside the main method
        printG();
    }
    
    // this is printG method it is static method 
    public static void printG()
    {
    int i, j;
    width--;
    
     // it is for loop running by the height
    for (i = 0; i < height; i++)
    {
        // it is for loop running by the width
        for (j = 0; j < width; j++)
        {
            // conditions checking and print according the conditions 
            if ((i == 0 || i == height - 1) && (j == 0 || j == width - 1))
            System.out.printf(" ");
            
            else if (j == 0)
                System.out.printf("*");
            
            else if (i == 0 && j <= height)
                System.out.printf("*");
            
            else if (i == height / 2
                    && j > height / 2)
                System.out.printf("*");
            
            else if (i > height / 2
                    && j == width - 1)
                System.out.printf("*");
            
            else if (i == height - 1
                    && j < width)
                System.out.printf("*");
            
            else
                System.out.printf(" ");
        }
        
        // it is used for break the line
        System.out.printf("\n");
    }
}
}
