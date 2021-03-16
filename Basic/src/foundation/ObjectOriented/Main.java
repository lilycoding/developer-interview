package foundation.ObjectOriented;

public class Main {

    public static void main(String[] args) {
        SingleDog coder = new Coder();
        SingleDog teacher = new Teacher();
        //重写singledog
        coder.work();
        //继承singledog
        coder.play();

        Coder coder2 = (Coder) coder;
        coder2.cs();

//        if (coder instanceof Coder) {
//
//        }

    }
}
