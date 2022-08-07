package com;
public class Column {
    public static int column(int r, int c, int swift, int [][] a,int dir){
        if(swift > c){
            swift = swift%c;
        }
        if (dir == 1){
            Column R = new Column();
            R.right(r,c,swift,a);}
        if(dir == 2){
        Column L = new Column();
        L.left(r,c,swift,a);
        }
        return 0 ;
    }
    public static int left(int r,int c,int swift,int [][] a){
        int i,j;
        System.out.println("Final Matrix Ready");
        for(i=0;i<r;i++){
            for(j=swift;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            for(j=0;j<swift;j++){
                System.out.print(a[i][j]+" ");
            }

        System.out.println();}

   return 0;
    }
    public static int right(int r, int c, int swift,int [][]a){
        int i,j;
        System.out.println("Final Matrix Ready");
        for (i=0;i<r;i++){
            for(j=r-swift;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            for(j=0;j<r-swift;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }
}
