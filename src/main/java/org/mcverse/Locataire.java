package org.mcverse;

public class Locataire {
    private int id;
    private String nom;
    private String adress;
    private int tel;
    private String email;
    /**
     *<p>ceci est un constructeur qui construit les objets locataire en initialisant les attributs avec les donnée passée en parametre</p>
     * @param id
     * @param nom
     * @param adress
     * @param tel
     * @param email
     */
    public Locataire(int id, String nom, String adress, int tel, String email) {
        this.id = id;
        this.nom = nom;
        this.adress = adress;
        this.tel = tel;
        this.email = email;
        System.out.print("Creation de nouveau client avec succès:\n");
        System.out.println("Id: "+this.getId()+"Nom: "+this.getNom()+"\n"+"adress: "+getAdress()+"\n"+"tel: "+
                getTel()+"\n"+"email: "+getEmail());
    }
    /**
     *<p>ceci est constructeur par defaut qui construit l'objet en laissant les attribus d'objet en question non initialisé<p/>
     */
    public Locataire() {
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getAdress() {
        return adress;
    }

    /**
     *
     * @param adress
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     *
     * @return
     */
    public int getTel() {
        return tel;
    }

    /**
     *
     * @param tel
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public boolean mettreAjourInfoContact(){
        return true;
    }
}
