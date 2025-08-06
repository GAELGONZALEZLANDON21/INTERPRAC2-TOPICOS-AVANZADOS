package interpract2;

import java.util.Scanner;
import operaciones.operaNum.OperaSuma;
import operaciones.operaNum.OperaResta;
import operaciones.operatext.operaConectar;
import operaciones.operatext.OperaRFC;

public class Interpract2 {

    public static void main(String[] args) {
        String opc;
        
        do {
        int a=0, b=0;
        String c1="", c2="";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\nQue operacion desea realizar\n");
        System.out.println("[1] Sumar 2 numeros");
        System.out.println("[2] Restar 2 numeros");
        System.out.println("[3] Concatenar 2 cadenas");
        System.out.println("[4] Generar RFC");
        System.out.println("[5] Salir");
        System.out.println("Que opcion deseas? : ");
        
        opc = teclado.next();
        
        switch (opc){
            
            case "1":
                System.out.println("OPeracion de suma");
                System.out.println("Primer numero: ");
                a = teclado.nextInt();
                System.out.println("Segundo numero: ");
                b = teclado.nextInt();
                OperaSuma operacion = new OperaSuma(a, b);
                System.out.println("Resultado : " + operacion.rsuma());
                break;
                
                
            case "2":
                System.out.println("Operacion de resta");
                System.out.println("Primer numero: ");
                a = teclado.nextInt();
                System.out.println("Segundo numero: ");
                b = teclado.nextInt();
                OperaResta operacionr = new OperaResta(a, b);
                System.out.println("Resultado : " + operacionr.rresta());
                break;
                
                
            case "3":
                System.out.println("Concatenar cadenas");
                System.out.println("Primera cadena: ");
                c1= teclado.next();
                System.out.println("Segunda cadena: ");
                c2 = teclado.next();
                operaConectar operac = new operaConectar(c1, c2);
                System.out.println("Resultado : " + operac.rcadena());
                break;
                
                
            case "4":
                teclado.nextLine();
                System.out.println("Generar RFC");
                System.out.println("Nombre(s): ");
                String nombre = teclado.nextLine();
                System.out.println("Apellido Paterno: ");
                String apPat = teclado.nextLine();
                System.out.println("Apellido Materno: ");
                String apMat = teclado.nextLine();
                System.out.println("Fecha de nacimiento: ");
                String fecha = teclado.nextLine();
                
                OperaRFC rfc = new OperaRFC(nombre, apPat, apMat, fecha);
                System.out.println("Tu RFC es: " + rfc.generarRFC());;
                break;
                
                
            case "5":
                System.out.println("Saliendo del programa...");
                return; 
                
                
            default:
                System.out.println("No existe esa opcion");
                        
            }
        
        }while (true);
    }
}
