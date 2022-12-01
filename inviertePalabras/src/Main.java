public class Main {
    public static String invierteCadena(String s){
        int i;
        String s2 = "";
        for(i = s.length()-1;i >= 0;i--){
            s2 = s2 + s.charAt(i);
        }
        return s2;
    }
    public static String inviertePalabras(String s){
        String [] palabras = s.split(" ");
        int i;
        for(i=0;i<palabras.length;i++){
            palabras[i] = invierteCadena(palabras[i]);
        }
        String s2 = String.join(" ",palabras);
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(inviertePalabras("se desarrolla un tipo de robot llamado nexus"));
    }
}