package fr.voxi.eval;
import java.util.* ;

public class AppEval {
	
	public static void main(String[] args) {
		
		Auditeur audit1 = new Auditeur(1, "BRAAS", "Emma") ;
		Auditeur audit2 = new Auditeur(2, "DARBOE", "Diem") ;
		Auditeur audit3 = new Auditeur(3, "FERT", "Delphine") ;
		Auditeur audit4 = new Auditeur(4, "GAMBO", "Rachida") ;
		Auditeur audit5 = new Auditeur(5, "LUCINA", "Teptida") ;
						
		Evaluation eval1 = new Evaluation(5, "Excellent !!!") ;
		Evaluation eval2 = new Evaluation(1, "Vraiment pas bon") ;
		Evaluation eval3 = new Evaluation(2, "Bof") ;
		Evaluation eval4 = new Evaluation(2, "La déception :(") ;
		Evaluation eval5 = new Evaluation(5, "Bravo") ;
		
		AudioBook ab23 = new AudioBook(23, "Bel ami", true) ;
		System.out.println(ab23);
		
		// Exercice 1.
		
		System.out.println();
		
		ab23.evaluer(audit1, eval1) ;
		ab23.evaluer(audit2, eval2) ;
		ab23.evaluer(audit3, eval3) ;
		ab23.evaluer(audit4, eval4) ;
		ab23.evaluer(audit5, eval5) ;
			
		// Exercice 2.
		
		ab23.afficherEvaluations();
		
		System.out.println();
		
		// Exercice 3.
		
		ab23.supprimerEvaluation(audit4) ;
		System.out.println();
		ab23.afficherEvaluations();
		
		System.out.println();
		
		// Exercice 4.
		
		System.out.println(ab23.aEvalue(audit4));
		System.out.println();
		
		// Exercice 5.
		
		System.out.println(ab23.getAuditeursAyantEvalue());
		System.out.println();

		// Exercice 6.

		System.out.println(ab23.getEvaluationsEffectives());
		System.out.println();

		// Faire Ecercice 7.

	}

}
