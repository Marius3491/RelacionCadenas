public class Main {
    public static String sustituyePalabra(String s, String palabra1, String palabra2){
        String [] palabras = s.split(" ");
        int i;
        for(i =0; i < palabras.length;i++){
            if (palabras[i].equals(palabra1)) {
                palabras[i] = palabra2;
            }
        }
        String s2 = String.join(" ",palabras);
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(sustituyePalabra("Torrente, el brazo fuerte de la ley","fuerte","tonto"));
    }
}