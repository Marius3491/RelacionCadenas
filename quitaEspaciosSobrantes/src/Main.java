public class Main {
    public static String quitaEspaciosSobrantes(String s){
        String [] palabras = s.split(" ");
        String s2 = "";
        int i;

        for(i = 0;i< palabras.length;i++){
            if(palabras[i].length()>0){
                s2 = s2 + palabras[i] + " ";
            }
        }
        return s2.substring(0,s2.length()-1);
    }
    public static void main(String[] args) {
        String s = "   lleva       la         tarara     un           vestido      blanco";
        System.out.println(">"+quitaEspaciosSobrantes(s)+"<");
    }
}