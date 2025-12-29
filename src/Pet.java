import java.util.Objects;
public abstract class Pet {
    private String name;
    private int age;
    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public abstract String makeSound();
    @Override
    public String toString(){
        return getClass().getSimpleName() + "{name= '" + name + "', age= " + age + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name) && getClass() == pet.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}
