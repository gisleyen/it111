import java.util.Scanner;
import java.util.random.RandomGenerator;

public class MyInput {

    public static void main (String[] args) {

        String name, message;
        int age;
        double salary;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name, please!");

        name = scanner.next();

        System.out.println(name + ", please enter your age");

        age = scanner.nextInt();

        System.out.println(name + ", last, but not least, your annual salary!");

        salary = scanner.nextDouble();

        System.out.println("First name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
if (salary <50000) {
    message = "I need another job, or remote";

} else if (salary >=50000 && salary <60000){
    message = "Not bad, but hard to survive in Seattle";
} else if (salary>=6000 && salary <7000) {
        message = "Salary is getting better";
} else if (salary>=7000 && salary <8000){
        message = "Almost livable in Seattle";
} else {
    message = "Life is good";
}

            System.out.println("First name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: $" + salary+ " dollars");
            System.out.println("Message: " +message);

    }





    }

