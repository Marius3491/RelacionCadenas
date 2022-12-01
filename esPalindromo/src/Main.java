public class Main {
    public static boolean esPalindromo (String s){
        int i, j;

        for(i = 0, j = s.length()-1 ;i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esPalindromo("ana"));
    }
}