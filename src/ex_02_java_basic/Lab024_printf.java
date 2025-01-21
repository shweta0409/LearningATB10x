package ex_02_java_basic;

public class Lab024_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("your variable name is %d",a);
        //%d is used for int, byte, long, short;
        //%f float;
        //%b boolean;

        int b = 10;
        System.out.println();
        System.out.printf("%d",b);
    }
}
