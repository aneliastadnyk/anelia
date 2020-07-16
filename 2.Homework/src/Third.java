public class Third {
    public static void main(String[] args) {
        /*3. Заповнити в циклі, масив числами Фібоначчі.
        Масив має бути з 10 елементів. Числа Фібоначчі починаються із 1 і 1.
         Далі кожне наступне є сумою двох попередніх. Наприклад: 1, 1, 2, 3, 5, 8 і т.д.*/

            int[] FibonacciTerm = new int[10];
        FibonacciTerm[0] = 1;
        FibonacciTerm[1] = 1;
            for(int i = 2; i < FibonacciTerm.length; i++){
                FibonacciTerm[i] = FibonacciTerm[i - 1] + FibonacciTerm[i - 2];
            }

            System.out.print("Fibonacci numbers:");
            for (int i = 0; i < FibonacciTerm.length; i++) {
                System.out.print(FibonacciTerm[i] + " ");
            }


    }
}
