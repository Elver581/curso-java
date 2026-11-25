import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = new java.util.Random().nextInt(100) + 1;
        int intento = sc.nextInt();
        boolean acerto = false;
        int maxIntentos=7;
    

       /* while (true) {
            System.out.print("Ingresa un numero: ");
            int intento = sc.nextInt();
            intentos++;

            if (intento < secreto) {
                System.out.println("Mas alto");
            } else if (intento>secreto) {
                System.out.println("Mas abajo");
            } else {
                System.out.println("Acertaste en " + intentos + " intentos");
                // TODO: salir del bucle con una sola palabra
                 break;
            }
        }*/ 

            for(int i =1; i<=maxIntentos; i++){
                System.out.println("Ingresa un numero");
                
                if(intento < secreto){
                    System.out.println("Mas alto");
                }

                else if(i>secreto){
                    System.out.println("Mas Abajo");
                }else{
                     
                }
               
                
            }

        sc.close();
    }
}
