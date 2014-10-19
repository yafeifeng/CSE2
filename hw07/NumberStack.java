//////////////////////////////////////////////
//Yafei Feng
//cse02 hw07
//Oct.17
//stack the numbers

import java.util.Scanner;
public class NumberStack{
    public static void main(String [] args){
        Scanner input;
        input=new Scanner(System.in);
        
        System.out.print("Enter a number between 1-9-");
        
        
        if(input.hasNextInt()){
            int number=input.nextInt();
            if(number>9||number<1){
                System.out.println("Your input is off the range");
            }
            else{
                for(int n=1;n<=number;n++){
                    for(int j=0;j<n;j++){
                        
                    
                    for(int t=0;t<(9-n);t++){
                        System.out.print(" ");}
                  for(int r=0;r<(2*n-1);r++){
                      
                  System.out.print(n);
                  
                  }
                   System.out.println(); 
                        
                    }
                    for(int g=0;g<(9-n);g++){
                        System.out.print(" ");
                    }
                    for(int k=0;k<(2*n-1);k++){
                        System.out.print("-");
                    }
                    System.out.println();
                    
            }
            }
            }
        else{
            System.out.println("Bad input");
        }

            
        
    }
}