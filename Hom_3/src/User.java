public class User {
    /*
    1) Створити клас User(firstName, lastName, age, isMarried) зробити метод який виводитиме інфу чи юзер повнолітній.*/
    String firstName;
    String lastName;
    int age;
    boolean isMarried;

    public User(String firstName, String lastName, int age, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
    }

    public void isAdult() {
        if (age >= 18) {
            System.out.println(firstName + " " + lastName + " is Adult.");
        }
        else
            System.out.println(firstName + " " + lastName + " is not Adult.");
    }
    public String fullInfo() {
        return firstName + " " + lastName + " " + age  + isMarried;
    }

}
