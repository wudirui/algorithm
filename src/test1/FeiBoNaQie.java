package test1;

/**
 * 斐波那契数列
 */
public class FeiBoNaQie {

    /**
     * 递归
     */
    public static int sum(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        return sum(num - 1) + sum(num - 2);

    }

    public static int fSum(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        int sum = 1;
        int preSum = 0;
        for (int i = 2; i <= num; i++) {
            int tmp = sum;
            sum = sum + preSum;
            preSum = tmp;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fSum(8));
        System.out.println(sum(8));

    }
}
