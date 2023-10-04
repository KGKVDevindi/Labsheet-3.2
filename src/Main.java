public class Main {
    public static void main(String[] args) {
        // Create an instance of AccessModifiersDemo class
        AccessModifiersDemo accessDemo = new AccessModifiersDemo();

        // Use getter methods to access and print the values of the variables
        System.out.println("privateVar: " + accessDemo.getPrivateVar());
        System.out.println("defaultVar: " + accessDemo.getDefaultVar());
        System.out.println("publicVar: " + accessDemo.getPublicVar());

        // Create an instance of SubclassDemo class
        SubclassDemo subclassDemo = new SubclassDemo();

        // Call the displayProtectedVar method to access the protected variable in the subclass
        subclassDemo.displayProtectedVar();
    }
}

