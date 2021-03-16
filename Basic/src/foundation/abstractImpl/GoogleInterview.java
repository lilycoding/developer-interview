package foundation.abstractImpl;

import foundation.interfaceImpl.IInterview;

public class GoogleInterview extends Interview {

    @Override
    public void fail() {

    }

    @Override
    public void success() {
        TreeNode node = new TreeNode();
    }
    //内部类
    class TreeNode {
        int a;
        int b;
    }
}
