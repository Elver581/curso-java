public class Te{
public static void main(String[] args){
    int temperatura =20;  //Temparatura engrados
    int tiempoReposo =5; //minutos
  System.out.println("1.Buscar recipiente");
  System.out.println("2.llenar agua");
  System.out.println("3. Colocar en la estufa");
  System.out.println("4.Prender candela");
  //Paso 5 mientras el agua no hierva esperar

  while(temperatura<100){
    temperatura+=10;
    System.out.println("Esperamos .... agua a " + temperatura + "grados");

  }

  System.out.println("6. Apagar la candela");
  System.out.println("7. Agregar bolsita de te");

  //paso 8 repetir una cantidad conocida de veces -> for

  for (int minuto = 1; minuto <= tiempoReposo; minuto++){
    System.out.println("  Reposando.. minto.. " + minuto);
  }
  System.out.println("9. Retirar la bolsita");
  System.out.println("10. Servir");;

}


}