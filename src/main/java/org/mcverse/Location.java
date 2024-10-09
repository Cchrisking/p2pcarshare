package org.mcverse;
import java.util.ArrayList;

/***
 *
 */
public class Location {
    private Voiture voiture;
    private Locataire locataire;
    private String dateDebut;
    private String dateFin;
    private float coutTotal;
    private ArrayList<Paiement>paiements=new ArrayList<>();
    private ArrayList<Assurance>couvertures=new ArrayList<>();
    /***
     *
     * @param voiture
     * @param locataire
     * @param dateDebut
     * @param dateFin
     */
    public Location(Voiture voiture, Locataire locataire, String dateDebut, String dateFin) {
        this.voiture = voiture;
        this.locataire = locataire;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.coutTotal = 0;
    }
    /***
     *
     * @return
     */
    public Voiture getVoiture() {
        return voiture;
    }
    /***
     *
     * @param voiture
     */
    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
    /**
     * @return
     */
    public Locataire getLocataire() {
        return locataire;
    }
    /***
     *
     * @param locataire
     */
    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }
    /**
     *
     * @return
     */
    public String getDateDebut() {
        return dateDebut;
    }
    /**
     *
     * @param dateDebut
     */
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }
    /**
     *
     * @return
     */
    public String getDateFin() {
        return dateFin;
    }
    /**
     *
     * @param dateFin
     */
    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
    /**
     *
     * @return
     */
    public ArrayList<Paiement> getPaiements() {
        return paiements;
    }
    /**
     *
     * @param paiements
     */
    public void setPaiements(ArrayList<Paiement> paiements) {
        this.paiements = paiements;
    }
    /**
     *
     * @return
     */
    public ArrayList<Assurance> getCouvertures() {
        return couvertures;
    }
    /**
     *
     * @param couvertures
     */
    public void setCouvertures(ArrayList<Assurance> couvertures) {
        this.couvertures = couvertures;
    }
    /**
     *
     * @return
     */
    public void calculCoutTotal(int dureeLocation){
        float total = 0;
        total+=dureeLocation*this.getVoiture().getPrix();
        for(int index=0;index<couvertures.size();index++) {
            total += couvertures.get(index).getCout();
        }
        this.coutTotal += total;
    }

    /**
     *
     * @param dateFin
     * @return
     */
    public boolean prolongeLocation(String dateFin) {
        this.dateFin=dateFin;
        return this.dateFin.equals(dateFin);
    }
    /**
     *
     * @return
     */
    public boolean retourneVoiture() {
        return true;
    }
    /**
     *
     * @param assurance
     * @return
     */
    public boolean ajouteCouverture(Assurance assurance) {
        return this.couvertures.add(assurance);
    }
    public float getTotal() {
        return this.coutTotal;
    }
}
