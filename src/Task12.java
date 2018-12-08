import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер билета (шестизначное число): ");
        int n = Integer.parseInt(sc.nextLine());

        int sum1=getSum(n);
        n /= 1000;
        int sum2=getSum(n);

        if (sum1==sum2){
            System.out.println("Билет с таким номером счастливый!");
        }else{
            System.out.println("Билет с таким номером несчастливый!");
        }
    }

    public static int getSum(int n) {
        int sum=0;
        for (int i = 0; i < 3; i++) {
            int tmp = n%10;
            sum += tmp;
            n /= 10;
        }
        return sum;
    }
}
