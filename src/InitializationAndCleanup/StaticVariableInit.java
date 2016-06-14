package InitializationAndCleanup;

public class StaticVariableInit {
    private static String strNotInBlock = "strNotInBlock";
    private static String strInBlock;

    static {
        strInBlock = "strInBlock";
    }

    private static void print() {
        System.out.println(strNotInBlock);
        System.out.println(strInBlock);
    }

    public static void main(String[] args) {
        print();
    }
}
