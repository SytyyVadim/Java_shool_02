public class Main {
    public static void main(String[] args) {
    System.out.printf("равно = %s%n", Umn(3,5));
    System.out.printf("равно = %s%n", Umn(3.0,5.0));
    System.out.printf("равно = %s%n", Umn(3.0,5.0,4.4));
    }
    public static int Umn(int a, int b){
    return a*b;
    }
    public static double Umn(double a, double b){
        return a*b;
    }
    public static double Umn(double a, double b, double c){
        return a*b+c;
    }
}
