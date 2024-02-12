public class StaticMethod {

    //Instance Variable
    String instanceMessage = "Instance Variable";

    //Static Variable
    static String message = "Static Variable";
    
    public static void main(String[] args) {
        StaticMethod method = new StaticMethod();
        method.instanceMethod();

        //This part is so important(amazing) because it is coming from the other java file called as "StaticDemo.java". See the output!.
         StaticDemo demo = new StaticDemo();
         demo.instanceMethod();

         String [] array = {"A", "B"};

        Varargs.show("Hello" , array);

        Methods meth = new Methods();
        meth.add(10, 5);

    }

    //Instance Method
    void instanceMethod() {
        System.out.println("Hello Instance Method");
        System.out.println(instanceMessage);
        System.out.println(message);

        //Instance Method
        greet();

        //Static Method
        hello();
    }

    //Instance Method
    void greet() {
        System.out.println("Hello java");
        System.out.println("Hello Test");
    }

    //Static Method
    static void hello() {
        System.out.println("Hello Static Method");
    }
}
