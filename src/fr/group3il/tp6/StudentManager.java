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
        for (int i = 0; i < students.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < students[i].notes.length; j++) {
                studentSum = studentSum + students[i].notes[j];
            }

            classSum = classSum + studentSum;
        }

        return classSum / students.length; // 🐞 bug : division par le nombre d'étudiants
    }

    public int bestAverage() {
        double bestAverage = 0;
        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int j = 0; j < students[i].notes.length; j++) {
                sum = sum + students[i].notes[j];
            }

            double avg = sum / students[i].notes.length; // 🐞 bug : division entière
            if (avg > bestAverage) {
                bestAverage = avg;
            }
        }
        return (int) bestAverage;
    }

    public void printStudents() {
        System.out.println("Liste des étudiants :");

        for (int i = 0; i < students.length; i++) {
            System.out.println("- " + students[i].name);

            System.out.println("Notes :");
            for (int j = 0; j < students[i].notes.length; j++) {
                System.out.println(students[i].notes[j]);
            }

            System.out.println("Moyenne : " + average(students[i].notes));

            System.out.println("----------------");
        }
    }

    public double average(int[] notes) {
        int sum = 0;
        for (int i = 0; i < notes.length; i++) {
            sum = sum + notes[i];
        }

        return sum / notes.length; // 🐞 division entière
    }
}
