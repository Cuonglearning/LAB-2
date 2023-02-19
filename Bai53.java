package javaapplication2;

import java.util.Scanner;

public class Bai53 {

    public static void main(String[] args) {
        int n,a,b,c;/**a hang don vi b hang chuc c hang tram**/
        Scanner scan=new Scanner(System.in);
        System.out.println("Hay nhap so can doc:");
        n=scan.nextInt();
        a=n%10;
        b=(n/10)%10;
        c=n/100;
        if (n<100||n>999){
            System.out.println("Hay nhap so co hai chu so!");
        }
        else{
            switch(c){
                case 1:System.out.print("mot tram ");break;
                case 2:System.out.print("hai tram ");break;
                case 3:System.out.print("ba tram ");break;
                case 4:System.out.print("bon tram ");break;
                case 5:System.out.print("nam tram ");break;
                case 6:System.out.print("sau tram ");break;
                case 7:System.out.print("bay tram ");break;
                case 8:System.out.print("tam tram ");break;
                case 9:System.out.print("chin tram ");break;
            }
            switch(b){
                case 1:System.out.print("muoi ");break;
                case 2:System.out.print("hai muoi ");break;
                case 3:System.out.print("ba muoi ");break;
                case 4:System.out.print("bon muoi ");break;
                case 5:System.out.print("nam muoi ");break;
                case 6:System.out.print("sau muoi ");break;
                case 7:System.out.print("bay muoi ");break;
                case 8:System.out.print("tam muoi ");break;
                case 9:System.out.print("chin muoi ");break;
                default:System.out.print("le ");break;
            }
            switch(a){
                case 1:System.out.print("mot");break;
                case 2:System.out.print("hai");break;
                case 3:System.out.print("ba");break;
                case 4:System.out.print("tu");break;
                case 5:System.out.print("nam");break;
                case 6:System.out.print("sau");break;
                case 7:System.out.print("bay");break;
                case 8:System.out.print("tam");break;
                case 9:System.out.print("chin");break;
                default:System.out.print(" ");
            }
        }

    }
    
}
