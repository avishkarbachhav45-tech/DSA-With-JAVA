public class CreateArray {
    public static void main(String[] args) {
        // Creating an Array
        int marks[] = new int[50];
        int numbers[] = {1, 2, 3};
        String cricketers[] = {"Rohit", "Virat", "Boomrah"};



        // Example usage
        System.out.println("First cricketer: " + cricketers[0]);

        // Print all numbers
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nMarks array length: " + marks.length);
    }
}
