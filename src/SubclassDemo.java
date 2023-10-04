public class SubclassDemo extends AccessModifiersDemo {
    // Method to display the value of the protectedVar using the getProtectedVar method
    public void displayProtectedVar() {
        boolean value = getProtectedVar();
        System.out.println("Value of protectedVar in SubclassDemo: " + value);
    }

    public static void main(String[] args) {
        // Create an instance of SubclassDemo
        SubclassDemo subclass = new SubclassDemo();

        // Call the displayProtectedVar method
        subclass.displayProtectedVar();
    }
}

