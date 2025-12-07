package fr.group3il.tp6;

/**
 * Point d'entrée de l'application
 */
public class StudentApplication {
    public static void main(String[] args) {
        StudentManager m = new StudentManager();

        m.printStudents();

        System.out.println("Moyenne de la classe : " + m.classAverage());
        System.out.println("Meilleure moyenne : " + m.bestAverage());
    }
}
