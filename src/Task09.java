public class Task09 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 4;
        int x2 = 5;
        int y2 = 1;

        String result="";
        if ((x2>x1)&&(y2>y1)) result = "подъем дороги";
        else if ((x2>x1)&&(y2<y1)) result = "спуск дороги";
             else if ((x2==x1)&&(y2!=y1)) result = "отвесная дорога";
                  else if ((x2!=x1)&&(y2==y1)) result = "ровная дорога";

        System.out.println(result);
    }
}
