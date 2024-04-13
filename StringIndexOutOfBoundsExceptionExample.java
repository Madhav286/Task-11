public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            // Trying to access an index that doesn't exist
            char ch = str.charAt(10); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bounds.");
        }
    }
}
