package javaapplication2;
/**giai phuong trinh bac nhat**/

import java.util.Scanner;

public class Bai1 {
public static void phuongTrinhBacNhat() {
    float a,b;
    double x;
    Scanner scan =new Scanner (System.in);
    System.out.println("Hay nhap a,b:");
    a=scan.nextFloat();
    b=scan.nextFloat();
    if (a==0){
        if (b==0){
            System.out.println("phuong trinh vo so nghiem");
        }else{
            System.out.println("phuong trinh vo nghiem");
        }
    }else{
    x=-b/a;
    System.out.println("Phuong trinh co nghiem x="+x);
    }
}
    
}
