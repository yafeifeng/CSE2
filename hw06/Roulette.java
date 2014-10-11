///////////////////////////////////////////
//Yafei Feng
//Oct.10
//hw06

import java.util.Scanner;
public class Roulette{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 37");
        int number=scan.nextInt();
        int frequency=0;

        int result=0;
        int another=0;
        int bonus=0;
        while(frequency<100000){
         
            
            if((int)(Math.random()*37)==number){
                result++;
            }
        else{
          another++;  
        
        }
            
           
         
        frequency++;
        }

        bonus=result*36;
     System.out.println("the number of times that your number didn't come up is "+another);
     System.out.println("the number of times that your number came up is "+result);
     System.out.println("the number you win is "+bonus);
    }
}