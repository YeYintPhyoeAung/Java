public class Varargs {
    
    // public static void main(String[] args) {
    //     String [] array = {"A" , "B"};
        
    //     showArray("Hello" , array);
    // }

    // static void showArray(String [] array) {
    //     for(String str : array) {
    //         System.err.println(str);
    //     }
    // }

    // static void showArray(String string, String ... strs) {
    //     System.err.println("First " + string);
    //     for(String str : strs) {
    //         System.err.println(str);
    //     }
    // }

    public static void main(String[] args) {
        String [] array = {"A", "B", "C"};

        show("Hello" , array);
    }

    static void show(String [] strs) {
        for(String str : strs) {
            System.err.println(str);
        }
    }

    static void show(String string, String ... strs) {
        System.err.println("First " + string);
        for(String str : strs) {
            System.err.println(str);
        }
    }
}