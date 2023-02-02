import java.util.Scanner;

public class Bai5a {
    public static void main(String[] args) {
        Scanner scin = new Scanner(System.in);
        /*a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và
        cuối cùng của ký tự đó trong chuỗi vừa nhập.*/
        System.out.print("Nhap chuoi bat ky: ");
        String a = scin.nextLine();
        System.out.print("Nhap mot ky tu: ");
        char b = scin.next().charAt(0);
        String str = Character.toString(b);
        boolean check = a.contains(str);
        if(check)
        System.out.println("Vi tri xuat hien dau tien la: " +a.indexOf(str) +"\nVi tri xuat hien cuối cùng la: " +a.lastIndexOf(str));
        else
        System.out.println("Khong co ky tu xuat hien trong chuoi!!");

    }
}
