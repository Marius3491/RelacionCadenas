public class Main {
    public static boolean contiene(String s , char c){
        int i;
        for(i =0; i < s.length();i++){
            if(s.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(contiene("papagayo",'y'));
    }
}