
public class Calc {
    public static int FIRST_DATE;
    public static int SECOND_DATE;
    public static String ARITH_ACT;
    public static void calc(){
        Entering_data.welcome();
        // ввод данных

        FIRST_DATE = Entering_data.first_date();
        SECOND_DATE = Entering_data.second_date();
        ARITH_ACT = Entering_data.arith_action();

        // математическое действие

        if (ARITH_ACT=="+"){
            System.out.println(Math.sum(FIRST_DATE, SECOND_DATE));
        } else if (ARITH_ACT == "-") {
            System.out.println(Math.subt(FIRST_DATE, SECOND_DATE));
        } else if (ARITH_ACT == "*") {
            System.out.println(Math.mult(FIRST_DATE, SECOND_DATE));
        } else if (ARITH_ACT == "/") {
            System.out.println(Math.dev(FIRST_DATE, SECOND_DATE));
        }




    }

}
