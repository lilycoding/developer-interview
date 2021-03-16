package foundation.interfaceImpl;

public interface IInterview {

    void fail();
    void success();

    default void temp() {
        System.out.println("dfdsa");
    }
    static void temp2() {
        System.out.println("dfsaf");
    }
}
