package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == "" || name == null) {
            throw new IllegalArgumentException("Enter a name");
        }
        
        if (name.length() > 40) {
            throw new IllegalArgumentException("Name must be 40 characters or less");
        }
        
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Not a valid age");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
