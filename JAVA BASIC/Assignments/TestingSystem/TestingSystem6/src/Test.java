import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Test {
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkAge(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Access denied: you must be at least 18 years old");
        }else
            System.out.println("Access granted - You are old enough");
    }

    public static class InvalidAgeException extends Exception {
//        private static final long serialVersionID = 1L;

        public InvalidAgeException(String message) {
            super(message);
        }
    }
}

