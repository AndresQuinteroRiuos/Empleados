public abstract class Person {
    private final String name; // Marcado como final
    private final Integer age; // Marcado como final

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Método abstracto para mostrar los datos
    public abstract void mostrarDatos();
}
