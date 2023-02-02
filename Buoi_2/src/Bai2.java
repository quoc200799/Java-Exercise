import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //ax2+bx+c=0
        Scanner scin = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = scin.nextFloat();
        System.out.print("Nhap b: ");
        float b = scin.nextFloat();
        System.out.print("Nhap c: ");
        float c = scin.nextFloat();
        float delta = b*b-4*a*c;
        double x1 = (double) (-b-Math.sqrt(delta))/(2*a);
        double x2 = (double) (-b+Math.sqrt(delta))/(2*a);
        double x = (double) -b/(2*a);
        if (delta > 0)
            System.out.printf("Phuong trinh co 2 nghiem:\nx1: %.2f"+"\nx2: %.2f",x1 ,x2);
        if (delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        if (delta == 0)
            System.out.println("Phuong trinh co nghiem kep: "+x);
    }
}
