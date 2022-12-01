public class Main {
    public static String quitaAcentos(String s){
        String conAcentos = "áéíóú";
        String sinAcentos = "aeiou";
        int i, pos;
        String s2 = "";
        for(i=0;i <s.length();i++){
            pos = conAcentos.indexOf(s.charAt(i));
            if(pos != -1){
             s2 = s2 + sinAcentos.charAt(pos);
            } else{
             s2 = s2 + s.charAt(i);
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        System.out.println(quitaAcentos("murciélago"));
    }
}