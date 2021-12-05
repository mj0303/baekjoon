interface MyInterface1 {
    public void method1();
}
interface MyInterface2 extends MyInterface1 {
    public void method2();
}
class Demo implements MyInterface2 {
    Demo() {
        System.out.println("constructor");
    }
    public void method1() {
        System.out.println("implementation of method1");
    }
    public void method2() {
        System.out.println("implementation of method2");
    }
}
public class web {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.method1();
        demo.method2();
    }
}