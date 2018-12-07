import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки:");
        System.out.print("x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("y: ");
        int y = Integer.parseInt(sc.nextLine());

        int ch = 0;
        if ((x>0)&&(y>0)) ch=1;
        if ((x<0)&&(y>0)) ch=2;
        if ((x<0)&&(y<0)) ch=3;
        if ((x>0)&&(y<0)) ch=4;
        System.out.printf("Точка с коррдинатами (%d,%d) находится в %d-й четверти.",x,y,ch);

    }

}
