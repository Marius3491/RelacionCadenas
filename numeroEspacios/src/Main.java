
public class Main {
    public static void main(String[] args) {
        int i;
        int espacios = 0;
        String s;
        System.out.println("Introduce una cadena para saber numero de espacios");
        s = "patata alcachofa berengena tomate";
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                espacios++;
            }
        }
        System.out.print("La cadena tiene " + espacios + " espacios");
    }
}