public class Main {
    public static String repiteCaracter (char c, int n){
        int i;
        String s = "";
        for(i = 0; i < n; i++){
            s = s + c;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(repiteCaracter('A',5));
    }
}