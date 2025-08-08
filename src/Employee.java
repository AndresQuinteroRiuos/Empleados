public class Employee extends Person {
    private final double salary;
    private Directive manager; // Nuevo atributo para almacenar el directivo (manager)

    public Employee(String name, Integer age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public Directive getManager() {
        return manager;
    }
    
    public void setManager(Directive manager) {
        this.manager = manager;
    }

    @Override
    public void mostrarDatos() {
        if (manager != null) {
            System.out.printf("Empleado: nombre: %s, edad: %d, salario: $ %,.2f, manager: %s%n",
                              getName(), getAge(), getSalary(), manager.getName());
        } else {
            System.out.printf("Empleado: nombre: %s, edad: %d, salario: $ %,.2f%n",
                              getName(), getAge(), getSalary());
        }
    }
}
