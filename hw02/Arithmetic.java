//////////////////////////////////////
//Feng Yafei
//September 10 2014
//cse 02 hw02
//calculate the cost of purchases at a Walmart in PA
public class Arithmetic {
    public static void main(String[] args){
        //numbers of pairs of socks
        int nSocks=3;
        //cost per sale of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=3.25;
        
        //number of boxes of envelopes
        int nEnvolopes=1;
        //cost per box of envolopes
        double envolopeCost$=3.25;
        //ratio of tax
        double taxPercent=0.06;
        
        //what are you calculating?
        //Total cost of each kind of item; sales tax for that total cost
        //Total cost of purchases (before tax)
        //Total actually paid for this transaction, including sales tax.
        double totalsockCost$;
        double totalglassCost$;
        double totalenvolopeCost$;
        totalsockCost$=nSocks*sockCost$;
        totalenvolopeCost$=nEnvolopes*envolopeCost$;
        totalglassCost$=nGlasses*glassCost$;
        double salesTaxSock$=totalsockCost$*taxPercent;
        double salesTaxEnvolope$=totalenvolopeCost$*taxPercent;
        double salesTaxGlass$=totalglassCost$*taxPercent;
        double totalCostPurchase$=(int)((totalsockCost$+totalenvolopeCost$+totalglassCost$)*100/100.0);
        double totalActuallycost$=(int)((totalCostPurchase$+salesTaxGlass$+salesTaxEnvolope$+salesTaxSock$)*100/100.0);
        
        System.out.println("Total cost of socks is "+totalsockCost$+" dollars and the sales tax for socks is "+salesTaxSock$);
        System.out.println("Total cost of glasses is "+totalglassCost$+" dollars and the sales tax for glasses is "+salesTaxGlass$);
        System.out.println("Total cost of envolopes is "+totalenvolopeCost$+" dollars and the sales tax for envolopes is "+salesTaxEnvolope$);
        System.out.println("Total cost of purchases is "+totalCostPurchase$+" dollars before tax ");
        System.out.println("Total actually paid for this transanction is "+ totalActuallycost$+" dollars including the tax");
    }
}