public class Main {
    public static void main(String[] args) {
        // Задание 1 \\
        int i = 1;
        while (i < 11){
            System.out.print(i++ + " ");
        }
        System.out.println(" ");
        for (int z = 10; z > 0; z--) {
            System.out.print(z + " ");
        }

        // Задание 2\\
        System.out.println(" ");
        int friday = 5;
        while (friday < 31){
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }

        // Задание 3\\
        int currentYear = 2022;
        for ( int cometYear = currentYear-200; cometYear < currentYear+100; cometYear++ ){
            if (cometYear % 79 == 0){
                System.out.println(cometYear);
            }
        }





    }
}