package javaapplication2;

import java.util.Scanner;

public class Bai54 {/**giaithuaa**/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        do{
        System.out.println("Nhap so n:");
        n=scan.nextInt();
        }while(n<=0);
        int kq=1;
        int i=1;
        while(i<=n){
            kq=kq*i;
            i++;
        }
        System.out.println("Giai thua cua " + n + " la " + kq);
    }
    
}
