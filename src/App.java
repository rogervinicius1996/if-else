import java.util.Scanner;
public class App {
    public static void main(String[] args) {
     Triangulo t = new Triangulo();
     Scanner num = new Scanner(System.in);  
     System.out.println("digite lado 1");
     int la = num.nextInt();
     System.out.println("digite lado 2");
     int lb = num.nextInt();
     System.out.println("digite lado 3");
     int lc = num.nextInt();
     t.verificaTriangulo(la, lb, lc);
     System.out.println(t.verificaTriangulo(la, lb, lc));

     }
}

