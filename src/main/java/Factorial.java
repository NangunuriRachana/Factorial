public class Factorial {
    private Object number;

    public Factorial(Object number) {
        this.number = number;
    }

    public int calculateFactorial(){
        if (!( this.number instanceof Integer)){
            throw new IllegalArgumentException("Input should be Integer type");
        }
        int number= (int) this.number;
        if (number < 0){
            throw new IllegalArgumentException("Input should be positive integer");
        }
        if( number == 0 || number == 1){
            return 1;
        }
        int factorial=1;
        for (int value = 2; value <= number ; value++) {
            factorial*=value;
        }
        return factorial;
    }
}
