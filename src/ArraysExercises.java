import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person ("Austin");
        people[2] = new Person("Sancho");
        for (Person person : people){
            System.out.println(person.getName());
        }
        System.out.println(); //this sout is just to break up the two arrays
        Person Easton = new Person("Easton");
        Person [] fourthPerson = addPerson(people , Easton);
        for (Person person : fourthPerson) {
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] people,Person newPerson){
        Person [] newPeople = Arrays.copyOf(people, people.length +1);
        newPeople[newPeople.length -1] = newPerson;
        return newPeople;
    }
}
