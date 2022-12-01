public class Main {
    public static String sustituyeCaracter(String s, char antiguo, char nuevo){
        int i;
        String s2 = "";
        for(i=0;i<s.length();i++){
            if(s.charAt(i) == antiguo){
                s2 = s2 + nuevo;
            }else{
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(sustituyeCaracter("perico",'c','t'));
    }
}