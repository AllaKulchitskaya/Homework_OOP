public class Person {
    private String name;
    private String town;
    private int yearOfBirth;

    public Person(String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Мой год рождения - " +
                this.yearOfBirth + ". Будем знакомы!";
    }
}
