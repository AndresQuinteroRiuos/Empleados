import java.util.ArrayList;
import java.util.List;

public class Directive extends Employee {
    private final String category; // Marcado como final
    private final List<Employee> subordinates; // Marcado como final

    public Directive(String name, Integer age, Double salary, String category) {
        super(name, age, salary);
        this.category = category;
        this.subordinates = new ArrayList<>();
    }

    public String getCategory() {
        return category;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void addEmployee(Employee emp) {
        if (emp != null) {
            subordinates.add(emp);
        } else {
            System.out.println("Empleado nulo no se puede agregar a la directiva.");
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Directivo: nombre: %s, edad: %d, salario: $ %,.2f, categoría: %s%n",
                          getName(), getAge(), getSalary(), getCategory());
    }
}
