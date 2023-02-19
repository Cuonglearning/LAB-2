package javaapplication2;
/**giai phuong trinh bac hai**/

import java.util.Scanner;
import java.lang.Math;

public class Bai2{
public static void phuongTrinhBacHai() {
    Scanner scan=new Scanner(System.in);
    System.out.println("Nhap he so a,b,c:");
    float a=scan.nextFloat();
    float b=scan.nextFloat();
    float c=scan.nextFloat();
    if (a==0){
        if (b==0){/**truong hop a va b bang 0**/
            if (c==0){
                System.out.println("phuong trinh co vo so nghiem");
            }
            else{
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else{
            float x=-c/b;
            System.out.println("phuong trinh co mot nghiem:"+x);
        }
    }
    else{
        float D=b*b-4*a*c;
        if (D>0){
            double x1=((-b+Math.sqrt(D))/(2*a));
            double x2=((-b-Math.sqrt(D))/(2*a));
        System.out.println("phuong trinh co hai nghiem x1="+x1+"va x2="+x2);
        }
        else if (D==0){
            float x0=(-b/2*a);
            System .out.println("phuong trinh co nghiem kep x="+x0);
            
        }
        else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
    }

    
}

