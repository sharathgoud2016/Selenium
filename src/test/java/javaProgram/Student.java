package javaProgram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Student {

Integer id;

String name;

public Student(int id, String name) {

super();

this.id = id;

this.name = name;

}

@Override

public String toString() {

return "Student [id=" + id + ", name=" + name + "]";

}

public static void main(String[] args) {

Student s1 = new Student(4, "ABC");

Student s2 = new Student(9, "PQR");

Student s3 = new Student(6, "ABC");

Student s4 = new Student(8, "ERT");

List<Student> arrList = new ArrayList<Student>();

arrList.add(s1);

arrList.add(s2);

arrList.add(s3);

arrList.add(s4);

System.out.println(arrList);
Collections.sort(arrList,Collections.reverseOrder());

System.out.println(arrList);
}

}