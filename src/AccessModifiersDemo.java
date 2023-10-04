public class AccessModifiersDemo {
    // Private variable
    private int privateVar = 10;

    // Default (package-private) variable
    double defaultVar = 20.5;

    // Protected variable
    protected boolean protectedVar = true;

    // Public variable
    public String publicVar = "Hello, world!";

    // Public method to get privateVar
    public int getPrivateVar() {
        return privateVar;
    }

    // Default (package-private) method to get defaultVar
    double getDefaultVar() {
        return defaultVar;
    }

    // Protected method to get protectedVar
    protected boolean getProtectedVar() {
        return protectedVar;
    }

    // Public method to get publicVar
    public String getPublicVar() {
        return publicVar;
    }
}
