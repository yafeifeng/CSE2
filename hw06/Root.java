////////////////////////////////////////////
//Yafei Feng 
//cse02 hw6
//Oct.11
//estimate the root of the input

import java.util.Scanner;
public class Root{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number that is greater than 0-");
        
        double number=input.nextDouble();
        
        double low=0;
        double high=number+1;
        double middle=(number+1)/2.0;
        double guess3=middle*middle;
        double tolerance=0.0000001*(number+1);
        double diff=number+1;
        
        while(diff>tolerance){
            if(guess3>number){
            high=middle;
            
        }
            else{
            low=middle;
            
        }
        middle=(high+low)/2.0;
        diff=high-low;
        tolerance=0.0000001*high;
        guess3=middle*middle;
        }
        System.out.println("The root is "+middle);
    }
}