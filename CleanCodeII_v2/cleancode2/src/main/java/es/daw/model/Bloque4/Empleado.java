package es.daw.model.Bloque4;

public class Empleado {
    // Ejemplo de objeto correcto

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    //Es necesario ya que la forma incorrecta recquiere del set
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para aumentar el salario
    public void aumentarSalario(double aumento) {
        salario += aumento;
    }


}
