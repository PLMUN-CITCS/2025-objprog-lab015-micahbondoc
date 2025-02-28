public class VariableScope {

    // Global variable (accessible to all methods in this class)
    static int globalCount = 100;

    // Method to demonstrate variable scope
    public static void showScope() {
        int localCount = 50; // Local variable (accessible only within this method)
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        System.out.println("Global Count (from main): " + globalCount);

        // Call the showScope method
        showScope();
    }
}
