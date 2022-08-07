package com;
public class Row {
public static void Rows(int r, int c, int swift, int [][] a, int dir){
    if(swift > c){
        swift = swift%c;
    }
    if(dir==1){
        up(r,c,swift,a);
    }
    if(dir==2){
        down(r,c,swift,a);
    }
}
  public static void down(int r, int c, int swift, int [][] a){
    int i,j;
      System.out.println("Final Matrix Ready");
      for(i=swift;i<r;i++){
        for(j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
      for(i=0;i<swift;i++){
          for(j=0;j<c;j++){
              System.out.print(a[i][j]+" ");
          }
          System.out.println();}
    }
    public static void up(int r, int c, int swift, int [][] a){
        int i,j;
        System.out.println("Final Matrix Ready");
        for(i=r-swift;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    for(i=0;i<r-swift;i++){
            for(j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
