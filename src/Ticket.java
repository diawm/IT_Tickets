import java.util.Date;

public class Ticket {

	private String id;
	/* private Long id_staff; */
	private String panne;
	private String commentaire; 
	private Date date_signalisation;
	private String traitement;
	private Date date_fermeture;
	private Long id_it_staff;
	private Long id_add_it_staff;
	private boolean status;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/* public Long getId_staff() {
		return id_staff;
	}
	public void setId_staff(Long id_staff) {
		this.id_staff = id_staff;
	} */
	public String getPanne() {
		return panne;
	}
	public void setPanne(String panne) {
		this.panne = panne;
	}	
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Date getDate_signalisation() {
		return date_signalisation;
	}
	public void setDate_signalisation(Date date_signalisation) {
		this.date_signalisation = date_signalisation;
	}
	public String getTraitement() {
		return traitement;
	}
	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
	public Date getDate_fermeture() {
		return date_fermeture;
	}
	public void setDate_fermeture(Date date_fermeture) {
		this.date_fermeture = date_fermeture;
	}
	public Long getId_it_staff() {
		return id_it_staff;
	}
	public void setId_it_staff(Long id_it_staff) {
		this.id_it_staff = id_it_staff;
	}
	public Long getId_add_it_staff() {
		return id_add_it_staff;
	}
	public void setId_add_it_staff(Long id_add_it_staff) {
		this.id_add_it_staff = id_add_it_staff;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
