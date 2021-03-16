package foundation.interfaceImpl.impl;

import foundation.interfaceImpl.IInterview;
import sun.awt.IconInfo;

public class Main {
    public static void main(String[] args) {
        IInterview interview = new GoogleImpl();
        IInterview interview2 = new FacebookImpl();
    }
}
