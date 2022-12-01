public class Main {
    public static boolean esNumero(String s){
        int i;
        for(i = 0; i < s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(esNumero("6"));
    }
}