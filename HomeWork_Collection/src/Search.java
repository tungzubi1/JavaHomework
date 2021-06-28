import java.util.ArrayList;
import java.util.List;

public class Search {
    public int countPerson(String nationality, List<Person> person) {
        int count = 0;
        for (Person p : person) {
            if (p.nationality.equals(nationality))
                count++;
        }
        return count;
    }

    public List nationalityList(List<Person> person) {
        List<String> list = new ArrayList<String>();
        for (Person p : person) {
            if (!list.contains(p.nationality))
                list.add(p.nationality);
        }
        return list;
    }

    public float averageAge(String nationality, List<Person> person) {
        int sumAge = 0;
        for (Person p : person) {
            if (p.nationality.equals(nationality))
                sumAge = sumAge + p.age;
        }
        int countPerson = countPerson(nationality, person);
        float avgAge = (float)
                sumAge / countPerson;
        return avgAge;
    }

    public String personStyle(Person person) {
        String value = "";
        if (person.age < 20) {
            value = " - nổi loạn";
        } else if (person.age < 30) {
            value = " - việc làm";
        } else if (person.age < 40) {
            value = " - sự nghiệp";
        } else value = " - hưởng thụ";
        return value;
    }
}