package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

public class Bai4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Giai phuong trinh bac nhat.");
        System.out.println("2.Giai phuong trinh bac hai.");
        System.out.println("3.Tinh tien dien.");
        System.out.println("4.thoat ung dung.");
        System.out.println("Hay chon mot trong cac chuc nang:");
        int chon=scan.nextInt();
        switch (chon){
            case 1:
                Bai1.phuongTrinhBacNhat();
                break;
            case 2:
                Bai2.phuongTrinhBacHai();
                break;
            case 3:
                Bai3.tienDien();
                break;
            default:
                System.exit(0);
    }
    
}
}
