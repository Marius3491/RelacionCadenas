public class Main {
    public static int cuentaPalabras(String s){
        String [] palabras = s.split(" ");
        int i;
        int cont = 0;
        for(i = 0; i < palabras.length;i++){
            if(palabras[i].length()>0){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        System.out.println(cuentaPalabras("The path of the righteous man"));
    }
}