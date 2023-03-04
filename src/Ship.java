class Ship {
    private String name;
    private String color;
    private String engineType;
    private int age;

    public Ship(String name, String color, String engineType, int age) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", age=" + age +
                '}';
    }
}
