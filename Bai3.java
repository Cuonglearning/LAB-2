package javaapplication2;
/**tinh tien dien theo phuong phap luy tien**/
import java.util.Scanner;

public class Bai3 {

    public static void tienDien() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hay nhap so dien su dung:");
        double soDien=scan.nextDouble();
        if (soDien<50){
            System.out.println("So tien la:"+soDien*1000);
        }
        else{
            System.out.println("So tien la:"+50*1000 + (soDien - 50)*1200);
        }
        
    }
    
}
