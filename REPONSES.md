J'ai réalisé ce TP sur IntellijIDEA.

Repo github : https://github.com/maelreinertmartinez/TP6_StudentManager_REINERT_MARTINEZ.git

1. Quelles sont les 3 classes du projet et à quoi servent-elles ?

Les 3 classes du projet sont :
   - Student qui est le modèle qui stocke les notes et le nom de l'étudiant.
   - StudentManager va gérer tous les calcules des notes et l'affichage des étudiants.
   - StudentApp qui contient le point d'entrée du programme.

2. Quelles données sont stockées pour chaque étudiant ?

Les données stockées sont le nom dans la variable n de type String et les notes dans un tableau d'entiers.

3. Que fait la méthode :

   - printStudents() : affiche tous les étudiants avec leurs notes et moyennes.
   - classAverage() : calcule et retourne la moyenne de la classe.
   - bestAverage() : calcule les moyennes des étudiants de la classe pour en retourner la meilleure.
   - average(int[] t) : calcule les moyennes d'un tableau d'entier.

4. Calculez à la main :

   - la moyenne de Alice (12, 15, 9) : 12
   - la moyenne de Bob (8, 10) : 9
   - la moyenne de Charlie (14, 14, 13) : 13.67
   - la vraie moyenne de la classe (toutes les notes confondues) : 11.56

5. Comparez ces valeurs avec celles affichées par le programme. Y a-t-il des résultats incorrects ?

|         |  Par le programme   | Calculé |
|---------|:-------------------:|:-------:|
| Alice   |        12.0         |  12.0   |
| Bob     |         9.0         |   9.0   |
| Charlie |        13.0         |  13.67  |
| Classe  | 31.0 (pourquoi pas) |  11.56  |

La moyenne de Charlie et de la classe sont incorrect.
