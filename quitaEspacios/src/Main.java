public class Main {
    public static String quitaEspacios(String s ){
        int i;
        String s2 = "";
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(quitaEspacios("se gu ros oc aso. co m"));
    }
}