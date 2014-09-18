////////////////////////////////////
//Yafei Feng
//September 17
//calculate the total cost of each meal

import java.util.Scanner;
public class BigMacAgain{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner= new Scanner(System.in);
        
        System.out.print("Enter the number of big macs: ");
         
        
        //declare the cost per mac
        double bigMacs$=2.22;
        double cost$=0;
        
        
        
         if (myScanner.hasNextInt()){  
             int numbers=myScanner.nextInt();
             
             //declare the formula of calculation
        cost$=numbers*bigMacs$;
        int dollars=(int)cost$;
        int dimes=(int)(cost$*10)%10;
        int pennies=(int)(cost$*100)%10;
             
             if (numbers>0){
            System.out.println("You ordered "+numbers+"Big Macs for a cost of"+numbers+"*"+bigMacs$+"="+"$"+dollars+'.'+dimes+pennies);}
        
        else if (numbers<0){
            System.out.println("You did not enter an int>0");}
         }
         else {System.out.println("You did not enter an int");
        return;
        //leave the program
        //the program terminates
         
         }
        
        
        System.out.print("Do you want an order of fries (Y/y/N/n) ?");
        String answer=myScanner.next();
        
        //declare the price of fries
        double pricef$=2.15;
        double totalcost=pricef$+cost$;
        
        if (answer.equals("Y")||answer.equals("y")){
            System.out.println("You ordered fries at a cost of "+pricef$);
            System.out.printf("The total cost of the meal is "+"%5.2f",totalcost);
        }
            else if (answer.equals("N")||answer.equals("n")){
                System.out.println("The total cost of the meal is "+totalcost);
            }
    }
}