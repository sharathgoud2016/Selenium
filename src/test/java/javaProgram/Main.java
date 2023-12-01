package javaProgram;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(String name) {
        this(name, 0); // calling another constructor in the same class using "this"
    }
    
    public String getName() {
        return this.name; // using "this" to refer to the instance variable
    }
    
    public void setName(String name) {
        this.name = name; // using "this" to set the instance variable
    }
}

public class Main {
    public static void main(String[] args) {
    	Person person1 = new Person("Alice", 25);
        System.out.println(person1.getName());
        
        
        Person person2 = new Person("Bob");
        System.out.println(person2.getName());
    }
}


