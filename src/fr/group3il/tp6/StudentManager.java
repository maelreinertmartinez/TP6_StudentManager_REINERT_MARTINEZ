package fr.group3il.tp6;

public class StudentManager {
    public Student[] students;

    public StudentManager() {
        students = new Student[3];

        students[0] = new Student("Alice", new int[]{12, 15, 9});
        students[1] = new Student("Bob", new int[]{8, 10});
        students[2] = new Student("Charlie", new int[]{14, 14, 13});
    }

    public double classAverage() {
        int classSum = 0;
        for (Student student : students) {
            int studentSum = sum(student.grades);

            classSum = classSum + studentSum;
        }

        return classSum / students.length; // 🐞 bug : division par le nombre d'étudiants
    }

    public int bestAverage() {
        double bestAverage = 0;
        for (Student student : students) {
            double avg = computeAverage(student.grades); // 🐞 bug : division entière
            if (avg > bestAverage) {
                bestAverage = avg;
            }
        }
        return (int) bestAverage;
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

    public int sum(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    private double computeAverage(int[] grades) {
        int sum = sum(grades);
        return sum / grades.length; // 🐞 division entière
    }
}
