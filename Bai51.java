package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

public class Bai51 {

    public static void main(String[] args) {
        int n,q;
        do{
        Scanner scan=new Scanner(System.in);
        System.out.println("Hay nhap so can kiem tra:");
        n=scan.nextInt();
        }while(n<=0);
        q=(int)Math.sqrt(n);
        if (q*q==n){
            System.out.println(n+"la so chinh phuong");
        }
        else{
            System.out.println(n+"khong la so chinh phuong");
        }
       
    }
    
}
