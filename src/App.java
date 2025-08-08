public class App {
    public static void main(String[] args) throws Exception {
        // Creando empleados
        var company = new Enterprise("Cesar's Bar");
        var cesar = new Directive("Cesar", 25, 3_000d, "CEO");

        var luisa = new Employee("Luisa", 20, 1_000d);
        luisa.setManager(cesar);

        var manuel = new Employee("Manuel", 26, 1_000d);
        manuel.setManager(cesar);

        // Agregando empleados a compañía
        company.addEmployee(cesar);
        company.addEmployee(luisa);
        company.addEmployee(manuel);

        // Agregando empleados a directivos
        cesar.addEmployee(luisa);
        cesar.addEmployee(manuel);

        // Creando clientes
        var santiago = new Client("Santiago", 30, "3255468877");

        // Agregando clientes a la compañía
        company.addClient(santiago);

        System.out.println(" .: ¡Empleados! :. ");
        for (Employee emp : company.getEmployees()) {
            if (emp != null) {
                emp.mostrarDatos();
            }
        }

        System.out.println(" .: ¡Clientes! :. ");
        for (Client client : company.getClients()) {
            if (client != null) {
                client.mostrarDatos();
            }
        }
    }
}
