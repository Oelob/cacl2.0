import java.util.Scanner;

public class Entering_data {

    Scanner sc = new Scanner(System.in);

    public void welcome (){
        System.out.println("Привет! Давай считать!");
    }

    public int first_date (){

        System.out.println("Введите первое число: ");
        int res = sc.nextInt();
        sc.close();
        return res;
    }
    public int second_date (){

        System.out.println("Введите второе число: ");
        int res = sc.nextInt();
        sc.close();
        return res;
    }

    public String arith_action (){
        System.out.println("Введите арифметическое действие: ");
        String res = sc.nextLine();
        sc.close();
        return res;
    }
}
