////////////////////////////
//lab 05
//Yafei Feng

import java.util.Scanner;
public class RandomGame{
    public static void main(String [] args){
        
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        
    
        int randomNumber=(int)(Math.random()*37);
        int randomc1=(int)(Math.random()*6);
        int randomc2=(int)(Math.random()*6);
        int randomp=(int)(Math.random()*13);
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
        char input=myScanner.next().charAt(0);
        
        switch(input){
            case 'r':
                switch(randomNumber){
                    case 37:
            System.out.println("Roulette: 00");
                      break;
                  default:
                      System.out.println("Roulette: "+randomNumber);
              }
            break;
            case 'R':
                switch(randomNumber){
                    case 37:
            System.out.println("Roulette: 00");
                      break;
                  default:
                      System.out.println("Roulette: "+randomNumber);}
            break;
            case 'c':
            System.out.println("Craps option is yet to be implemented");//Craps: "+randomc2+"+"+randomc1+"="+(randomc2+randomc1));
            break;
            case 'C':
            System.out.println("Craps option is yet to be implemented");//"Craps: "+randomc2+"+"+randomc1+"="+(randomc2+randomc1));
            break;
            case 'p':
            System.out.println("Picking a card not implemented yet");//randomp+"of");
            break;
            case 'P':
            System.out.println("Picking a card not implemented yet");
            break;
            default:
            System.out.println(input+" is not one of character expected");
        }
            }
        }
        
        
    