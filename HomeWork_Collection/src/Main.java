import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)
        ));
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình:");
        bai1(person);
        System.out.println("1.3 Tính trung bình tuổi của người theo từng quốc gia");
        bai3(person);
        System.out.println("1.4 In ra màn hình đánh giá tuổi mỗi người");
        bai4(person);
    }


    private static void bai1(List<Person> person) {
        Search search = new Search();
        List<String> nationalList = search.nationalityList(person);
        for (String n : nationalList) {
            System.out.println("- " +n+ ": " + search.countPerson(n, person));
        }
    }

    private static void bai3(List<Person> person) {
        Search search = new Search();
        DecimalFormat f = new DecimalFormat("#.#");
        List<String> nationalList = search.nationalityList(person);
        for (String n : nationalList) {
            System.out.println("- " +n+ " : " +f.format(search.averageAge(n, person)));
        }
    }

    private static void bai4(List<Person> person) {
        Search search = new Search();
        for (Person p : person) {
            System.out.println(p + search.personStyle(p));
        }
    }
}