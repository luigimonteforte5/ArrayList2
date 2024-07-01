import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main( String[] args ) {
		List <Student> studenti = new ArrayList <>();
		System.out.println(studenti);

		studenti.add(new Student("Alice", 20));
		studenti.add(new Student("Bruno", 21));
		studenti.add(new Student("Carla", 22));
		studenti.add(new Student("Davide", 23));
		studenti.add(new Student("Elisa", 24));
		studenti.add(new Student("Franco", 25));
		studenti.add(new Student("Giulia", 26));
		studenti.add(new Student("Luca", 27));
		studenti.add(new Student("Marta", 28));

		System.out.println(studenti);

		studenti.sort(new comparatoreNomiStudenti());

		System.out.println("Lista dopo l'ordinamento: " + studenti);

	}
}

class comparatoreNomiStudenti implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}