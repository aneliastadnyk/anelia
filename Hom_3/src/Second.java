public class Second {
    public static void main(String[] args) {
        /*2) створити масив з 15 юзерів і розділити їх на такі масиви: повнолітні і одружені, повнолітні, неодружені*/

        User[] user = new User[15];
        user[0] = new User("Natalia", "Uniat",18,false);
        user[1] = new User("Liza", "Stadnyk",41,true);
        user[2] = new User("Andrew", "Oliarnyk",19,false);
        user[3] = new User("Viktoria", "Matskiv",17,false);
        user[4] = new User("Roman", "Pulupiv",9,false);
        user[5] = new User("Ruslan", "Nazar",23,true);
        user[6] = new User("Kate", "Holinska",21,false);
        user[7] = new User("Tania", "Repetylo",24,true);
        user[8] = new User("Anastasia", "Halun",7,false);
        user[9] = new User("Anna", "Vietrova",17,false);
        user[10] = new User("Elisabeth", "Kalenska",13,false);
        user[11] = new User("Mary", "Zayats",22,true);
        user[12] = new User("John", "Kril",12,false);
        user[13] = new User("Tom", "Smerechynskii",23,true);
        user[14] = new User("Maria", "Tymkiv",12,false);

        int countAdult = 0;
        int countMarried = 0;

        for(int i = 0; i < user.length; i++) {
            if (user[i].age >= 18){
                countAdult++;
            }
        }
        for(int i = 0; i < user.length; i++) {
            if (user[i].isMarried){
                countMarried++;
            }
        }
        User[] adultUsers = new User[countAdult];
        User[] marriedUsers = new User[countMarried];
        User[] minorUsers = new User[15 - countAdult];
        User[] freeUsers = new User[15 - countMarried];
        int pos = 0;
        int secPos = 0;

        for (int i = 0; i < user.length; i++){
            if (user[i].age >= 18){
                adultUsers[pos] = user[i];
                pos++;
            }
            else {
                minorUsers[secPos] = user[i];
                secPos++;
            }
        }
        pos = 0;
        secPos = 0;
        for (int i = 0; i < user.length; i++){
            if (user[i].isMarried){
                marriedUsers[pos] = user[i];
                pos++;
            }
            else {
                freeUsers[secPos] = user[i];
                secPos++;
            }
        }

        System.out.println("Adult Users:");
        for(User u : adultUsers){
            System.out.println(u.fullInfo());
        }
        System.out.println("******************************");

        System.out.println("Minor Users: ");
        for(User u : minorUsers){
            System.out.println(u.fullInfo());
        }
        System.out.println("******************************");

        System.out.println("Married Users: ");
        for(User u : marriedUsers){
            System.out.println(u.fullInfo());
        }
        System.out.println("******************************");

        System.out.println("Free Users: ");
        for(User u : freeUsers){
            System.out.println(u.fullInfo());
        }

    }

        }



