////////////////////////////////////////////
//Yafei Feng 
//cse02 hw6
//Oct.11
//estimate the root of the input

import java.util.Scanner;
public class Root{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number that is greater than 0-");//input a number
        
        double number=input.nextDouble();
        
        double low=0;//the initial low
        double high=number+1;//the initial high
        double middle=(number+1)/2.0;//initial middle
        double guess3=middle*middle;
        double tolerance=0.0000001*(number+1);//initial tolerance
        double diff=number+1;//initial difference
        
        if(number>0){ //first condition
        while(diff>tolerance){//start of while loop
            if(guess3>number){//sub condition
            high=middle;
            
        }
            else{//second sub condition
            low=middle;
            
        }
        middle=(high+low)/2.0;
        diff=high-low;
        tolerance=0.0000001*high;
        guess3=middle*middle;
        }//end of while loop
        System.out.println("The root is "+middle);
        }
        else {//second condition
            System.out.println("You did not enter a positive number" );
        }
        
        
    }//end of method
}//end of class