public class Pass {

    static String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static int numOfSymbols = symbols.length();

    public static String generate(int length) {
        String pass = "";

        for (int i = 0; i < length; i++) {
            pass = pass + random();

        }
        return pass;
    }

    public static String random() {
        int r = (int) (numOfSymbols * Math.random());
        return symbols.substring(r, r + 1);
    }
}
