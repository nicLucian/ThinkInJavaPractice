package InitializationAndCleanup;

public class VariableInit {
    private boolean mBoolean;
    private byte mByte;
    private short mShort;
    private char mChar;
    private int mInt;
    private long mLong;
    private float mFloat;
    private double mDouble;

    private VariableInit mInit;

    public void function() {
        int i;
        //i ++; // compile error
    }

    public void printInitValue() {
        System.out.println("boolean : " + mBoolean);
        System.out.println("byte : " + mByte);
        System.out.println("short : " + mShort);
        System.out.println("char : [" + mChar + "]");
        System.out.println("int : " + mInt);
        System.out.println("long : " + mLong);
        System.out.println("float : " + mFloat);
        System.out.println("double : " + mDouble);
        System.out.println("reference variable : " + mInit);
    }

    public static void main(String[] args) {
        new VariableInit().printInitValue();
    }

}
