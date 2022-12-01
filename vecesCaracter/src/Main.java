public class Main {
    public static int vecesCaracter(String s, char c){
        int i;
        int veces = 0;
        for(i = 0; i < s.length();i++){
            if(s.charAt(i) == c){
                veces++;
            }
        }
        return veces;
    }
    public static void main(String[] args) {
        System.out.println(vecesCaracter("cacatua",'c'));
    }
}