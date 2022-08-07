package com;
import java.util.*;
public class input {
    static void inputs (){
        Scanner sc = new Scanner(System.in);
        int i,j,r,c,swift,type,dir;
        System.out.println("Enter number of Rows");
        r = sc.nextInt();
        System.out.println("Enter number of Column");
        c = sc.nextInt();
        System.out.println("Enter number times Swifting needed");
        swift = sc.nextInt();
        System.out.println("Enter Coordinate to be Swifted\nFor column enter 1\nFor row enter 2");
        type = sc.nextInt();
        System.out.println("Enter the direction of swifting\nEnter 1 for Forward\nEnter 2 for Backward");
        dir = sc.nextInt();
        int [][] a = new int [r][c];
        System.out.print("Enter Matrix Elements\n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(type == 1){
            Column calls = new Column();
            calls.column(r,c,swift,a,dir);
        }
        if(type == 2){
            Row calls = new Row();
            calls.Rows(r,c,swift,a,dir);
        }
        }
}
