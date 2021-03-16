package foundation.exceptionImpl;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void test1() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("输入第一个数字");
            int firstNumber = scanner.nextInt();
            System.out.println("输入第二个数字");
            int secondNumber = scanner.nextInt();
            System.out.println("最后除法的结果：" + firstNumber / secondNumber);
        } catch (InputMismatchException e) {
            System.out.println("输入不合法");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("除数为0");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("发现错误");
            e.printStackTrace();
        } finally {
            System.out.println("程序结束");
        }
    }


    public static void test2() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int firstNumber = scanner.nextInt();
        System.out.println("输入第二个数字");
        int secondNumber = scanner.nextInt();
        System.out.println("最后除法的结果：" + firstNumber / secondNumber);
    }

    public static void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int firstNumber = scanner.nextInt();
        if (firstNumber > 100) {
            throw new IllegalArgumentException("超出100");
        }
        System.out.println("输入第二个数字");
        int secondNumber = scanner.nextInt();
        System.out.println("最后除法的结果：" + firstNumber / secondNumber);
    }


    public static void test4() throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int firstNumber = scanner.nextInt();
        if (firstNumber > 100) {
            throw new MyException();
        }
        System.out.println("输入第二个数字");
        int secondNumber = scanner.nextInt();
        System.out.println("最后除法的结果：" + firstNumber / secondNumber);
    }


    public static void main(String[] args) {
        try {
            test4();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}
