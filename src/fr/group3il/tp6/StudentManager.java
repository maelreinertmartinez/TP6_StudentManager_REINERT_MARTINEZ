package fr.group3il.tp6;

/**
 * Classe contenant plusieurs fonctions de gestion d'une promotion (afficher ses notes, calculer la moyenne, ...)
 */
public class StudentManager {
    public Student[] students;

    /**
     * Constructeur par défaut de la classe
     */
    public StudentManager() {
        students = new Student[3];

        students[0] = new Student("Alice", new double[]{12, 15, 9});
        students[1] = new Student("Bob", new double[]{8, 10});
        students[2] = new Student("Charlie", new double[]{14, 14, 13});
    }

    /**
     * Calcule la moyenne de toutes les notes d'une classe
     *
     * @return la moyenne
     */
    public double classAverage() {
        double classSum = 0;
        int numberOfGrades = 0;
        for (Student student : students) {
            classSum += sum(student.grades);
            numberOfGrades += student.grades.length;
        }

        return classSum / numberOfGrades;
    }

    /**
     * Donne la meilleure moyenne de la classe
     *
     * @return la meilleure moyenne
     */
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

    /**
     * Affiche tous les étudiants avec leurs moyennes
     */
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

    /**
     * Calcule la somme de plusieurs notes
     *
     * @param grades les notes
     * @return la somme
     */
    public double sum(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum;
    }

    /**
     * Calcule la moyenne de plusieurs notes
     *
     * @param grades les notes
     * @return la moyenne
     */
    private double computeAverage(double[] grades) {
        return sum(grades) / grades.length;
    }
}
