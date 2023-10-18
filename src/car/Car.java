package car;

public class Car {
    // Приватні поля
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isNew;

    // Перший конструктор
    public Car(String make, String model, int year, double price, boolean isNew) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isNew = isNew;
    }

    // Другий конструктор (по замовчуванню)
    public Car() {
        // Встановлюємо значення за замовчуванням або можемо залишити поля порожніми
    }

    // Гетери
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    // Сетери
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    // Метод toString для представлення об'єкту у вигляді рядка
    @Override
    public String toString() {
        return "car.Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }
}