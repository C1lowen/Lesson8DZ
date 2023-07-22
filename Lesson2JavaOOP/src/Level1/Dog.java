package Level1;

public class Dog extends Animal{
    private String name;

    public Dog(String ration, String color, int weight,String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog(String ration, String color, int weight) {
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
        return "ГАВ";
    }
    @Override
    void eat(){
        System.out.println("Собака ест");
    }
    @Override
    void sleep(){
        System.out.println("Собака спит");
    }
}
