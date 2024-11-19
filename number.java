public class IntegerTypes {
    public static void main(String[] args) {
        byte myByte = 100; // -128 to 127
        short myShort = 5000; // -32768 to 32767
        int myInt = 100000; // -2147483648 to 2147483647
        long myLong = 15000000000L; // -9223372036854775808 to 9223372036854775807

        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
    }
}

