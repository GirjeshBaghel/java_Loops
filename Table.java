import java.util.*;
class Table
{
    // main method
    public static void main(String[] args)
    {
        int a;
        
        // taking no from user to print a table
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no : ");
        a = sc.nextInt();
        for(int i=1; i<11;i++)
        {
            System.out.println(a+" * "+i+" = "+(a*i));
        }

    }
}
