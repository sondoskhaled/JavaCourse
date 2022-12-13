package chapter12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Map popQuiz = new HashMap();
        Map makeupExam = new HashMap();
        int studentNumber=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter number of students:");
        studentNumber = scanner.nextInt();

        String studentName;
        double studentGrade;
        double studentGrade2;

        for (int i = 0; i < studentNumber; i++) {
            System.out.println("please enter student name # " + (i+1));
            studentName = scanner.next();
            System.out.println("please enter grade for student # " + (i+1) +" in pop quiz");
            studentGrade = scanner.nextDouble();
            System.out.println("please enter grade for student # " + (i+1) +" in make-up quiz");
            studentGrade2 = scanner.nextDouble();
            if (studentGrade2 > studentGrade )
            popQuiz.put(studentName,studentGrade2);
            else popQuiz.put(studentName,studentGrade);

        }

        popQuiz.forEach((k,v) -> System.out.println("Student Name : "+k+
                ", Grade : " +v));

    }
}
