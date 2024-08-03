package com.mrudula.chapter3;


public class StudentDB {

    private Student s[];
    int n;

    public StudentDB() {
        super();
        s = new Student[4]; // Array size is 4
        n = 0;
    }

    boolean add(Student p) {
        if (n == s.length) { // Check if the array is full
            return false;
        } else {
            s[n] = p;
            n++;
            return true;
        }
    }

    int size() {
        return n;
    }

    Student get(int i) {
        return s[i];
    }

    Student findByName(String target) {
        for (int i = 0; i < n; i++) {
            String name = s[i].getName();
            if (name.equals(target))
                return s[i]; // Found
        }
        return null; // Not found
    }

    int averageMarks() {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += s[i].getMarks();
        }
        return n == 0 ? 0 : total / n; // Avoid division by zero
    }

    int failed() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].getMarks() < 40) {
                count++;
            }
        }
        return count;
    }
}
