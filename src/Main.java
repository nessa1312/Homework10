public class Main {
    int[] arr = generateRandomArray();

    // 1 usages
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задача 1
    public static int[] array = generateRandomArray();

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int sumOfSpending = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfSpending = sumOfSpending + array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumOfSpending + " рублей");

        // Задача 2
        System.out.println("Задача 2");
        int maxSpending = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxSpending) {
                final int current = array[i];
                maxSpending = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");
        int minSpending = 200000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minSpending) {
                minSpending = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");

        // Задача 3
        System.out.println("Задача 3");
        int averageSpending = sumOfSpending;
        averageSpending = sumOfSpending / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + "");

        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }
}
