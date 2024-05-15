public class problemas {
    public static void main(String[] args) {
        String[] Array={"adios","esto","es","python"};
        String cadena="python";
        arrayYstring(Array,cadena);
        String[] nuevoArray=arrayYstring(Array,cadena);
        for(int i=0;i<nuevoArray.length;i++) {
            System.out.println(nuevoArray[i]);
        }
    }
    public static String[] arrayYstring(String[] Array,String cadena) {
        int nuevo=0;
        for(int i=0;i<Array.length;i++) {
            if(!Array[i].equalsIgnoreCase(cadena)) {
                nuevo++;
            }
        }
        String[] nuevoArray = new String[nuevo];
        int aux = 0;
        for(int i=0;i<Array.length;i++) {
            if(!Array[i].equalsIgnoreCase(cadena)) {
                nuevoArray[aux]=Array[i];
                aux++;
            }
        }
        return nuevoArray;
    }
}