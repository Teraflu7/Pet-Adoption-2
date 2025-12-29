public class Cat extends Pet {
    private boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {
        super(name, age);
        this.likesCuddles = likesCuddles;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", likesCuddles=" + likesCuddles + "}");
    }
}
