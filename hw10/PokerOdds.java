import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){//main method
    showHands();//call the method showHands
    simulateOdds();//call the method simulateOdds
    
  }
  public static void showHands(){
    Scanner scan=new Scanner(System.in);//input scanner
    int hands[]=new int[5];//initiate the array that store five poker
    String answer=" ";
    do{
      int i=0;
    for(i=0;i<5;i++){
      int random=(int)(Math.random()*52);//random to generate hands
      hands[i]=random;
    }
    String club=" ";
    String diamond=" ";
    String heart=" ";
    String spade=" ";
    
    for(int j=0;j<5;j++){//sort the random hands
      if(hands[j]>=0&&hands[j]<13){//situation one:club
        int ys=(hands[j])%13;
        switch(ys){//sub-situations club A-2
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
      if(hands[j]>=13&&hands[j]<26){//situaltion 2: diamond
        int ys2=(hands[j])%13;//sub-situation diamond A-2
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
      if(hands[j]>=26&&hands[j]<39){//situation 3: heart
        int ys3=(hands[j])%13;//sub-situation heart A-2
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
      if(hands[j]>=39&&hands[j]<52){//situation 4:spade
        int ys4=(hands[j])%13;//sub-situation spade A-2
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
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//input to go again
    answer=scan.next();
      
    }while(answer.equals("Y")||answer.equals("y"));
      
  }// end of showHands method
  
  public static void simulateOdds(){
    //int odds[]=new int[5];//initiate a new array to store 5 cards
    
   
    
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
    
    
    for(int all=1;all<=10000;all++){//random 10000 times
    // for(int x=0;x<13;x++){
    int odds[]={-1,-1,-1,-1,-1};
    int deck[]={0,1,2,3,4,5,6,7,8,9,10,11,12};
     for(int z=0;z<5;z++){
     int decks=(int)(Math.random()*(13-z)); 
     //System.out.println(decks);
    int  temp3=deck[decks];
    deck[decks]=deck[deck.length-1];
    deck[deck.length-1]=temp3;
    //System.out.println(deck[decks]+" "+deck[deck.length-1]);
    int temp4=odds[z];
    odds[z]=deck[deck.length-1];
    deck[deck.length-1]=odds[z];
    
     }
    //  deck[x]=decks;
   // }
      /*for(int z=0;z<5;z++){
        int decks=(int)(Math.random()*(13-z)); 
        int y=12;
        //for(int q=1;q<=(z+1);q++){
          //for(int y=12;y>=(12-z);y--){
          if(deck[decks]!=-1){
     odds[z]=deck[decks];
     
      //q=z+1;
      //y=12-z;
       int temp3=deck[decks];
       deck[decks]=deck[y];
       deck[y]=temp3;
     
       deck[y]=-1;
         }
         else{
           decks=(int)(Math.random()*13);
           
         }
      //}
      }*/
      
    
    for(int e=0;e<5;e++){//get exactly one pair
    /* for(int j=e+1;j<5;j++){
       if(odds[e]==odds[j]){
         temp=odds[e];
         freq++;
       }
       
     }*/
      for(int f=(e+1);f<5;f++){
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
    System.out.println("total not exactly one pair: "+(10000-total));//situation that not exactly one pair
  }//end of simulateOdds method
  
  
}//end of class
