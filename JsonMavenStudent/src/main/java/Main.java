import com.google.gson.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try
        {
            Student[] studs = {new Student("Joe", "Oakes", 4.0, 11, 100),
                    new Student("Jim", "Oakes", 3.5, 12, 101),
                    new Student("John", "Oakes", 3.0, 13, 103)};

            try (FileWriter writer = new FileWriter("Student.json")){
                writer.write(new Gson().toJson(studs));
            }

            Student[] studs2 = new Gson().fromJson(new FileReader("Student.json"), Student[].class);
            for (Student stud : studs2){
                System.out.println("Name: " + stud.getFName() + " " + stud.getLName());
                System.out.println("GPA: " + stud.getGPA());
                System.out.println("Current Credits : " + stud.getCurrentCredits());
                System.out.println("Total Credits : " + stud.getTotalCredits());
            }
        }catch(Exception e){ }
    }
}
