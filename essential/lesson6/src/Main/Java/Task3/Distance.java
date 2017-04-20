package Task3;


public class Distance {
    public double  distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void print(){
        Converter.method1(distance);
        Converter.method2(distance);
        Converter.method3(distance);
    }

    public static class Converter{

        public static void method1(double distance){
            System.out.printf("Км %1$s => Миль %2$s\n",distance,distance*1.6);
        }
        public static void method2(double distance){
            System.out.printf("Км %1$s => Верст %2$s\n",distance,distance*1.066);
        }
        public static void method3(double distance){
            System.out.printf("Км %1$s => Морских миль %2$s\n",distance,distance*1.852);
        }
    }
}
