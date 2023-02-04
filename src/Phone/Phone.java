package Phone;

public class Phone {
    private int number;
    private String model;
    private double weight;



    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "Номер телефона: +375" + number);
    }

    public void sendMessage(int...number){
        for (int j : number) {
            System.out.println("Отправлено сообщение на номер " + j);
        }
    }
    public Phone() { // конструктор без параметров
    }

    public Phone(int number, String model) { //конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) { // конструктор с 3 параметрами, вызываем из конструктора с тремя параметрами конструктор с двумя.
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
