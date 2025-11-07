package proyecto5;

import java.util.Objects;

public class Student {
 private String name;
 private Integer age;
 private String Id;

    public Student( String id,String nombre, Integer edad) {
        setName(nombre);
        setAge(edad);
        setId(id);
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        this.name = name;
    }

    public void setAge(Integer age) {
        if  (!(age >=17  && age <= 100)) {
            throw new IllegalArgumentException("La edad debe estar entre 17 y 100");
        }
        this.age = age;
    }

    public void setId(String id) {
        if (id == null || !id.matches("^[A-Z]\\d{5}$")) {
            throw new IllegalArgumentException("El ID debe tener formato: una letra mayúscula seguida de 5 dígitos (ejemplo: A12345)");
        }
        Id = id;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                ", Id=" + Id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

}
