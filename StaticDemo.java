public class StaticDemo {
    String instanceMessage = "Instance Variable";

    static String message = "Static Variable";

    public static void main(String[] args) {
        StaticDemo demo = new StaticDemo();
        demo.instanceMethod();
    }

    void instanceMethod() {
        System.out.println("Instance Method");
        System.out.println(instanceMessage);
        System.out.println(message);
        hello();
        greet();
    }
    
    static void hello() {
        System.out.println("Hello Static Method");
    }

    void greet() {
        System.out.println("Hello Java");
    }
}

/*
 * Hello Multi Line
 * Comments
 * This is Just a demo
 */

 /**
  * Java Doc Comments(Documentation Comments)
  */