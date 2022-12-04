package operations;

import exceptions.DivisionByZero;

public class BasicOperations {

    public Double sum(Double a, Double b){
        return a+b;
    }

    public Double subtract(Double a, Double b){
        return a-b;
    }

    public Double divide(Double a, Double b) throws DivisionByZero {
        if(a == 0.0 || b == 0.0){
            throw new DivisionByZero("Division by zero is not allowed!");
        }
        return a/b;
    }

    public Double multiply(Double a, Double b){
        return a * b;
    }
}
