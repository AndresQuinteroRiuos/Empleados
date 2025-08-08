import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private final String name;
    private final List<Employee> employees;
    private final List<Client> clients;

    public Enterprise(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee emp) {
        if (emp != null) {
            employees.add(emp);
        } else {
            System.out.println("Empleado nulo no se puede agregar.");
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addClient(Client client) {
        if (client != null) {
            clients.add(client);
        } else {
            System.out.println("Cliente nulo no se puede agregar.");
        }
    }

    public List<Client> getClients() {
        return clients;
    }
}
