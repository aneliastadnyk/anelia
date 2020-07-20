public class Array {
    /*
    3) створити масив з 20 чисел, вивести індекси елементів які є парними
4) вивести середнє значення масиву
5) вивести з масиву числа які:діляться на 2,3 і5
*/
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 60, 30};
        int sum = 0;
        float averageValue;

        System.out.println("Indexes of pair numbers: ");
        for(int i : arr){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
            sum += i;
        }

        averageValue = sum / arr.length;
        System.out.println("\nAverage Value is " + averageValue);

        System.out.println("Numbers aliquot 2,3,5:");
        for(int i : arr) {
            if(i % 2 == 0
                    && i % 3 == 0
                    && i % 5 == 0){
                System.out.println(i);
            }
        }
        System.out.println("\n");

    }
}
