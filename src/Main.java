public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", "Минск", 1988, "бренд-менеджер");
        System.out.println(maxim);
        Person anya = new Person("Аня", "Москва", 1993, "методист образовательных программ");
        System.out.println(anya);
        Person katya = new Person("Катя", "Калининград", 1992, "продакт-менеджер");
        System.out.println(katya);
        Person artem = new Person("Артём", "Москва", 1995, "директор по развитию бизнеса");
        System.out.println(artem);
    }
}