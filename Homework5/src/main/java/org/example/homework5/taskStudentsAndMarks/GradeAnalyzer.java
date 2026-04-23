package org.example.homework5.taskStudentsAndMarks;

public class GradeAnalyzer {
    double getAverage(Student s) {
        int sum = 0;

        for (int g : s.grades) {
            sum += g;
        }
        return (double) sum / s.grades.size();
    }
    int getHighestGrade(Student s) {
        int max = s.grades.get(0);
        for (int g : s.grades) {
            if (g > max) {
                max = g;
            }
        }

        return max;
    }
    int getLowestGrade(Student s) {
        int min = s.grades.get(0);

        for (int g : s.grades) {
            if (g < min) {
                min = g;
            }
        }
        return min;
    }
    int countPassingGrades(Student s) {
        int count = 0;
        for (int g : s.grades) {
            if (g >= 60) {
                count++;
            }
        }
        return count;
    }
    void printAllGrades(Student s) {
        System.out.print("Оцінки " + s.name + ": ");
        for (int g : s.grades) {
            System.out.print(g + " ");
        }
        System.out.println();
    }
}
