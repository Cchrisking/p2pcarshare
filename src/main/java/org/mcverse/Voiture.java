package org.mcverse;

public class Voiture {
    private int id;
    private String marque;
    private String modele;
    private float prixLocation;
    private boolean status;
    /**
     *<p>Ceci est contructeur qui construit l'objet voiture et initialise les
     * attributs avec les parametre suivants</p>
     * @param id pour id de la voiture
     * @param marque la marque de la voiture un String
     * @param modele le modele de la voiture un String
     * @param prix le prix de location un float
     * @param status le status un booleen
     */
    public Voiture(int id, String marque, String modele,float prix, boolean status) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.status = status;
        this.prixLocation = prix;
        System.out.println("Creation de nouvelle voiture");
        System.out.println("id: "+this.id+" marque: "+this.marque+" modele: "+this.modele+" status: "+this.status);
        System.out.println("===============================================");
    }
    /**
     *<p>cette methode retourne une valeur de type numerique entier ici l'attribut id</p>
     * @return
     */
    public int getId() {
        return id;

    }
    /**
     *<p>cette methode initialise ou modifie l'attribut ici id de l'instence en question et ne retourne un void un vide rien</p>
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     *<p>cette methode retourne une valeur de type chaine de caractere "String" ici l'attribut marque</p>
     * @return
     */
    public String getMarque() {
        return marque;
    }
    /**
     *
     * @param marque
     */
    public void setMarque(String marque) {

        this.marque = marque;
    }
    /**
     *
     * @return
     */
    public String getModele() {
        return modele;
    }
    /**
     *
     * @param modele
     */
    public void setModele(String modele) {

        this.modele = modele;
    }
    /**
     *
     * @return
     */
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    /**
     *
     * @param status
     */
    public void mettreAjourStatus(boolean status) {
        this.status = status;
    }
    public float getPrix() {
        return prixLocation;
    }
}
