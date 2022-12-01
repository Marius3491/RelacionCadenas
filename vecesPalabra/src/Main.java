public class Main {
    public static int vecesPalabra(String s, String palabra){
        String [] palabras = s.split(" ");
        int i, cont=0;
        for(i = 0; i < palabras.length;i++){
            if(palabras[i].equals(palabra)){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        System.out.println(vecesPalabra("el estado de emergencia en el estado de kansas","estado"));
    }
}