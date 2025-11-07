package excepciones.custom.checked;

public class Person {

    private Integer age;
    private String name;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static Person createPerson(String name, Integer age) throws AgeValidationException {
        if (age < 0 || age > 120) {
            throw new AgeValidationException("Edad no válida: " + age);
        }
        return new Person(name, age);
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
