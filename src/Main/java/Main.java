public class Main {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age);

        System.out.println(add(10,age));
    }

    public static int add(int a, int b) {
        for (int i = 0;  i < 10; i++) {
            b = a + b * i;
        }
        return  b;
    }
}
