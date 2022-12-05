public class Person {
    String name;
    String town;
    int yearOfBirth;
    String jobTitle;

    public Person(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name == "") {
            this.name = "Информация не указана";
            System.out.println(this.name);
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
            System.out.println(this.town);
        } else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
            System.out.println(this.jobTitle);
        } else {
            this.jobTitle = jobTitle;
        }
    }


    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Мой год рождения - " +
                this.yearOfBirth + ". Я работаю на должности " + this.jobTitle + ". Будем знакомы!";
    }
}
