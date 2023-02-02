import java.text.ParseException;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai4 {
    public static void main(String[] args) throws ParseException {
        Scanner scin =new Scanner(System.in);
        System.out.print("Nhap ngay thang nam sinh(Ngay/Thang/Nam): ");
        String dateString = scin.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = simpleDateFormat.parse(dateString);
        int year = birthday.getYear();
        Date now = new Date();
        int yearnow = now.getYear();
        String result = yearnow >= year ? "Age: " + (yearnow - year) : "Tuoi khong duoc lon hon nam hien tai";
        System.out.println(result);
    }
}
