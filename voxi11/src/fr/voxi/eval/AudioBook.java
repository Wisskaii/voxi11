package fr.voxi.eval;

import java.util.*;

public class AudioBook {
	
	private int numero ;
	private String titre ;
	private boolean gratuit ;
	
	public AudioBook(int numero, String titre, boolean gratuit) {
		super();
		this.numero = numero;
		this.titre = titre;
		this.gratuit = gratuit;
	}
	
	@Override
	public String toString() {
		return "AudioBook [numero=" + numero + ", titre=" + titre + ", gratuit=" + gratuit + "]";
	}

	private Map<Auditeur, Evaluation> evaluations = new HashMap<Auditeur, Evaluation>() ;
	
	//1.
	public boolean evaluer(Auditeur auditeur, Evaluation evaluation) {
		if(evaluations.containsKey(auditeur) == false) {
			evaluations.put(auditeur, evaluation) ;
			return true ;
		}
		else {
			return false ;
		}
	}
	
	//2.
	public void afficherEvaluations() {
		for(Auditeur auditeur : evaluations.keySet()){
			System.out.println(auditeur + "" + evaluations.get(auditeur));
		}
	}
	
	//3.
	public void supprimerEvaluation(Auditeur auditeur){
		if(evaluations.containsKey(auditeur)){
			System.out.println(evaluations.get(auditeur)) ;
			evaluations.remove(auditeur) ;
		}
		else{
			System.out.println("ERREUR : L'auditeur n'a pas évaluer l'AudioBook !");
		}
	}
	
	// 4.
	public boolean aEvalue(Auditeur auditeur){
		if(evaluations.containsKey(auditeur) == true){
			return true ;
		}
		else {
			return false ;
		}
	}
	
	//5.
	public ArrayList<Auditeur> getAuditeursAyantEvalue() {
		ArrayList<Auditeur> auditeurAyantEvalue = new ArrayList<>();
		for (Auditeur auditeur : evaluations.keySet()) {
			auditeurAyantEvalue.add(auditeur);
		}
		return auditeurAyantEvalue;
	}

	//6.

	public ArrayList<Evaluation> getEvaluationsEffectives(){
		ArrayList<Evaluation> evaluationsEffectives = new ArrayList<>() ;
		for(Evaluation evaluation : evaluations.values()){
			evaluationsEffectives.add(evaluation) ;
		}
		return evaluationsEffectives ;
	}

	//Faire exo 7.

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the gratuit
	 */
	public boolean isGratuit() {
		return gratuit;
	}

	/**
	 * @param gratuit the gratuit to set
	 */
	public void setGratuit(boolean gratuit) {
		this.gratuit = gratuit;
	}
	
}
