import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean isValidKey = false;

        do {
            try {
                System.out.println("Enter a key:");
                String key = myScanner.next();
                printDetails(key);
                isValidKey = true;
            } catch (Exception e) {
                System.out.println("Caught an exception: " + e.getMessage());
                System.out.println("Please try again.");
            }
        } while (!isValidKey);
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }
}