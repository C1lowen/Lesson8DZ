package Level1;

public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat(String ration, String color, int weight) {
        super(ration, color, weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice(){
        return "Мяуууу";
    }
    @Override
    void eat(){
        System.out.println("Кот ест");
    }
    @Override
    void sleep(){
        System.out.println("Кот спит");
    }
}
