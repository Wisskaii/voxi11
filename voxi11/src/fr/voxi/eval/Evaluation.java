package fr.voxi.eval;

public class Evaluation {
	
	private int note ;
	private String commentaire ;
	
	public Evaluation(int note, String commentaire) {
		super();
		this.note = note;
		this.commentaire = commentaire;
	}
	
	@Override
	public String toString() {
		return "Evaluation [note=" + note + ", commentaire=" + commentaire + "]";
	}
	
	/**
	 * @return the note
	 */
	public int getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(int note) {
		this.note = note;
	}

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
}
