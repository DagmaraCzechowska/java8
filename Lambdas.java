package cwiczenia;

public class Lambdas {
    public static void main(String[] args) {
        //f(x) -> x*x

        MathOperation addition = (a, b)-> a+b;

        MathOperation subtraction = (a,b) -> a-b;

        MathOperation multiplication = (a,b) -> a*b;

        MathOperation split = (a,b) -> a/b;


        double additionResult = executeOperation(3.0, 15.0, addition);
        System.out.println("Wynik operacji (a, b)-> a+b: "+ additionResult);

        double subtractionResult = executeOperation(25.0, 15.0, subtraction);
        System.out.println("Wynik operacji (a, b)-> a-b: "+ subtractionResult);

        double multiplicationResult = executeOperation(8.0, 9.0, multiplication);
        System.out.println("Wynik operacji (a,b) -> a*b: " + multiplicationResult);

        double splitResult = executeOperation(16.0, 8.0, split);
        System.out.println("Wynik operacji (a,b) -> a/b: " + splitResult);


    }
    static double executeOperation (double a, double b, MathOperation operation){
        double result = operation.operate(a, b);
        return result;

    }
}
