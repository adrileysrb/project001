package operations;

public class AdvancedOperations {

    public Double restDivision (Double a, Double b){
        return a%b;
    }

    public Double potentiation (Double a, Double b){

        for (int i = 0; i < b; i++) {
            a *= a;
        }
        return  a;
    }
}
