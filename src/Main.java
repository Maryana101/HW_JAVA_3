public class Main {
    public static void main(String[] args) {

        int balance;
        int income;
        int bonusItem;
        int bonus = 0;


        balance = 100;
        income = 1100;
        bonusItem = 100;

        if (income > 1000) {
            bonus = income / bonusItem;
        }

        balance += bonus + income;

        System.out.println("Начислено " + bonus + " бонусных рублей. Итого на счету " + balance + " рублей");
    }
}