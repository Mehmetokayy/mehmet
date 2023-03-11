package practices.practice04;

public class Budget {

    static int familyBudget;
    int pocketMoney;

    void getPocketMoney(int money) {

        if (familyBudget >= money) {
            pocketMoney += money;
            familyBudget -= money;
        }
    }

    void getSalary(int salary) {
        familyBudget += salary;
    }

    void spendPocketMoney(int money) {
        if (money <= pocketMoney && money > 0) {
            pocketMoney -= money;
        }
    }

    static void spendFamilyBudget(int money) {

        if (money <= familyBudget) {
            familyBudget -= money;
        }
    }
}