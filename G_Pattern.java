class G_Pattern
{
    static int height = 5;
    static int width = (2 * height) - 1;

    public static void main(String[] args)
    {
        printG();
    }

    static void printG()
    {
    int i, j;
    width--;
    
    for (i = 0; i < height; i++)
    {
        for (j = 0; j < width; j++)
        {
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
        System.out.printf("\n");
    }
}
}