public class Main {
    public static void main(String[] args) {
//задание 1
        int case1 = 0;
        while (case1 < 10) {
            case1++;
            System.out.print(case1 + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
//задание 2
        int friday = 1;
        while (friday < 31) {
            friday += 7;
            if (friday < 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Пора готовить отчет");
            }
        }
//задание 3
        int yearStarting = 0;
        for (; yearStarting <=2122; yearStarting += 79) {
            if (yearStarting >=1822) {
                System.out.println(yearStarting);
            }

        }
    }
}