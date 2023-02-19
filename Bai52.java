package javaapplication2;
import java.util.Scanner;

public class Bai52 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hay nhap so diem:");
        float n=scan.nextFloat();
        if ((n>=0)&&(n<5.0)) {
            System.out.println("Xep loai kem");
        }
        else if ((n>=5.0)&&(n<7.0)){
            System.out.println("Xep loai trung binh");
        }
        else if ((n>=7.0)&&(n<8.0)){
            System.out.println("Xep loai kha");
        }
        else if (n>=8.0){
            System.out.println("Xep loai gioi");
        }
        else{
            System.out.println("Diem khong hop le");
        }
    }
    
}
