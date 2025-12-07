package fr.group3il.tp6;

/**
 * Model d'un étudiant
 */
public class Student {
    public String name;
    public double[] grades;

    /**
     * Constructeur du model étudiant
     *
     * @param name le nom de l'étudiant
     * @param grades les notes de l'étudiant
     */
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }
}
