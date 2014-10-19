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
            int n=1;
        while(n<=number){
            int a=0;
            while(a<n){
                int b=0;
                while(b<9-n){
                    System.out.print(" ");
                    b++;}
                    int c=0;
                    while(c<(2*n-1)){
                        System.out.print(n);
                        c++;
                    }
                    System.out.println();
                a++;
            }
        int d=0;
        while(d<9-n){
            System.out.print(" ");
            d++;
        }
        int e=0;
        while(e<(2*n-1)){
            System.out.print("-");
            e++;
        }
        System.out.println();
            n++;
        }
        int z=0;
        do{
            z++;
            System.out.println();
            int f=0;
            do{
                f++;
                int g=0;
                do{
                    g++;
                    System.out.print(" ");
                }
                while(g<9-z);
                int i=0;
                do{
                    i++;
                    System.out.print(z);
                }
                while(i<(2*z-1));
                System.out.println();
            }
            while(f<z);
            int g=0;
            do{
                g++;
                System.out.print(" ");
            }
            while(g<9-z);
            int h=0;
            do{
                h++;
                System.out.print("-");
            }
            while(h<(2*z-1));
        }
        while(z<number);
            }
            }
        else{
            System.out.println("Bad input");
        }

            
        
    }
}