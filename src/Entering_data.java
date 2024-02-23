import java.util.Scanner;
public class Entering_data {

    static Scanner sc = new Scanner(System.in);

    public static void welcome (){
        System.out.println("Привет! Давай считать!");
    }

    public static int first_date (){

        System.out.println("Введите первое число: ");
        int res = sc.nextInt();
        sc.close();
        return res;
    }
    public static int second_date (){

        System.out.println("Введите второе число: ");
        int res = sc.nextInt();
        sc.close();
        return res;
    }

    public static String arith_action (){
        System.out.println("Введите арифметическое действие: ");
        String res = sc.nextLine();
        sc.close();
        return res;
    }
}
