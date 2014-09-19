////////////////////////////////////////////////////////////////
//Yafei Feng
//cse02 hw04
//September 19
//Time padding

import java.util.Scanner;
public class TimePadding{
    public static void main(String [] args){
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
        System.out.print("Enter the time in seconds:");
        
        if (myScanner.hasNextInt()){
            int time=myScanner.nextInt();
            
            if(time<0){//condition 1
            
                System.out.println("You did not enter a positive integer");
                return;//leave the program
                //the program terminates
            }
            
            int hour=(int)(time/3600);//declare the hour
                int minute1=(int)(((time%3600)/60)*10%10);//declare the first digit of minute
                int minute2=(int)((time%3600)/60);//declare the second digit of minute
                int second1=(int)(((time%3600)%60)*10%10);//declare the first digit of second
                int second2=(int)((time%3600)%60);//declare the second digit of second
            
            if((time%3600)<=540&&time>0&&((time%3600)%60)<=9){//condition 2
                
                System.out.println("The time is   "+hour+":"+minute1+minute2+":"+second1+second2);
            }
                if ((time%3600)<=540&&time>0&&((time%3600)%60)>9){//condition 3
                    System.out.println("The time is "+hour+":"+minute1+minute2+":"+second2);
                }
            
                if((time%3600)>=541){//condition 4
                    System.out.println("The time is "+hour+":"+minute2+":"+second2);
                    
                    
                }
            
        }
        else System.out.println("You did not enter an integer");
        return;//leave the program
        //the program terminates
        
    }//end of method
}//end of class