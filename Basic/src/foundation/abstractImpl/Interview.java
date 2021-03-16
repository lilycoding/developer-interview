package foundation.abstractImpl;

public abstract class Interview {
    //不确定是fail还是success
    public abstract void fail();
    public abstract void success();
    public void before() {
        System.out.println("刷题");
    }
    public void after() {
        System.out.println("h1b");
    }
}
