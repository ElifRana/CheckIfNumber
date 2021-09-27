public class Main {

    public static void main(String[] args) {

        String string = "12345.45";
        //String string = "Rana";
        boolean numeric = true;

        try {
            Double number = Double.parseDouble(string);
            //pardeDouble double degere dönüştürür.
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if (numeric) {
            System.out.println("Bir sayıdır. " + string);
        } else {
            System.out.println("Bir sayı değildir. " + string);
        }
    }
}
