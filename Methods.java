public class Methods {

    public static void main(String[] args) {
        // Demo demo = new Demo();
        // demo.add(10, 2);
    }

    //How to write Methods
/*
 * 1 - Return Types
 * 2 - Method Name
 * 3 - Arguments
 * 4 - Method Body
*/

// Method Name + Arguments list = Method Signature

    void hello() {
        return ;
    }

    void hello(String name) {}
    //You can write methods which have "SAME NAME" but "DIFFERENT ARGUMENTS" in Java. It's called as "METHOD OVERLODING".

    void hello(String name, int count) {}

    //Varargs{...} --> (Variable Arguments) ---> Varargs Parameter must be the "Last Parameter".
    void hello(String ... names) {} 
    // "OR"
    void hello(int count, String ... names) {}

    int add(int a , int b) {
        // return '0';
        return a + b;
    }
}