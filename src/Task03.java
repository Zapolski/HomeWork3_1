import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        String[] mas = {"кошка","собака","корова","лошадь","мышь","свинья","курица","баран","овца","осёл"};
        for (int i = 0; i < mas.length; i++) {
            System.out.println((i+1)+" - "+mas[i]);
        }
        System.out.println("Выберите животное из списка: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        if ((n>=1)&&(n<=10))System.out.print(mas[n-1]+" произносит ");
        switch (n){
            case 1:
                System.out.println("\"мяу\"");
                break;
            case 2:
                System.out.println("\"гав\"");
                break;
            case 3:
                System.out.println("\"му\"");
                break;
            case 4:
                System.out.println("\"иго-го-го\"");
                break;
            case 5:
                System.out.println("\"пи-пи\"");
                break;
            case 6:
                System.out.println("\"хрю-хрю\"");
                break;
            case 7:
                System.out.println("\"ко-ко-ко\"");
                break;
            case 8:
                System.out.println("\"бееээээ\"");
                break;
            case 9:
                System.out.println("\"мееее\"");
                break;
            case 10:
                System.out.println("\"иа-иа\"");
                break;

        }

    }
}
