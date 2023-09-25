import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static Scanner scan = new Scanner(System.in); 
    public static void main(String[] args) throws Exception {
        HashMap<String, Student> students = new HashMap<String, Student>();
        String choice = "";

        while (!choice.equals("5"))
        {
            menu();
            choice = scan.nextLine();
            switch(choice)
            {
                case "1":
                    addStudent(students);
                    System.out.println("A new student has been made");
                    printstuff(students);
                    break;
                
                case "2":
                    System.out.println("give an ID:");
                    String id = scan.nextLine();
                    

                    
                    break;
            }
        }
        
    }

    public static void menu()
    {
        System.out.println("1 - Add student");
        System.out.println("2 - Find student");
        System.out.println("3 - Delete student");
        System.out.println("4 - Show all students");
        System.out.println("5 - Exit");
    }

    public static void addStudent(HashMap<String, Student> students)
    {
        String infoName = "";
        String infoID = "";

        System.out.println("Enter a Student ID");
        infoID = scan.nextLine();

        System.out.println("Enter a name");
        infoName = scan.nextLine();

        Student newStud = new Student(infoName);
        students.put(infoID, newStud);
    }

    public static boolean findStudent(HashMap<String, Student> students, String id)
    {
        if (students.containsKey(id))
        {
            students.get(id);
            return true;
        }
        else
        {
            System.out.println("invalid ID");
            return false;
        }
                    
    }

    public static void printstuff(HashMap<String, Student> students)
    {
        for (String id : students.keySet())
        {
            System.out.println("name: " + students.get(id) + ", id: " + id);
        }
    }




}
