package operations;

public class AdvancedOperations {

    //TODO Implement divide operation
    public Double divide (){
       return 0.0;
    }

    //TODO Implement rooting operation
    public Double rooting (){
        return 0.0;
    }

    public Double potentiation (Double a, Double b){

        for (int i = 0; i < b; i++) {
            a *= a;
        }

        return  a;
    }
}
