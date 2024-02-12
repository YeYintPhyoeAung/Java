public class ScopeDemo {

    public static void main(String[] args) {

        Demo demo = new Demo();

        demo.doSomething("Hello");
    }
}

/**
 * Class
 */
class Demo {
    
    //Constructor
    Demo() {
        System.out.println("Constructor : Body :" + body);
    }

    //Method
    void doSomething(String args) {

        System.out.println("Method : Body :" + body);
        //For Block
        for(int i= 0; i < 10; i++) {
            System.out.println("For Loop : Body :" + body + i);
        }
    }

    int body = 1;

    {
        String name = "Block Variable";
        //Code Block
        System.out.println("Code Block : Body :" + body + name);
    }
}
