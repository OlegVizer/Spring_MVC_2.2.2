package web.model;

public class Car {
    private String firm;
    private String model;
    private int age;
    private int count = 1;

    public Car() {
    }

    public Car(String firm, String model, int age) {
        this.firm = firm;
        this.model = model;
        this.age = age;
    }

    public String getFirm() {
        return firm;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }
}
