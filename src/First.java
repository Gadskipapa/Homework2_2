import java.util.Scanner;

public class First {

    public static void hello(){
        System.out.println("Как тебя зовут?");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Превед, " + name);
        }

        public static void calc (int num1, int num2) {
            System.out.println((4*((double)num1+(double)num2-1) / 3));
        }



}
