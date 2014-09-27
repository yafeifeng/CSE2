///////////////////////////
//Yafei Feng
//hw05 cse2
//September 26
//BurgerKing order detail

import java.util.Scanner;//import the scanner method
public class BurgerKing{
    public static void main(String [] args){
        Scanner input;
        input=new Scanner(System.in);
        
        System.out.print("Enter a letter to indicate a choice of ");
        System.out.print("Burger (B or b)");
        System.out.print("Soda (S or s)");
        System.out.print("Fries (F or f)");
        
        
        String inputletter=input.next();//declare the input
        if(inputletter.length()==1){//condition 1
        char letter=inputletter.charAt(0);
        switch(letter){
            case 'b'://sub-condition 1
            System.out.print("Enter A or a for 'all the fixins'");
            System.out.print("c or C for cheese");
            System.out.print("N or n for none of the above");
              char sauce=input.next().charAt(0);
              switch(sauce){
                  case 'A':
                      System.out.println("You ordered a burger with all the fixins");
                      break;
                  case 'a':
                      System.out.println("You ordered a burger with all the fixins");
                      break;
                  case 'c':
                      System.out.println("You ordered a burger with cheese");
                      break;
                  case 'C':
                      System.out.println("You ordered a burger with cheese");
                      break;
                  case 'N':
                      System.out.println("You ordered a burger with none of the above");
                      break;
                  case 'n':
                      System.out.println("You ordered a burger with none of the above");
                      break;
              }
            break;
            case 'B'://sub-condition 2
            System.out.print("Enter A or a for 'all the fixins'");
            System.out.print("c or C for cheese");
            System.out.print("N or n for none of the above");
             char sauce2=input.next().charAt(0);
              switch(sauce2){
                  case 'A':
                      System.out.println("You ordered a burger with all the fixins");
                      break;
                  case 'a':
                      System.out.println("You ordered a burger with all the fixins");
                      break;
                  case 'c':
                      System.out.println("You ordered a burger with cheese");
                      break;
                  case 'C':
                      System.out.println("You ordered a burger with cheese");
                      break;
                  case 'N':
                      System.out.println("You ordered a burger with none of the above");
                      break;
                  case 'n':
                      System.out.println("You ordered a burger with none of the above");
                      break;
              }
            break;
            case 's'://sub-condition 3
                System.out.print("Do you want Pepsi(P or p),Coke(C or c),Sprite(S or s) or Moutain Dew(M or m)-");
                char drink=input.next().charAt(0);
                switch(drink){
                    case 'P':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'p':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'C':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'c':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'S':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 's':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 'M':
                        System.out.println("You ordered a Moutain Dew");
                        break;
                    case 'm':
                        System.out.println("You ordered a Moutain Dew");
                        break;
                }
                break;
                case 'S'://sub-condition 4
                    System.out.print("Do you want Pepsi(P or p),Coke(C or c),Sprite(S or s) or Moutain Dew(M or m)-");
                    char drink2=input.next().charAt(0);
                    switch(drink2){
                        case 'P':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'p':
                        System.out.println("You ordered a Pepsi");
                        break;
                    case 'C':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'c':
                        System.out.println("You ordered a Coke");
                        break;
                    case 'S':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 's':
                        System.out.println("You ordered a Sprite");
                        break;
                    case 'M':
                        System.out.println("You ordered a Moutain Dew");
                        break;
                    case 'm':
                        System.out.println("You ordered a Moutain Dew");
                        break;
                    }
                    break;
                    case 'f'://sub-condition 5
                        System.out.print("Do you want a large or small number of fries?(l,L,s,or S)-");
                        char fries=input.next().charAt(0);
                        switch(fries){
                            case 'l':
                                System.out.println("You ordered large fries");
                                break;
                             case 'L':
                                 System.out.println("You ordered large fries");
                                 break;
                            case 's':
                                System.out.println("You ordered small fries");
                                break;
                            case 'S':
                                System.out.println("You ordered small fries.");
                                break;
                        }
                        break;
                    case 'F'://sub-condition 6
                         System.out.print("Do you want a large or small number of fries?(l,L,s,or S)-");
                         char fries2=input.next().charAt(0);
                         switch(fries2){
                             case 'l':
                                System.out.println("You ordered large fries");
                                break;
                             case 'L':
                                 System.out.println("You ordered large fries");
                                 break;
                            case 's':
                                System.out.println("You ordered small fries");
                                break;
                            case 'S':
                                System.out.println("You ordered small fries.");
                                break;
                         }
                        break;
                        default :
                               System.out.println("You did not enter any of B, b, S, s, F or f");
            }
        }

        else{ System.out.println("A single character expected");//condition 2
       return;//leave the program
       //the program terminates
        }
        }//end of method
    }//end of class