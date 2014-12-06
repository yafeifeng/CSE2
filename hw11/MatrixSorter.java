/////////////////////////////////////////////
//yafei Feng
//cse2
//hw11 program2
//MatrixSorter
//Dec.5
public class MatrixSorter{
    public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
   show(mat3d);
}
    public static int[][][] buildMat3d(){//build the matrix
        int slab=0;
        int row=0;
        int column=0;
        int [][][] mat3d=new int [3][][];
        for(slab=0;slab<3;slab++){
            mat3d[slab]=new int [3+2*slab][];
            for(row=0;row<(3+2*slab);row++){
                mat3d[slab][row]=new int [slab+row+1];{
                    for(column=0;column<(slab+row+1);column++){
                        mat3d[slab][row][column]=(int)(Math.random()*99)+1;
                    }
                }
            }
        }
        return mat3d;
    }
    public static void show(int [][][] mat3d){//print the matrix
        for(int slab=0;slab<3;slab++){
            System.out.println("---------------------------Slab"+(slab+1));
             for(int row=0;row<mat3d[slab].length;row++){
                 for(int column=0;column<mat3d[slab][row].length;column++){
                     System.out.print(mat3d[slab][row][column]+" ");
        }
        System.out.println();
    }
        }
    }
    
  public static int findMin(int [][][] mat3d){//find the min 
       int min=999;
       for(int slab=0;slab<3;slab++){
               for(int row=0;row<mat3d[slab].length;row++){
                   for(int column=0;column<mat3d[slab][row].length;column++){
                   if(mat3d[slab][row][column]<min){
                       min=mat3d[slab][row][column];
                   }
                   
   }
}
}
return min;
}
 
 public static void sort(int [][]x){//sort the 2d matrix
     for(int i=0;i<7;i++){
         selectionsort(x[i]);
     }
     
         sort2(x);
     
 }
 
 public static void selectionsort(int [] x){//sort the row 
     for(int i=0;i<x.length-1;i++){
         int currentmin=x[i];
         int currentindex=i;
         for(int j=i+1;j<x.length;j++){
             if(x[j]<currentmin){
                 currentmin=x[j];
                 currentindex=j;
             }
         }
         if(currentindex!=i){
             x[currentindex]=x[i];
             x[i]=currentmin;
         }
     }
     
     
 }
  
public static void sort2(int [][] mat3d){//sort the first colum of each row
       int temp[]={0,0,0,0,0,0,0,0,0};
       for(int row=0;row<7;row++){
       for(int row2=row+1;row2<7;row2++){
           int index=0;
       while(mat3d[row2][index]<mat3d[row][index]){
           temp=mat3d[row2];
           mat3d[row2]=mat3d[row];
           mat3d[row]=temp;
           
       }
   }


}

}

}//end of class