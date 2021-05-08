package foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(0,0);

//        arrayList.remove(2);
        System.out.println(Arrays.toString(arrayList.toArray()) + arrayList.size());
//        HashMap hashMap = new HashMap();
    }
}
