/*package OOP.StudentEx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String studentId;
    String fullName;
    Date dateOfBirth;
    String major;
    float gpa;

    public void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentId = sc.nextLine();
        System.out.print("Enter Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateOfBirthString = sc.nextLine();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dateOfBirth = sdf.parse(dateOfBirthString);
        } catch (ParseException e) {
            System.out.println("Invalid.");
        }
        System.out.println("Enter major: ");
        major = sc.nextLine();
        System.out.println("Enter GPA: ");
        gpa = sc.nextFloat();
    }
    
    public void editStudentById(String idToEdit){
        Scanner sc = new Scanner(System.in);
        if(this.studentId.equals(idToEdit)){
            System.out.println("Enter full name: ");
            fullName = sc.nextLine();
            System.out.println("Enter date of birth: ");
            String dateOfBirth = sc.nextLine();
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                dateOfBirth = sdf.parse(dateOfBirthString);
            }catch(ParseException e){
                System.out.println("Invalid.");
            }
            System.out.print("Enter major");
            major = sc.nextLine();
            System.out.print("Enter GPA: ");
            gpa = sc.nextFloat();
        }else{
            System.out.print("N/A");
        }
    }
    public void displayStudentInFo(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth: " + sdf.format(dateOfBirth));
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}*/