import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String [] args){
        
        Scanner input;
        input=new Scanner(System.in);
        System.out.print("Enter an int between 1 and 15-");
        
        
        if(input.hasNextInt()){
            int number=input.nextInt();
            int nStars=1;
            if(number<1||number>15){
                System.out.println("Your int was not in the range[1,15]");
            return;
            }
            else{
                while(nStars<=number){
                        System.out.print("*");
                    nStars++;
                }
                System.out.print("\n");
                
                nStars=1;
                while(nStars<=number){
                    int r=1;//the number of stars in a row
                    while(r<=nStars){
                        System.out.print("*");
                        r++;
                    }
                    System.out.print("\n");
                    nStars++;
                }
            }
            System.out.print("Enter y or Y to go again-");
            String letter=input.next();
            char l=letter.charAt(0);
            while(l=='Y'||l=='y'){
                System.out.print("Enter an int between 1 and 15-");
                int number2=input.nextInt();
                nStars=1;
                while(nStars<=number2){
                        System.out.print("*");
                    nStars++;
                }
                System.out.print("\n");
                
                nStars=1;
                while(nStars<=number2){
                    int r=1;//the number of stars in a row
                    while(r<=nStars){
                        System.out.print("*");
                        r++;
                    }
                    System.out.print("\n");
                    nStars++;
                    
                }
                
            }
            }
        else{
        return;}
    }
}