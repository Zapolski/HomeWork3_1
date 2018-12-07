import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите символ: ");

        String str = sc.nextLine();

        int code = (int)str.charAt(0);

        String result;

        if (Character.isDigit(code)){
            result="цифра";
        }
        else
            if (Character.isAlphabetic(code)){
                if (((code>=65)&&(code<=90))||((code>=97)&&(code<=122))){
                    result="латиница";
                } else result="кирилица";
            }
            else result="невозможно определить";

        System.out.printf("Введенный символ %s- %s",str,result);
    }
}
