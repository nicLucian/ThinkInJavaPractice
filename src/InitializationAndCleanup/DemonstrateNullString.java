package InitializationAndCleanup;

/**
 * Exercise 1:
 *  Create a class containing an uninitialized String reference.
 *  Demonstrate that this reference is initialized by Java to null.
 */
public class DemonstrateNullString {
    private static String str;

    public static void main(String[] args) {
        try {
            str.length();
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }
}
