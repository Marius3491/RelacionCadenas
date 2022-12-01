public class Main {
    public static String mayusculasPrimera(String s){
        String [] palabras = s.split(" ");
        int i;
        for(i=0;i<palabras.length;i++){
            String p = palabras[i];
            char c = Character.toUpperCase(p.charAt(0));
            p= c + p.substring(1);
            palabras[i] = p;
        }
        String s2 = String.join(" ",palabras);
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(mayusculasPrimera("un guerrero que emergio del oceano profundo"));
    }
}