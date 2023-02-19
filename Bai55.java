package javaapplication2;

import java.util.Scanner;
import java.util.Arrays;

public class Bai55 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,i,c;
        do{
            System.out.println("Hay nhap so phan tu cua mang:");
            n=scan.nextInt();
        }while(n<=0);
        int mang[]=new int[n];
        for (i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            mang[i]=scan.nextInt();
        }
        System.out.println("Nhap so nguyen x:");
        int x=scan.nextInt();
        for(c=i=0;i<n;i++){
            if(mang[i]!=x){
                mang[c]=mang[i];
                c++;
            }
        }
        n=c;
        int tam=mang[0];
        for( i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (mang[i]>mang[j]){
                    tam=mang[j];
                    mang[j]=mang[i];
                    mang[i]=tam;
                }
            }
        }
        System.out.println("Mang sau khi xoa "+x+" va sap xep la: ");
        for (i=0;i<n;i++){
            System.out.print(mang[i]+"\t");
        }
    }
    
}
