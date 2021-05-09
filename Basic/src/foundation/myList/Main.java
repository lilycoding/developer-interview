package foundation.myList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import foundation.myList.impl.ArrayListImpl;

public class Main {
    public static void main(String[] args) {
        ArrayListImpl arrayList = new ArrayListImpl();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(0, 0);
//        arrayList.remove(1);
//        arrayList.removeElement(0);
//        arrayList.print();
//        arrayList.set(0,1);
//        System.out.println(arrayList.get(0));

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.remove(0);
        arrayList.print();
    }
}
