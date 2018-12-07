import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = Integer.parseInt(sc.nextLine());

        int result = 365;
        if ((year%4==0)&&(year%100!=0)) result = 366;

        System.out.printf("Количество дней в %d году: %s",year,result);
    }
}
