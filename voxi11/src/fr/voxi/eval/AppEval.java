package fr.voxi.eval;
import java.util.* ;

public class AppEval {
	
	// Mettre la deuxième liste dans audiobook et y ajouter -evaluations

	public static void main(String[] args) {
		
		Auditeur audit1 = new Auditeur(1, "BRAAS", "Emma") ;
		Auditeur audit2 = new Auditeur(2, "DARBOE", "Diem") ;
		Auditeur audit3 = new Auditeur(3, "FERT", "Delphine") ;
		Auditeur audit4 = new Auditeur(4, "GAMBO", "Rachida") ;
		Auditeur audit5 = new Auditeur(5, "LUCINA", "Teptida") ;
		
		ArrayList<Auditeur> auditeurs = new ArrayList<>() ;
		auditeurs.add(audit1) ;
		auditeurs.add(audit2) ;
		auditeurs.add(audit3) ;
		auditeurs.add(audit4) ;
		auditeurs.add(audit5) ;
		
		Map<Auditeur, Evaluation> evaluations = new HashMap<Auditeur, Evaluation>() ;
		
		evaluations.put(audit1, new Evaluation(5, "Excellent !!!")) ;
		evaluations.put(audit2, new Evaluation(1, "Vraiment pas bon")) ;
		evaluations.put(audit3, new Evaluation(2, "Bof")) ;
		evaluations.put(audit4, new Evaluation(2, "La déception :(")) ;
		evaluations.put(audit5, new Evaluation(5, "Bravo")) ;
		
	}

}
