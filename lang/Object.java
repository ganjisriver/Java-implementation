package lang;

/**
 * 역할: 모든 클래스 계층의 루트다.
 * 모든 클래스는 Object 클래스를 상속받는다.
 */
public class Object {

    /**
     * 해당 메서드는 Object에 있는 native 메서드를 JVM에 등록하기 위한 용도로 사용
     * Object 내부 native 메서드인 hashCode, wait, notify, notifyAll, clone 등을 불러온다.
     * @see <a href = "https://github.com/openjdk/jdk/blob/master/src/hotspot/share/classfile/javaClasses.cpp#L105-L118">Open JDK Github</a>
     */
    private static native void registerNatives();
    static {
        registerNatives();
    }

    /**
     * 메서드가 final로 선언되어 있기 때문에, 따로 구현할 수가 없다.
     * Object객체가 모든 객체의 최상위 객체이기 때문에 자동으로 오버라이드 된다.
     * 해당 메서드는 런타임 환경에서의 객체타입을 반환한다.
     */
    public final native Class<?> getClass1();


}
