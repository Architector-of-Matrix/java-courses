import java.util.Scanner;

public class InteractRunner {

    private static boolean clean = true;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";

            while (true) {
                System.out.println("Please select needed action: ");
                System.out.println("1 - Sum");
                System.out.println("2 - Extract");
                System.out.println("3 - Multiply");
                System.out.println("4 - Devide");
                int action = Integer.valueOf(reader.next());
                String first;

                if(clean){
                    System.out.println("Enter first arg: ");
                    first = reader.next();
                } else {
                    System.out.println("First arg: ");
                    System.out.println(calc.getResult());
                    Integer firstInt = (Integer) calc.getResult();
                    first = firstInt.toString();
                }

                System.out.println("Enter second arg: ");
                String second = reader.next();

                switch (action) {
                    case 1:
                        //sum
                        calc.add(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case 2:
                        //Extract
                        calc.extract(Integer.valueOf(first), Integer.valueOf(second));
                        break;

                    case 3:
                        //Multiply
                        calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                    case 4:
                        //Devide
                        calc.devide(Integer.valueOf(first), Integer.valueOf(second));
                        break;
                }

                System.out.println("Result: " + calc.getResult());

                
                System.out.println("Exit : yes/no");
                exit = reader.next();
                if (exit.equals("yes")) {
                    break;
                }

                System.out.println("Clear : yes/no");

                if (reader.next().equals("yes")) {
                    calc.cleanResult();
                    clean = true;
                } else {
                    clean = false;
                }
            }

        } finally {
            reader.close();
        }
    }

}