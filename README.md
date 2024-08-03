
# Student Database Management System

This Java application manages a student database with functionalities to add students, display all students, search for students by name, calculate average marks, and count failed students. 

## Features

- **Add Student**: Input student data (roll number, name, and marks) and add to the database.
- **Show All Students**: Display the list of all students with their details.
- **Search a Student**: Search for a student by name and display their details if found.
- **Find Average Marks**: Calculate and display the average marks of all students.
- **Count Failed Students**: Count and display the number of students who have failed (marks less than 40).

## Usage

1. **Add Student**: 
   - Choose option 1 from the menu.
   - Enter the student's roll number, name, and marks when prompted.

2. **Show All Students**: 
   - Choose option 2 from the menu.

3. **Search a Student**: 
   - Choose option 3 from the menu.
   - Enter the name of the student you want to search.

4. **Find Average Marks**: 
   - Choose option 4 from the menu.

5. **Count Failed Students**: 
   - Choose option 5 from the menu.

6. **Exit**: 
   - Choose option 6 from the menu to exit the application.
  
##License
This project is licensed under the Apache License 2.0. See the LICENSE file for details.

## Example

```plaintext
1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
1
Enter data of student (rollno, name, marks):
rollno
23
name
Alice
marks
30
Student added successfully...

1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
1
Enter data of student (rollno, name, marks):
rollno
2
name
Bob
marks
90
Student added successfully...

1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
2
Student [rollno=23, name=Alice, marks=30.0]
Student [rollno=2, name=Bob, marks=90.0]
Student [rollno=8, name=Jenny, marks=78.0]

1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
3
Enter name of student to be searched:
Jenny
Student data: Student [rollno=8, name=Jenny, marks=78.0]

1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
4
Average marks of students: 66

1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
5
Number of students failed: 1

1--->Add Student
2--->Show all Students
3--->Search a Student
4--->Find average marks
5--->How many failed..
6--->Exit
Enter your choice
6
Exiting...

