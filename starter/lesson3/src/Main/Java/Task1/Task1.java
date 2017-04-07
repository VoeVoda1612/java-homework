package Task1;


public class Task1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;

        x += y - x++ * z;
        System.out.println("x += y - x++ * z -------- x="+x);

        z = --x - y * 5;
        System.out.println("z =--x - y * 5   -------- z="+z);

        y /= x + 5 % z;
        System.out.println("y /= x + 5 % z   -------- y="+y);

        z = x++ + y * 5;
        System.out.println("z = x++ + y * 5  -------- z="+z);

        x = y - x++ * z;
        System.out.println("x = y - x++ * z  -------- x="+x);
    }
}
