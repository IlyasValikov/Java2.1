import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int amount = 200;
        int value = 1200;
        int bonus = 1000;

        int all;
        if (value > bonus) {
            all = value / 100 + value + amount;
        } else {
            all = amount + value;
        }
        System.out.println("Итоговый счет = " + all);
    }
}