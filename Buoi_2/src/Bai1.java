import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // ax+b=0
        Scanner scannerin = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scannerin.nextFloat();
        System.out.print("Nhap b: ");
        float b = scannerin.nextFloat();
        double y = (double) -b/a;
        String x = a != 0 ? "Phuong trinh co nghiem x: "+ y :"Phuong trinh vo nghiem";
        System.out.println(x);
    }
}
