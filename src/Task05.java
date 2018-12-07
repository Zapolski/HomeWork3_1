import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату рождения:");
        System.out.print("день: ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.print("месяц: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.print("год: ");
        int year = Integer.parseInt(sc.nextLine());

        String znak="";
        switch (month) {
            case 1:
                if (day < 20) {
                    znak = "Козерог";
                } else {
                    znak = "Водолей";
                }
                break;
            case 2:
                if (day < 18) {
                    znak = "Водолей";
                } else {
                    znak = "Рыбы";
                }
                break;
            case 3:
                if (day < 21) {
                    znak = "Рыбы";
                } else {
                    znak = "Овен";
                }
                break;
            case 4:
                if (day < 20) {
                    znak = "Овен";
                } else {
                    znak = "Телец";
                }
                break;
            case 5:
                if (day < 21) {
                    znak = "Телец";
                } else {
                    znak = "Близнецы";
                }
                break;
            case 6:
                if (day < 21) {
                    znak = "Близнецы";
                } else {
                    znak = "Рак";
                }
                break;
            case 7:
                if (day < 23) {
                    znak = "Рак";
                } else {
                    znak = "Лев";
                }
                break;
            case 8:
                if (day < 23) {
                    znak = "Лев";
                } else {
                    znak = "Дева";
                }
                break;
            case 9:
                if (day < 23) {
                    znak = "Дева";
                } else {
                    znak = "Либра";
                }
                break;
            case 10:
                if (day < 23) {
                    znak = "Либра";
                } else {
                    znak = "Скорпион";
                }
                break;
            case 11:
                if (day < 22) {
                    znak = "Скорпион";
                } else {
                    znak = "Стрелец";
                }
                break;
            case 12:
                if (day < 22) {
                    znak = "Стрелец";
                } else {
                    znak = "Козерог";
                }
                break;
        }

        String[] animals = {"Обезьяна","Петух","Собака","Кабан","Крыса",
                "Бык","Тигр","Кролик","Дракон","Змея","Лошадь","Коза"};

        System.out.println("Знак: "+znak);
        System.out.println("Год: "+animals[year%12]);
    }
}
