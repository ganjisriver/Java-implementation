package lang;

public class Object {
    /**
     * 역할: 모든 클래스 계층의 루트다.
     * 모든 클래스는 Object 클래스를 상속받는다.
     */

    /**
     * 해당 native 메서드는
     *
     */
    private static native void registerNatives();
    static {
        registerNatives();
    }
}
