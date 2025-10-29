import java.util.InputMismatchException;
import java.util.Scanner; // import scanner for user in

// created class object Student
class Student{

    // characteristics of the student
    String name;
    int age;
    String gender;
    String year;
    String birthday;
    double gpa;

    // constructor for student
    Student(String name, int age, String gender, String year, String birthday, double gpa){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.year = year;
        this.birthday = birthday;
        this.gpa = gpa;
    }


    //method for displating the students info
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Year level: " + year);
        System.out.println("Birth Day: " + birthday);
        System.out.println("GPA: " + gpa + "\n");
    }
}

// main method
public class main{
    public static void main(String[] args) {        
    
        Scanner scanner = new Scanner(System.in); // intialized scanner for user input

        // initializing variables
        int count;
        String name;
        int age;
        String gender;
        String year;
        String birthday;
        double gpa;

        // prompt asking user how many students they would like to store
        System.out.print("How many students would you like to store?: ");
        count = scanner.nextInt(); 
        scanner.nextLine(); // nextLine()

        Student[] students = new Student[count]; // made an array of object where it will store the students

        // for loop that ends when user choice 
        for(int i = 0; i < count; i++){


            try{

                //asks for student name
                System.out.print("\nStudent name: ");
                name = scanner.nextLine();

                // asks for student age
                System.out.print("Student age: ");
                age = scanner.nextInt();
                scanner.nextLine(); // debuffer line
                
                // asks for student gender
                System.out.print("Student gender: ");
                gender = scanner.nextLine();

                // asks for student year
                System.out.print("Student year: ");
                year = scanner.nextLine();

                // asks for student birthday
                System.out.print("Student birthday: ");
                birthday = scanner.nextLine();

                // asks for student gpa
                System.out.print("Student gpa: ");
                gpa = scanner.nextDouble();
                scanner.nextLine(); // debuffer line

                students[i] = new Student(name, age, gender, year, birthday, gpa); // returns the given data to the Student object

            }

            // when words are entered to int scanner this code block runs
            catch (InputMismatchException e){
                System.out.println("Invalid input! "); // prints invalid
                scanner.nextLine(); // debuffer line
                i--; // resets the iteration by 1
            }

        }

        // formats out the all students tab
        System.out.println("===All Students===");
        for(Student s : students) {
            s.displayInfo(); // calls the method that handles all the student info
        }
        

        scanner.close(); // closes the scanner

    }
}
