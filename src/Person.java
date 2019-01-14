public class Person{
    private String name;
    // returns the person's name
    public String getName(){
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
    public Person(String person){
        this.name = person;
    }

    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.name = "Chase";
//        System.out.println(p1.name);
//        p1.sayHello();
//        p1.setName("Mike");
//        System.out.println(p1.getName());
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}