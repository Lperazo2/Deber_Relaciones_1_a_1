package testDominio;

import dominio.Empleado;
import dominio.FechaEmpleado;
import java.util.Scanner;

public class TestEmpleado {

    public static void main(String[] args) {
        //EL PROGRAMA ACTUAL CALCULARA LA EDAD DE UN EMPLEADO Y SU TIEMPO EN LA EMPRESA 
        String nombre = "";
        int dia = 0, mes = 0, anio = 0;
        int opc;
        boolean bandera = false;
        Scanner entrada = new Scanner(System.in);

        while (!bandera) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("HOLA\nPOR FAVOR INGRESE EL NOMBRE DEL TRABAJADOR: ");
            nombre = entrada.nextLine();
            System.out.print("INGRESE SU FECHA DE NACIMIENTO.\nAÑO: ");
            anio = entrada.nextInt();
            System.out.print("MES: ");
            mes = entrada.nextInt();
            System.out.print("DIA: ");
            dia = entrada.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("LOS DATOS INGRESADOS SON: \nNOMBRE :" + nombre + "\nNACIO: " + dia + "/" + mes + "/" + anio);
            System.out.println("\n\nSI ESTA CORRECTO PULSE <1>  \nVOLVER A INGRESAR LOS DATOS <2> ");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1) {
                bandera = true;
            }
        }
        Empleado edad = new Empleado(nombre, anio, mes, dia);
        bandera = false;
        while (!bandera) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.print("POR FAVOR " + nombre + " INGRESE LA FECHA EN LA QUE INGRESO A LA EMPRESA.\nAÑO: ");
            anio = entrada.nextInt();
            System.out.print("MES: ");
            mes = entrada.nextInt();
            System.out.print("DIA: ");
            dia = entrada.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(nombre + "\nSU FECHA DE INICIO FUE: " + dia + "/" + mes + "/" + anio);
            System.out.println("\n\nSI ESTA CORRECTO PULSE <1>  \nVOLVER A INGRESAR LOS DATOS <2> ");
            opc = entrada.nextInt();
            entrada.nextLine();
            if (opc == 1) {
                bandera = true;
            }
        }
        FechaEmpleado tiempo = new FechaEmpleado(nombre, anio, mes, dia);
        bandera = false;
        while (!bandera) {

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("--------------- MENU ---------------\n");
            System.out.println("\n1.-CALCULAR SU EDAD ACUAL\n2.-CALCULAR SU TIEMPO EN LA EMPRESA");
            System.out.println("\nSI QUIERES SALIR DEL MENU\n3.-SALIR");
            opc = entrada.nextInt();
            if (opc == 1) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                edad.CalcularEdad();
                System.out.println("\nPULSE <C> PARA CONTINUA...");
                entrada.nextLine();
                String enter = entrada.nextLine();
            }
            if (opc == 2) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                tiempo.CalcularTiempo();
                System.out.println("\nPULSE <C> PARA CONTINUA...");
                entrada.nextLine();
                String enter = entrada.nextLine();
            }
            if (opc == 3) {
                bandera = true;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("PROGRAMA FINALIZADO....");

            }

        }

    }
}
