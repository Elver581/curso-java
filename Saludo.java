public class Saludo {
    public static void main(String[] args){
        String nombre = args.length > 0 ? args[0] : "Desconocido";
        System.out.println("Hola,"  + nombre);
    }
}
