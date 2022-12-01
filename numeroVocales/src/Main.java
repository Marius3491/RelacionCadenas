public class Main {
    public static void main(String[] args) {
        int i;
        int vocales = 0;
        String s;
        s = "patata alcachofa berenjena tomate";
        s = s.toLowerCase();
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||
                    s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                vocales++;
            }
        }
        System.out.print("La cadena tiene " + vocales + " vocales");
    }
}