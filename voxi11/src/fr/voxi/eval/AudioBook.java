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

	Map<Auditeur, Evaluation> evaluations = new HashMap<Auditeur, Evaluation>() ;
	
	public boolean evaluer(Auditeur auditeur, Evaluation evaluation) {
		if(evaluations.containsKey(auditeur) == false) {
			evaluations.put(auditeur, evaluation) ;
			return true ;
		}
		else {
			return false ;
		}
	}
	
	public void afficherEvaluations() {
		for(Auditeur auditeur : evaluations.keySet()) {
			evaluations.get(auditeur) ;
		}
		System.out.println(evaluations);
	}
	
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
