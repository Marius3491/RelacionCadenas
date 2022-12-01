public class Main {
    public static String quitaCaracter(String s, char c){
        int i;
        String s2 = "";
        for(i=0;i<s.length();i++){
            if(s.charAt(i) != c){
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(quitaCaracter("preparado",'p'));
    }
}