public class First {
    public static void main(String[] args) {

      /*1. Є  масив з віком студентів {14, 16, 28, 34, 25, 23, 17, 18, 22}.
        Треба для кожного студента якому більше  або рівно 18 років вивести в консоль повідомлення,
                що він повнолітній. І порахувати кількість повнолітніх студентів.     */
     int[] Age = {14, 16, 28, 34, 25, 23, 17, 18, 22};
     int stsAge=0;

     for(int i= 0; i < Age.length; i++){
         if(Age[i] >= 18){
             System.out.println("You are Adult your age is:"+ Age[i]);
             stsAge++;
         }
     }

        System.out.println("Adult students is " + stsAge );
    }
}
