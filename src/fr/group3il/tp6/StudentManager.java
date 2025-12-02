package fr.group3il.tp6;

public class StudentManager {
    public Student[] students;

    public StudentManager() {
        students = new Student[3];

        students[0] = new Student("Alice", new double[]{12, 15, 9});
        students[1] = new Student("Bob", new double[]{8, 10});
        students[2] = new Student("Charlie", new double[]{14, 14, 13});
    }

    public double classAverage() {
        double classSum = 0;
        int numberOfGrades = 0;
        for (Student student : students) {
            classSum += sum(student.grades);
            numberOfGrades += student.grades.length;
        }

        return classSum / numberOfGrades;
    }

    public double bestAverage() {
        double bestAverage = 0;
        for (Student student : students) {
            double avg = computeAverage(student.grades);
            if (avg > bestAverage) {
                bestAverage = avg;
            }
        }

        return bestAverage;
    }

    public void printStudents() {
        System.out.println("Liste des étudiants :");

        for (Student student : students) {
            System.out.println("- " + student.name);

            System.out.println("Notes :");
            for (int j = 0; j < student.grades.length; j++) {
                System.out.println(student.grades[j]);
            }

            System.out.println("Moyenne : " + computeAverage(student.grades));

            System.out.println("----------------");
        }
    }

    public double sum(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum;
    }

    private double computeAverage(double[] grades) {
        return sum(grades) / grades.length;
    }
}
