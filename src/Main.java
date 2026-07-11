//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Задача 1
        System.out.println("\n");
        System.out.println("Задача 1");



        int[] inputArray1 = {1500, 3200, 800, 2750, 1900};

        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }

        double average = (double) sum / inputArray1.length;

        Object[] outputArray1 = {sum, max, min, average};


        System.out.print("inputArray1: [");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.print(inputArray1[i]);
            if (i < inputArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("outputArray1: [");
        for (int i = 0; i < outputArray1.length; i++) {
            if (outputArray1[i] instanceof Double) {
                double val = (Double) outputArray1[i];
                if (val == Math.floor(val)) {
                    System.out.print((long) val);
                } else {
                    System.out.printf("%.2f", val);
                }
            } else {
                System.out.print(outputArray1[i]);
            }
            if (i < outputArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //Задача 2
        System.out.println("\n");
        System.out.println("Задача 2");

        int[] inputArray2 = {50000, 75000, 30000, 90000, 45000};


        double[] outputArray2 = new double[inputArray2.length];


        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        System.out.print("inputArray2: ");
        for (int value : inputArray2) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("outputArray2: ");
        for (double value : outputArray2) {

            if (value == (int) value) {
                System.out.print((int) value + " ");
            } else {
                System.out.print(value + " ");
            }
        }
        System.out.println();
        // Задача 3
        System.out.println("\n");
        System.out.println("Задача 3");

        int[] inputArray3 = {4500, 5200, 3800, 6100, 5000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }
        System.out.print("inputArray3: [");
        boolean first = true;
        for (int value : inputArray3) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(value);
            first = false;
        }
        System.out.println("]");
        System.out.print("outputArray3: [");
        first = true;
        for (boolean value : outputArray3) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(value);
            first = false;
        }
        System.out.println("]");
        // Задача 4
        System.out.println("\n");
        System.out.println("Задача 4");



        int[] inputArray4 = {1500, 2300, -400, 1800, 900};

        boolean outputArray4 = true;


        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break;
            }
        }


        System.out.print("inputArray4: [");
        for (int i = 0; i < inputArray4.length; i++) {
            System.out.print(inputArray4[i]);
            if (i < inputArray4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("outputArray4: " + outputArray4);
        // Задача 5
        System.out.println("\n");
        System.out.println("Задача 5");

        int[] inputArray5 = {15000, -3000, 8000, 0, 12000};


        int outputArray5 = 0;


        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5++;
            }
        }


        System.out.print("inputArray5: [");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.print(inputArray5[i]);
            if (i < inputArray5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("outputArray5 (количество рентабельных месяцев): " + outputArray5);
    }
}



