package org.mcverse;
public class Assurance {
    private float cout;
    private String couverture;

    /**
     **<p>Ceci est contructeur qui construit l'objet Assurance et initialise les
     *      * attributs avec les parametre suivants</p>
     * @param cout le cout de la couverture un float
     * @param couverture le type de couverture un String
     */
    public Assurance(float cout, String couverture) {
        this.cout = cout;
        this.couverture = couverture;
    }
    /**
     * <p>
     *cette methode est une accesseur communement "getter" qui retourne la valeur de l'attribut cout un float</p>
     * @return valeur de retour un nombre a virgule float
     */
    public float getCout() {
        return this.cout;
    }

    /**
     * <p>
     * une accesseur communement "getter" d'out la tradion de les appelé "getSuivieDeNomVariable"
     * </p>
     * @return valeur de retour une chaine de caracter un String
     */
    public String getCouverture() {
        return this.couverture;
    }

    /**
     * <p>cette methode est un mutateur qui permet de initialiser ou de modifier l'attribut
     * connue comme "setter" d'ou la tradition de l'appelation setSuivieNomAtribut</p>
     * @param cout
     */
    public void setCout(float cout) {
        this.cout = cout;
    }

    /**
     * <p>cette methode est un mutateur qui permet de initialiser ou de modifier l'attribut
     * connue comme "setter" d'ou la tradition de l'appelation setSuivieNomAtribut</p>
     * @param couverture
     */
    public void setCouverture(String couverture) {
        this.couverture = couverture;
    }
}
