import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        float a = scin.nextFloat();
        System.out.print("Nhap canh b: ");
        float b = scin.nextFloat();
        double s = a*b;
        float c = (a+b)*2;
        System.out.println("Dien tich cua HCN "+s);
        System.out.println("Chu vi cua HCN: "+c);
    }
}
