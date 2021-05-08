package foundation;

public class DataScale {
    public static void dataScale() {
        for (int i = 1; i < 9; i++) { //从1开始到8
            double num = Math.pow((double)i, 10); //num=10 100 1000 ..  1的1次幂，1的2次幂
            int sum = 0;

            long before = System.currentTimeMillis(); //开始时间
            for (int j = 0; j <= num; j++) {
                sum += j; //把这些数进行相加操作
            }
            long end = System.currentTimeMillis(); //结束时间

            long per = end - before;
            System.out.println("10^" + i + ": " + per);
        }
    }

    public static void main(String[] args) {
        dataScale();
    }
}
