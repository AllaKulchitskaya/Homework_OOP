public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == "") {
            this.brand = "default";
            System.out.println(this.brand);
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
            System.out.println(this.model);
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == "") {
            this.country = "default";
            System.out.println(this.country);
        } else {
            this.country = country;
        }
    }

    public String toString() {
        return this.brand + " " + this.model + ", " + this.year + " год выпуска, страна сборки - " + this.country +
                ", цвет кузова - " + this.color + ", объем двигателя - " + this.engineVolume + " л.";
    }
}
