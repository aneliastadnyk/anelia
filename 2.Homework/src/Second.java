import java.sql.SQLOutput;

public class Second {
    public static void main(String[] args) {

    /*    2. Є масив чисел {14, 876, 89, 35, 36, 874, 234, 223, 156, 77, 9}.
        Вивести в консоль всі парні числа і порахувати кількість непарних.*/
    int[] Number = {14, 876, 89, 35, 36, 874, 234, 223, 156, 77, 9};
    int numb = 0;

    for(int i = 0; i < Number.length; i++ ){
        if(Number[i] %2 == 0) {
            System.out.println("Even numbers" + Number[i]);
        }
        else{
            numb++;
        }
        System.out.println("Odd numbers" + numb);
        }
    }

    }
