////////////////////////////////////////////
//Yafei Feng
//cse02 hw03
//September 10
//Convert a double input to the right of four digits decimals

import java.util.Scanner;
public class FourDigits{
    public static void main(String [] args){
        
        //declare the scanner object that will take input
        Scanner input;
        input=new Scanner(System.in);
        
        //input the number
        System.out.print("Enter a double: ");
        double number=input.nextDouble();
        
        //the first digit
        int fourdigits=(int)(10*number%10);
        //the second digit
        int fourdigits3=(int)(100*number%10);
        //the third digit
        int fourdigits2=(int)(number*1000%10);
        //the fourth digit
        int fourdigits1=(int)(number*10000%10);
    
        //print out the result
        System.out.println("The four digits are: "+fourdigits+fourdigits3+fourdigits2+fourdigits1);
        
    }
}