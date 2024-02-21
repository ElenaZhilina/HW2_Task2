public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 300;

        if (replenishment >= 1000) {
            int bonus = replenishment / 100;
            System.out.println("количество бонусных рублей = " + bonus);
            System.out.println("итоговый счёт = " + (balance + replenishment + bonus));
        } else {
            System.out.println("количество бонусных рублей = 0");
            System.out.println("итоговый счёт = " + (balance + replenishment));
        }
    }
}