public class Main {
    public static String quitaEspaciosTrim(String s ){
        int p1,p2;
        p1 = 0;
        while(s.charAt(p1) == ' '){
            p1++;
        }
        p2 = s.length()-1;
        while (s.charAt(p2) == ' '){
            p2--;
        }
        return s.substring(p1,p2+1);
    }
    public static void main(String[] args) {
        System.out.println(quitaEspaciosTrim("          patata"));
    }
}