//////////////////////////////////////////////////
//Yafei Feng
//cse2 hw05
//September 27
//The program should then present the expression to the user and ask the user to state the result of of the expression.

import java.util.Scanner;//input the scanner
public class BoolaBoola{
    public static void main(String [] args){//main method
        Scanner input; 
        input= new Scanner(System.in);
        
        int randomNumber=(int)(Math.random()*2);//random method
        int symbol=(int)(Math.random()*4);
        int randomNumber2=(int)(Math.random()*2);
        int randomNumber3=(int)(Math.random()*2);
        
        boolean a=((int)(randomNumber-1)==0);//decalre a boolean
        boolean b=((int)(randomNumber2-1)==0);
        boolean c=((int)(randomNumber3-1)==0);
    
        switch(symbol){
            case 0://condition 1
                System.out.print("Does " +a+" || "+b+" || "+c+" have the value true(t/T) or false(F/f)?");
                break;
            case 1://condition 2
                System.out.print("Does "+a+" ||"+b+" && "+c+" have the value true(t/T) or false(F/f)?");
                break;
            case 2://condition 3
                System.out.print("Does "+a+" && "+b+" || "+c+" have the value true(t/T) or false(F/f)?");
                break;
            case 3://condition 4
                System.out.print("Does "+a+" && "+b+" && "+c+" have the value true(t/T) or false(F/f)?");
                break;
                
        }
        char input2=input.next().charAt(0);//delare a character 
        
        if(symbol==3){
            if(a==b&&a==c&&(int)(randomNumber-1)==0){//t&t&t
            switch(input2){
                case 'F'://condition 1
                    System.out.println("Wrong;Try again.");
                    break;
                case 'f'://condition 2
                    System.out.println("Wrong;Try again.");
                    break;
                case 'T'://condition 3
                    System.out.println("Correct");
                    break;
                case 't'://condition 4
                    System.out.println("Correct");
                    break;
            }
            }
            else{
            switch(input2){
                case 'F':
                    System.out.println("Correct");
                    break;
                case 'f':
                    System.out.println("Correct");
                    break;
                case 'T':
                    System.out.println("Wrong;Try again.");
                    break;
                case 't':
                    System.out.println("Wrong;Try agian.");
                    break;
            }
            }
        }
        if(symbol==0){
            if(a==b&&a==c&&(int)(randomNumber-1)!=0){//f|f|f
                switch(input2){
                case 'F':
                    System.out.println("Correct");
                    break;
                case 'f':
                    System.out.println("Correct");
                    break;
                case 'T':
                    System.out.println("Wrong;Try again.");
                    break;
                case 't':
                    System.out.println("Wrong;Try agian.");
                    break;}
            }
            else{
                switch(input2){
                case 'F':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'f':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'T':
                    System.out.println("Correct");
                    break;
                case 't':
                    System.out.println("Correct");
                    break;
            }
            }
        }
        if(symbol==1){
            if((int)(randomNumber-1)!=0&&(int)(randomNumber2-1)==0&&(int)(randomNumber3-1)==0){//f|t|t
                switch(input2){
                case 'F':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'f':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'T':
                    System.out.println("Correct");
                    break;
                case 't':
                    System.out.println("Correct");
                    break;}
            }
            if((int)(randomNumber-1)==0&&(int)(randomNumber2-1)!=0&&(int)(randomNumber3-1)==0){//t|f|t
                switch(input2){
                case 'F':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'f':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'T':
                    System.out.println("Correct");
                    break;
                case 't':
                    System.out.println("Correct");
                    break;}
            }
            if((int)(randomNumber-1)==0&&a==b&&a==c){//t|t|t
                switch(input2){
                case 'F':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'f':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'T':
                    System.out.println("Correct");
                    break;
                case 't':
                    System.out.println("Correct");
                    break;}
            }
        else{
            switch(input2){
                case 'F':
                    System.out.println("Correct");
                    break;
                case 'f':
                    System.out.println("Correct");
                    break;
                case 'T':
                    System.out.println("Wrong;Try again.");
                    break;
                case 't':
                    System.out.println("Wrong;Try agian.");
                    break;
            }
        }
        }
        if(symbol==2){
            if((int)(randomNumber-1)==0&&(int)(randomNumber2-1)!=0&&(int)(randomNumber3-1)!=0){//t&f&f
                switch(input2){
                case 'F':
                    System.out.println("Correct");
                    break;
                case 'f':
                    System.out.println("Correct");
                    break;
                case 'T':
                    System.out.println("Wrong;Try again.");
                    break;
                case 't':
                    System.out.println("Wrong;Try agian.");
                    break;
            }
            }
            if((int)(randomNumber-1)!=0&&(int)(randomNumber2-1)==0&&(int)(randomNumber3-1)!=0){//f&t|f
                switch(input2){
                case 'F':
                    System.out.println("Correct");
                    break;
                case 'f':
                    System.out.println("Correct");
                    break;
                case 'T':
                    System.out.println("Wrong;Try again.");
                    break;
                case 't':
                    System.out.println("Wrong;Try agian.");
                    break;}
            }
            if(a==b&&a==c&&(int)(randomNumber-1)!=0){//f&f|f
                switch(input2){
                case 'F':
                    System.out.println("Correct");
                    break;
                case 'f':
                    System.out.println("Correct");
                    break;
                case 'T':
                    System.out.println("Wrong;Try again.");
                    break;
                case 't':
                    System.out.println("Wrong;Try agian.");
                    break;}
            }
        else{
            switch(input2){
                case 'F':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'f':
                    System.out.println("Wrong;Try again.");
                    break;
                case 'T':
                    System.out.println("Correct");
                    break;
                case 't':
                    System.out.println("Correct");
                    break;}
        }
        }
}//end of method
}//end of class