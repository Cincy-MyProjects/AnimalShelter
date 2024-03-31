abstract class Dog implements AdoptableAnimal {
    private String name;
    private String description;
    private double price;

    public Dog(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract String getBreed();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
