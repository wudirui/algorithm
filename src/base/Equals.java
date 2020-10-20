package base;

/**
 * java中引用类型的比较和基础类型的比较，基础类型没有equals方法，只能用==进行比较
 * 关于引用类型的比较，object 的equals方法比较的地址，而String的equals方法比较是值。
 *
 */
public class Equals {
    private static int num1 = 12;
    private static int num2 = 12;

    public static void main(String[] args) {
        System.out.println(num1 == num2);
    }
}
