package org.example.homework5.taskStudentsAndMarks;

public class Main {
    public static void main(String[] args) {
        GradeAnalyzer analyzer = new GradeAnalyzer();
        Student s1 = new Student("Alex");
        Student s2 = new Student("Platon");
        Student s3 = new Student("Olena");
        s1.addGrade(90);
        s1.addGrade(75);
        s1.addGrade(88);
        s1.addGrade(60);

        s2.addGrade(55);
        s2.addGrade(70);
        s2.addGrade(80);
        s2.addGrade(65);

        s3.addGrade(95);
        s3.addGrade(92);
        s3.addGrade(88);
        s3.addGrade(100);

        Student best = s1;

        Student[] students = {s1, s2, s3};

        for (Student s : students) {

            System.out.println("===== " + s.name + " =====");

            analyzer.printAllGrades(s);
            System.out.println("Середній бал: " + analyzer.getAverage(s));
            System.out.println("Максимум: " + analyzer.getHighestGrade(s));
            System.out.println("Мінімум: " + analyzer.getLowestGrade(s));
            System.out.println("Прохідних: " + analyzer.countPassingGrades(s));

            System.out.println();

            if (analyzer.getAverage(s) > analyzer.getAverage(best)) {
                best = s;
            }
        }

        System.out.println("Найкращий студент: " + best.name);
    }
}
