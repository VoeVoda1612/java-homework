package AdditionalTask;

public class Animal {
    String name;
    int age;
    boolean tail;

    @Override
    public String toString() {
        return "Имя - "+name+" возраст - "+age+" хвост - "+tail + " "+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (tail != animal.tail) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (tail ? 1 : 0);
        return result;
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }
}
