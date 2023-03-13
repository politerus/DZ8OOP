package Task5;
import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTail() {
        if (tail == true)
            return "так";
        return "ні";
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Ім'я:" + name + ", вік:" + age +
                ", Хвіст:" + this.getTail();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() && getTail() == animal.getTail() && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getTail());
    }
}

class Main{
    public static void main(String[] args) {
        Animal cat = new Animal("Тишка", 45, false);
        Animal cat2 = new Animal("Тишка", 45, true);
        System.out.println(cat.toString());
        System.out.println(cat2.toString());
        System.out.println(cat.equals(cat2));
        System.out.println(cat.hashCode() + "\n" + cat2.hashCode());
    }
}