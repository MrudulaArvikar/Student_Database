package com.mrudula.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentConsole {
    private StudentDB sdb;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public StudentConsole() {
        super();
        sdb = new StudentDB();
    }

    int menu() throws IOException {
        int choice = 0;
        System.out.println("1--->Add Student");
        System.out.println("2--->Show all Students");
        System.out.println("3--->Search a Student");
        System.out.println("4--->Find average marks");
        System.out.println("5--->How many failed..");
        System.out.println("6--->Exit");
        System.out.println("Enter your choice");
        
        try {
            choice = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 6.");
            choice = 0; // Reset choice
        }

        return choice;
    }

    public void start() throws IOException {
        while (true) {
            int rollno, i;
            String name, target;
            float marks;
            Student s;
            int choice = menu();

            switch (choice) {
                case 1: // add Student
                    System.out.println("Enter data of student (rollno, name, marks):");
                    System.out.println("rollno");
                    rollno = Integer.parseInt(br.readLine());
                    System.out.println("name");
                    name = br.readLine();
                    System.out.println("marks");
                    marks = Float.parseFloat(br.readLine());
                    s = new Student(rollno, name, marks);
                    if (sdb.add(s)) {
                        System.out.println("Student added successfully...");
                    } else {
                        System.out.println("Sorry, array is full.");
                    }
                    break;

                case 2: // show all Students
                    for (i = 0; i < sdb.size(); i++) {
                        s = sdb.get(i);
                        System.out.println(s);
                    }
                    break;

                case 3: // search a Student
                    System.out.println("Enter name of student to be searched:");
                    target = br.readLine();
                    s = sdb.findByName(target);
                    if (s == null) {
                        System.out.println("No such student found.");
                    } else {
                        System.out.println("Student data: " + s);
                    }
                    break;

                case 4: // find average marks
                    int averageMarks = sdb.averageMarks();
                    System.out.println("Average marks of students: " + averageMarks);
                    break;

                case 5: // how many failed
                    int failed = sdb.failed();
                    System.out.println("Number of students failed: " + failed);
                    break;

                case 6: // exit
                    System.out.println("Exiting...");
                    return; // Exit the loop and terminate the program

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
    }
}
									