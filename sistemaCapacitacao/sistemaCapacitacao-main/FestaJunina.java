import java.util.Scanner;

public class FestaJunina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int esc = in.nextInt();
        int merc = in.nextInt();
        int loja = in.nextInt();

        int var1 = esc - merc;
        int var2 = loja-merc;
        int var3 = loja - esc;
        System.out.print(var1+var2+var3);
    }
}