///////////////////////////////////////////
//Yafei Feng 
//cse2
//hw 11 program 1
//PokerHands

import java.util.Scanner;
public class PokerHands{
	public static void main(String [] args){
		
		
		int hand[]=new int[5];//the array to store the hand
		int temp=0;
		int result=0;
		int freq[]={0,0,0,0,0,0,0,0,0,0,0,0,0};//the array to store the frequency of rank
		
		int checksuit[]={0,0,0,0,0};//the array to store the frequency of suit
		Scanner scan=new Scanner(System.in);
		String x1=" ";
		do{
		System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
		x1=scan.next();
		char input=x1.charAt(0);
		if(input=='y'||input=='Y'){
			for(int i=0;i<5;i++){
			System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");//get the hand
			String x2=scan.next();
			char input2=x2.charAt(0);
			if(input2=='c'){
				System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");//get the rand
				String x3=scan.next();
				char input3=x3.charAt(0);
				switch(input3){
					case'a':
						result=0;
						break;
					case'k':
					  result=1;
					  break;
					case'q':
					  result=2;
					  break;
					case'j':
					  result=3;
					  break;
					case'1':
					  result=4;
					  break;
					case'9':
					  result=5;
					  break;
					case'8':
					  result=6;
					  break;
					case'7':
					  result=7;
					  break;
					case'6':
					  result=8;
					  break;
					case'5':
					  result=9;
					  break;
					case'4':
					  result=10;
					  break;
					case'3':
					  result=11;
					  break;
					case'2':
					  result=12;
					  break;
				}
				}
				if(input2=='d'){
				System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				String x4=scan.next();
				char input4=x4.charAt(0);
				switch(input4){
					case'a':
						result=13;
						break;
					case'k':
					  result=14;
					  break;
					case'q':
					  result=15;
					  break;
					case'j':
					  result=16;
					  break;
					case'1':
					  result=17;
					  break;
					case'9':
					  result=18;
					  break;
					case'8':
					  result=19;
					  break;
					case'7':
					  result=20;
					  break;
					case'6':
					  result=21;
					  break;
					case'5':
					  result=22;
					  break;
					case'4':
					  result=23;
					  break;
					case'3':
					  result=24;
					  break;
					case'2':
					  result=25;
					  break;
				}
				}
				if(input2=='h'){
					System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				String x5=scan.next();
				char input5=x5.charAt(0);
				switch(input5){
					case'a':
						result=26;
						break;
					case'k':
					  result=27;
					  break;
					case'q':
					  result=28;
					  break;
					case'j':
					  result=29;
					  break;
					case'1':
					  result=30;
					  break;
					case'9':
					  result=31;
					  break;
					case'8':
					  result=32;
					  break;
					case'7':
					  result=33;
					  break;
					case'6':
					  result=34;
					  break;
					case'5':
					  result=35;
					  break;
					case'4':
					  result=36;
					  break;
					case'3':
					  result=37;
					  break;
					case'2':
					  result=38;
					  break;
				}
				}
				if(input2=='s'){
					System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
				String x6=scan.next();
				char input6=x6.charAt(0);
				switch(input6){
					case'a':
						result=39;
						break;
					case'k':
					  result=40;
					  break;
					case'q':
					  result=41;
					  break;
					case'j':
					  result=42;
					  break;
					case'1':
					  result=43;
					  break;
					case'9':
					  result=44;
					  break;
					case'8':
					  result=45;
					  break;
					case'7':
					  result=46;
					  break;
					case'6':
					  result=47;
					  break;
					case'5':
					  result=48;
					  break;
					case'4':
					  result=49;
					  break;
					case'3':
					  result=50;
					  break;
					case'2':
					  result=51;
					  break;
				}
				}
				hand[i]=result;
				if(i>=1){
				for(int z=(i-1);z<5;z++){//conditions when get repeated card
					if(hand[i]==hand[z]){
						System.out.println("You already entetred that card");
						i--;
					}
					break;
				}
				}
				while(input2!='c'&&input2!='d'&&input2!='h'&&input2!='s'){
					System.out.println("You did not enter a valid response");//conditions when get invalid response 
					i--;
					break;
				}
			}
		showOneHand(hand);//call the method showOneHand
		int y=0;
		int freq2=0;
		for(int q=0;q<5;q++){
			freq[hand[q]%13]++;
		}
		int four=0;
		int three=0;
		int onepair=0;
		int full=0;
		int suit1=0;
		int straight=0;
		for(int q=0;q<13;q++){
	  if(freq[q]==4){
				four++;
			}
			if(freq[q]==3){
			  three++;
			}
			
			if(freq[q]==2){
				onepair++;
			}
		}
		for(int q=0;q<9;q++){
			if(freq[q]==1&&freq[q+1]==1&&freq[q+2]==1&&freq[q+3]==1&&freq[q+4]==1){
				straight++;
			}
		}
		for(y=0;y<13;y++){
			if(freq[y]==2){
			  full++;
			}
		}
			for(int p=0;p<5;p++){
			checksuit[hand[p]/13]++;
		}
			for(int p=0;p<5;p++){
			if(checksuit[p]==5){
				suit1++;
			}
			}
			
		if(four==1){
				System.out.println("This is a Four of a kind");
		}
		if(three==1&&full!=1){
			System.out.println("This is a Three of a kind");
		}
		if(onepair==1&&three!=1){
				System.out.println("This is a one pair");
		}
		if(three==1&&full==1){
			System.out.println("This is a Fullhouse");
		}
	  if(onepair==2){
	  	System.out.println("This is a two pair");
	  }
	  if(four==0&&three==0&&onepair==0&&suit1!=1){
	  	System.out.println("This is a high card");
	  }
	  if(straight==1&&suit1!=1){
	  	System.out.println("This is a straight card");
	  }
	  
			if(suit1==1&&straight!=1){
		System.out.println("This is a flush");
			}
			if(suit1==1&&straight==1){
				System.out.println("This is a straight flush");
			}

		}
		}while(x1.equals("Y")||x1.equals("y"));
	
	}//end of main method
	
public static void showOneHand(int hand[]){//method showOneHand
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }//end of method
}//end of class
