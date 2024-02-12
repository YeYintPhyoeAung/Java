public class UsingDemo {

    public static void main(String[] args) {
        
        int result = Calculator.add(10, 5);
        System.out.println(result);

        Calculator calc = new Calculator();
        result = calc.minus(10, 5);
        System.out.println(result);

        int output = Calculator.divide(40, 2);
        System.out.println(output);

    }
}