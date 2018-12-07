public class Task10 {
    public static void main(String[] args) {
        int numberFlat = 32;
        int numberFlatsOnFloor = 4;
        int numberFloors = 9;

        if (numberFlat>numberFloors*numberFlatsOnFloor) System.out.println("Некорректная квартира.");
        else System.out.println("Данная квартира находится на "+
                (int)Math.ceil((float)numberFlat/(float)numberFlatsOnFloor)+" этаже.");
    }
}
