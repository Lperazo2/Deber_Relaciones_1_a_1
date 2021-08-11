package dominio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaEmpleado {

    private int anio, mes, dia;
    private String nombre;

    public FechaEmpleado(String nombre, int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.nombre = nombre;
    }
    Calendar fecha_Actual = Calendar.getInstance();
    int anio_A = fecha_Actual.get(Calendar.YEAR);
    int mes_A = fecha_Actual.get(Calendar.MONTH);
    int dia_A = fecha_Actual.get(Calendar.DAY_OF_MONTH);


    public void CalcularTiempo() {
        System.out.print("ESTIMADO " + nombre + " \nUSTED TIENE " + (anio_A - anio) + " AÑOS, ");
        if ((mes_A - mes) < 0) {
            System.out.print(+(12 +(mes_A - mes)) + " MESES, ");
        } else {
            System.out.print((mes_A - mes) + " MESES, ");
        }
        if ((dia_A - dia) < 0) {
            System.out.print(+(31 - (dia_A - dia)) + " DIAS TRABAJANDO EN LA EMPRESA. ");
        } else {
            System.out.print((dia_A - dia) + " DIAS TRABAJANDO EN LA EMPRESA.\n");
        }
    }

}
