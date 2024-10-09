package org.mcverse;

public class Paiement {
    private float montant;
    private String datePaiement;
    private String methodePaiement;
    /**
     *
     * @param montant
     * @param datePaiement
     * @param methodePaiement
     */
    public Paiement(float montant, String datePaiement, String methodePaiement) {
        this.montant = montant;
        this.datePaiement = datePaiement;
        this.methodePaiement = methodePaiement;
    }
    /**
     *
     * @return
     */
    public float getMontant() {
        return montant;
    }
    /**
     *
     * @param montant
     */
    public void setMontant(float montant) {
        this.montant = montant;
    }
    /**
     *
     * @return
     */
    public String getDatePaiement() {
        return datePaiement;
    }
    /**
     *
     * @param datePaiement
     */
    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }

    /**
     *
     * @return
     */
    public String getMethodePaiement() {
        return methodePaiement;
    }
    /**
     *
     * @param methodePaiement
     */
    public void setMethodePaiement(String methodePaiement) {
        this.methodePaiement = methodePaiement;
    }
    /**
     *
     * @param datePaiement
     * @param methodePaiement
     */
    public void traiterPaiement(String datePaiement, String methodePaiement) {
        this.datePaiement = datePaiement;
    }
    /**
     * @param datePaiement
     * @param methodePaiement
     * @param montant
     */
    public void rembourser(String datePaiement, String methodePaiement, float montant) {
        this.datePaiement = datePaiement;
        this.methodePaiement = methodePaiement;
        this.montant = montant;
    }
}
