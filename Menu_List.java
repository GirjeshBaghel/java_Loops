import java.util.Scanner;

public class Menu_List
{

	// main method
	public static void main(String[] args) {
	
		// it is used for taking input from user
		Scanner sc= new Scanner(System.in);
		
		int total = 0;
		char ans;
		System.out.println("\t\t WELCOME TO TAJ HOTEL");
		
		// this do_loop for checking the conditions
		do {
			// Menu list for showing for the user
			System.out.println("Menu  Card of Taj Hotel :- \n 1 : Starter \n 2 : Mains   \n 3 : Dessert ");
			System.out.print("Select your choise :");
			int choise = sc.nextInt();
			
			// this is switch case for taking  user choice
			switch(choise) {
			case 1 : 
				   // if user choice 1 then this line will be print
				   System.out.println("Starter's  :- \n 1:  Masala Dhosa = Rs.180 \n 2: Chole Bhature  = Rs.150 \n 3: Panner Tikka  = Rs.250 " );
				   System.out.print("Select your Item from the list :");
				     int ch1 = sc.nextInt();
				     switch(ch1) {
				     case 1: System.out.println("kadai Paneer =");
				             total= total +180;
				             System.out.println("Total Amount = "+"Rs"+" "+total);
				     break;
					
				     // if user choice 2 then this line will be print	     
				     case 2:						     
				    	 System.out.println("Rajma Chole = ");
			             total+=150;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
						     
				     // if user choice 3 then this line will be print	     
				     case 3:
				    	 System.out.println("Veg Birwani");
			             total+=250;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
				    	 break;
				    	 default:
				    		 System.out.println(" Please Enter which is given in the Menu card only !!! ");
				     }
				     break;
			
			// this is case 2 for Mains Option		
			case 2 :
				System.out.println("Main  :- \n1: Momos = Rs 100 \n2: Panner Tikka = Rs 150 \n3:  Pizza = Rs 200 ");
				System.out.print("Select the Iteam :-");
				int main = sc.nextInt();
				switch(main) {
			     case 1: System.out.println(" Momos ");
			             total+=100;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("panner tikka");
		             total+=150;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("Pizza");
		             total+=200;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println(" Please Enter vaild input only !!!");
			     }
				break;
					
			// this is case 3 for Dessert	
			case 3 : 
				System.out.println("Dessert's are :- \n1: Aallu Paratha = Rs 50 \n2: Ras Malai = Rs 50 \n3:Chole Bhature = Rs 150 ");
				System.out.print("Select the Iteam :-");
				int dessert = sc.nextInt();
				switch(dessert){
			     case 1: System.out.println("Aallu Paratha");
			             total+=50;
			             System.out.println("Total Amount = "+"Rs"+" "+total);
			     break;
			     case 2:
			    	 System.out.println("Ras Malai");
		             total+=50;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			     case 3:
			    	 System.out.println("Chole Bhature ");
		             total+=150;
		             System.out.println("Total Amount = "+"Rs"+" "+total);
			    	 break;
			    	 default:
			    		 System.out.println(" Please Enter vaild input only !!!");
			     }
			}
			
			// this line is using for user add something or not
			System.out.println("Do you want to Add more Items :  Y/N");
			 ans = sc.next().charAt(0); 
		}
		
		// it is while_loop for using the user choice that user wants to resart this options
		while(ans == 'y'|| ans =='Y');
		
		System.out.println("Thanks for visit  :) ");
	}
}
