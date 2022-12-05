public class Person {
    private String name;
    private String town;
    private int yearOfBirth;
    private String jobTitle;

    public Person(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Мой год рождения - " +
                this.yearOfBirth + ". Я работаю на должности " + this.jobTitle + ". Будем знакомы!";
    }
}
