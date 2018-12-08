import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коэффициент квадратного уравнения (a*x*x+b*x+c=0): ");
        System.out.print("коэффициент а(а не равно 0): ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.print("коэффициент b: ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.print("коэффициент c: ");
        float c = Float.parseFloat(sc.nextLine());

        float d = b*b-4*a*c;

        if (d<0){
            System.out.println("У данного квадратного уравнения нет действительных корней!");
        }else{
            if (d==0){
                float result = -b/(2*a);
                System.out.printf("Корни х1=х2=%.2f",result);
            }else{
                double result1 = (-b+Math.sqrt(d))/(2*a);
                double result2 = (-b-Math.sqrt(d))/(2*a);
                System.out.printf("Корень х1=%.2f\n",result1);
                System.out.printf("Корень х2=%.2f\n",result2);
            }
        }
    }

}
