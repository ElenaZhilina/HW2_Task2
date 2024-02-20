public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 300;

        if (y >= 1000) {
            int z = y / 100;
            System.out.println("количество бонусных рублей = " + z);
            System.out.println("итоговый счёт = " + (x + y + z));
        } else {
            System.out.println("количество бонусных рублей = 0");
            System.out.println("итоговый счёт = " + (x + y));
        }
    }
}