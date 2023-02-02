import java.util.Scanner;

public class Bai5b {
    public static void main(String[] args) {
        /*b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =
“123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”*/
        Scanner scin = new Scanner(System.in);
        System.out.print("Nhap chuoi bat ky: ");
        String a = scin.nextLine();
        System.out.print("Nhap mot ky tu trong chuoi: ");
        String s1 = scin.next();
        boolean check = a.contains(s1);
        if(check) {
            System.out.print("Nhap mot ky tu thay the: ");
            String s2 = scin.next();
            System.out.println("Chuoi moi: " + a.replace(s1, s2));
        }
        else
            System.out.println("Khong co ky tu can tim xuat hien trong chuoi!!");
    }
}
