import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
    
  }
  public static void showHands(){
    Scanner scan=new Scanner(System.in);
    int hands[]=new int[5];
    String answer=" ";
    do{
      int i=0;
    for(i=0;i<5;i++){
      int random=(int)(Math.random()*52);
      hands[i]=random;
    }
    String club=" ";
    String diamond=" ";
    String heart=" ";
    String spade=" ";
    
    for(int j=0;j<5;j++){
      if(hands[j]>=0&&hands[j]<13){
        int ys=(hands[j])%13;
        switch(ys){
          case 0:
            club+="A ";
            break;
          case 1:
            club+="K ";
            break;
          case 2:
            club+="Q ";
            break;
          case 3:
            club+="J ";
            break;
          case 4:
            club+="10 ";
            break;
          case 5:
            club+="9 ";
            break;
          case 6:
            club+="8 ";
            break;
          case 7:
            club+="7 ";
            break;
          case 8:
            club+="6 ";
            break;
          case 9:
            club+="5 ";
            break;
          case 10:
            club+="4 ";
            break;
          case 11:
            club+="3 ";
            break;
          case 12:
            club+="2 ";
            break;
          
        }
      }
      if(hands[j]>=13&&hands[j]<26){
        int ys2=(hands[j])%13;
        switch(ys2){
           case 0:
            diamond+="A ";
            break;
          case 1:
            diamond+="K ";
            break;
          case 2:
            diamond+="Q ";
            break;
          case 3:
            diamond+="J ";
            break;
          case 4:
            diamond+="10 ";
            break;
          case 5:
            diamond+="9 ";
            break;
          case 6:
            diamond+="8 ";
            break;
          case 7:
            diamond+="7 ";
            break;
          case 8:
            diamond+="6 ";
            break;
          case 9:
            diamond+="5 ";
            break;
          case 10:
            diamond+="4 ";
            break;
          case 11:
            diamond+="3 ";
            break;
          case 12:
            diamond+="2 ";
            break;
          
        }
      }
      if(hands[j]>=26&&hands[j]<39){
        int ys3=(hands[j])%13;
        switch(ys3){
          case 0:
            heart+="A ";
            break;
          case 1:
            heart+="K ";
            break;
          case 2:
            heart+="Q ";
            break;
          case 3:
            heart+="J ";
            break;
          case 4:
            heart+="10 ";
            break;
          case 5:
            heart+="9 ";
            break;
          case 6:
            heart+="8 ";
            break;
          case 7:
            heart+="7 ";
            break;
          case 8:
            heart+="6 ";
            break;
          case 9:
            heart+="5 ";
            break;
          case 10:
            heart+="4 ";
            break;
          case 11:
            heart+="3 ";
            break;
          case 12:
            heart+="2 ";
            break;
          
        }
      }
      if(hands[j]>=39&&hands[j]<52){
        int ys4=(hands[j])%13;
        switch(ys4){
          case 0:
            spade+="A ";
            break;
          case 1:
            spade+="K ";
            break;
          case 2:
            spade+="Q ";
            break;
          case 3:
            spade+="J ";
            break;
          case 4:
            spade+="10 ";
            break;
          case 5:
            spade+="9 ";
            break;
          case 6:
            spade+="8 ";
            break;
          case 7:
            spade+="7 ";
            break;
          case 8:
            spade+="6 ";
            break;
          case 9:
            spade+="5 ";
            break;
          case 10:
            spade+="4 ";
            break;
          case 11:
            spade+="3 ";
            break;
          case 12:
            spade+="2 ";
            break;
        
        }
      }
    
    }
    
    System.out.println("Clubs: "+club);
    System.out.println("Diamonds: "+diamond);
    System.out.println("Hearts: "+heart);
    System.out.println("Spades: "+spade);
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
    answer=scan.next();
      
    }while(answer.equals("Y")||answer.equals("y"));
      
  }
  
  public static void simulateOdds(){
    int odds[]=new int[5];
    /*for(int z=0;z<5;z++){
      int odd=(int)(Math.random()*13);
      odds[z]=odd;
    }*/
    int temp=0;
    int temp2=0;
    int freq=0;
    int af=0;
    int bf=0;
    int cf=0;
    int df=0;
    int ef=0;
    int ff=0;
    int gf=0;
    int hf=0;
    int jf=0;
    int kf=0;
    int lf=0;
    int mf=0;
    int nf=0;
    
    for(int all=1;all<=10000;all++){
      for(int z=0;z<5;z++){
      int odd=(int)(Math.random()*13);
      odds[z]=odd;
      }
    
    for(int e=0;e<5;e++){
      for(int f=(e+1);f<=(4-e);f++){
         temp=odds[f];
         temp2=odds[e];
        while(temp==temp2){
          freq++;
          temp2++;
          
        }
      }
    }
      
    
    if(freq==1&&temp==0){
      af++;
    }
    if(freq==1&&temp==1){
      bf++;
    }
    if(freq==1&&temp==2){
      cf++;
    }
    if(freq==1&&temp==3){
      df++;
    }
    if(freq==1&&temp==4){
      ef++;
    }
    if(freq==1&&temp==5){
      ff++;
    }
    if(freq==1&&temp==6){
      gf++;
    }
    if(freq==1&&temp==7){
      hf++;
    }
    if(freq==1&&temp==8){
      jf++;
    }
    if(freq==1&&temp==9){
      kf++;
    }
    if(freq==1&&temp==10){
      lf++;
    }
    if(freq==1&&temp==11){
      mf++;
    }
    if(freq==1&&temp==12){
      nf++;
    }
    freq=0;
  }
    
    System.out.println("rank  freq of exactly one pair");
    System.out.println("A     "+af);
    System.out.println("K     "+bf);
    System.out.println("Q     "+cf);
    System.out.println("J     "+df);
    System.out.println("10    "+ef);
    System.out.println("9     "+ff);
    System.out.println("8     "+gf);
    System.out.println("7     "+hf);
    System.out.println("6     "+jf);
    System.out.println("5     "+kf);
    System.out.println("4     "+lf);
    System.out.println("3     "+mf);
    System.out.println("2     "+nf);
    System.out.println("-----------");
    int total=af+bf+cf+df+ef+hf+jf+kf+lf+mf+nf+gf+ff;
    System.out.println("total not exactly one pair: "+(10000-total));
  }
  
  
}
