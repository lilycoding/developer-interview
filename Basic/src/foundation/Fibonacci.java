package foundation;
/**
 * 斐波那契数列
1、1、2、3、5、8、13、21、34
从第二项开始，第三项是前两项之和
F(1)=, F(2)=1, F(n)=F(n-1)+F(n-2) (n>=2)
 */
public class Fibonacci {

    static int count = 0;

    public static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            count++;
            for (int i = 0; i < count; i++) {
                System.out.print("-");
            }
            System.out.println(num);
            return fibonacci(num - 1) + fibonacci(num - 2);
        }        
    }
    //空间换时间
    static int max = Integer.MAX_VALUE;
    static int[] memorization = new int[max];

    public static int fibonacci2(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        fibonacci(5);
    } 
}
