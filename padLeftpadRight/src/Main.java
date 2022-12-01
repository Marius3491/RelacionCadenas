public class Main {
    public static String padLeft(String s, int n) {
        while (s.length() < n) {
            s = ' ' + s;
        }
        return s;
    }
    public static String padRight(String s, int n){
        int i;
        int espacios = n - s.length();
        for(i = 0; i < espacios; i++){
            s = s + ' ';
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(padLeft("patata",10));
    }
}