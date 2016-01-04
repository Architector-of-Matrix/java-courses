public class Calculate {

    public static void main(String[] args) {
        System.out.println("calculate...");
        
        double first = Double.valueOf(args[0]);
        double second = Double.valueOf(args[1]);
        double summ = first + second;
        double pow = Math.pow(first, second);

        System.out.println("Sum: " + summ);
        System.out.println("Power: " + pow);

    }

}