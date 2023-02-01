public class Bai6 {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0;
        int a;
        int b;
        int c;
        a = 3;
        b = 6;
        c = 3;
        int delta = b*b - 4*a*c;
        double x1 = (double)(-b + Math.sqrt(delta)) / (2*a);
        double x2 = (double)(-b - Math.sqrt(delta)) / (2*a);
        double x = (double)(-b)/(2*a);
        if(delta > 0)
            System.out.println("Phương trình có 2 nghiệm: \n"+ "x1= "+ x1+"\n"+"x2= "+x2 );
        if(delta == 0)
            System.out.println("Phương trình có 1 nghiệm kép: "+x);
        if(delta < 0)
            System.out.println("Phương trình vô nghiệm");
    }
}
