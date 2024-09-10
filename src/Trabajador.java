import java.time.LocalDate;
import java.util.Date;


public class Trabajador {
    private String nombre;
    private Date fechaInicioTrabajo;
    private double salarioBase;

    public Trabajador(String nombre, Date fechaInicioTrabajo, double salarioBase) {
        this.nombre = nombre;
        this.fechaInicioTrabajo = fechaInicioTrabajo;
        this.salarioBase = salarioBase;
    }

    public int calcularDiasVacaciones(){
        //Por cada año de experiencia, el trabajador recibe 7 días adicionales de vacaciones.
        int diasVacaciones = 0;
       // int añosExperiencia = this.fechaInicioTrabajo.compareTo(LocalDate.now());

        return diasVacaciones;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicioTrabajo() {
        return fechaInicioTrabajo;
    }
    public void setFechaInicioTrabajo(Date fechaInicioTrabajo) {
        this.fechaInicioTrabajo = fechaInicioTrabajo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }



}
