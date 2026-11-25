public class TipoDatos {
    int entero = 0; //32 bits sin decimales
    long grande = 10_000_0000; // para numero extraGandes
    double decimal = 3.14;
    boolean activo =true;
    char letra ='A'; //Comillas simples para un solo caracter
    String texto = "Hola";


    int a = 7/2; //3, no 3.5 Division entera si ambos son int
    String s1="hola";
    String s2 =new String("hola");

    s1 == s2; //False compara referencias

    s1.equals(s2);//true, compara contenido



}
