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


        Car lada = new Car("Lada", "Granta", 1.7, "", 2015, "Россия");
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия");
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея");
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея");
        System.out.println(hyundai);
    }
}