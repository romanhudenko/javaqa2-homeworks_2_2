public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int initialBalance = 100;
        int bonusPerHundred = 1;
        int toAdd = 1100;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int toAddBonusMoney = 0;
        if (toAdd > 1000) {
            toAddBonusMoney = toAdd / 100 * bonusPerHundred;
        }

        int finalBalance = initialBalance + toAdd + toAddBonusMoney;

        System.out.println("Количество бонусных рублей: " + toAddBonusMoney);
        System.out.println("Результирующий баланс: " + finalBalance);
    }
}