import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите час (0-23): ");
        int n = Integer.parseInt(sc.nextLine());

        if (n>=0){
            if ((n<6)){
                System.out.println("Доброй ночи!");
            }else{
                if (n<12){
                    System.out.println("Доброе утро!");
                }else{
                    if (n<18){
                        System.out.println("Добрый день!");
                    }else{
                        if (n<23)
                            System.out.println("Добрый вечер!");
                    }
                }
            }
        }
    }
}
