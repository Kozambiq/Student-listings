import java.util.Scanner;

class Student{
    String name;
    int age;
    String gender;
    String year;
    String birthday;
    double gpa;

    Student(String name, int age, String gender, String year, String birthday, double gpa){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Year level: " + year);
        System.out.println("Birth Day: " + birthday);
        System.out.println("GPA: " + gpa + "\n");
    }
}

public class main{
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int count;
    String name;
    int age;
    String gender;
    String year;
    String birthday;
    double gpa;

    System.out.print("How many students would you like to store?: ");
    count = scanner.nextInt();
    scanner.nextLine();

    Student[] students = new Student[count];

    for(int i = 0; i < count; i++){
        System.out.print("\nStudent name: ");
        name = scanner.nextLine();

        System.out.print("Student age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Student gender: ");
        gender = scanner.nextLine();

        System.out.print("Student year: ");
        year = scanner.nextLine();

        System.out.print("Student birthday: ");
        birthday = scanner.nextLine();

        System.out.print("Student gpa: ");
        gpa = scanner.nextDouble();
        scanner.nextLine();

        students[i] = new Student(name, age, gender, year, birthday, gpa);
    }

    System.out.println("===All Students===");
    for(Student s : students) {
        s.displayInfo();
    }
    

    scanner.close();

}
}
