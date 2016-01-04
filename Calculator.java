public class Calculator {

    private int result;

    public void add(int first, int second) {
        this.result = first + second;
    }

    public void extract(int first, int second) {
        this.result = first - second;

    }

    public void multiply(int first, int second) {
        this.result = first * second; 
    }

    public void devide(int first, int second) {
        this.result = (int) first / second;
    }

    public void power(int first, int second) {
        double powResult = Math.pow(Double.valueOf(first), Double.valueOf(second));
        this.result = (int) powResult; 
    }       

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }

}