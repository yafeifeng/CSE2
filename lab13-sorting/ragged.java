////////////////////////////////////////////////////
public class ragged{
    public static void main(String [] args){
        
        int [][] rag=new int[5][];
        
       System.out.println("The array before sorting: ");
       int row=0;
        for (row = 0; row < 5; row++) {
            rag[row]=new int [row*3+5];
for (int column = 0; column < (row*3+5);column++){

rag[row][column]=(int)(Math.random()*40);
System.out.print(rag[row][column]+" ");
}
System.out.println();
}

String sorted=" ";
System.out.println("The array after sorting: ");
//java.util.Arrays.sort(rag[row]);
for(int i=0;i<5;i++){
    for(int j=0;j<(i*3+5);j++){
        
java.util.Arrays.sort(rag[i]);
System.out.print(rag[i][j]+" ");
}
System.out.println();
}        
        
    }
}

