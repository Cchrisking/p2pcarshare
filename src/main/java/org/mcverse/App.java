// import statements

/**
 * @author      Christou Christos
 * @version     1.0
 * @since       1.0
 * <p>Je ne me suis pas amusée exploitée toutes les classes</br>
 *
 * </p>
 */
package org.mcverse;

public class  App {
    public static void main(String[] args) {
        System.out.println("DEBUT DU PROGRAMME");
        System.out.println("===============================================");
        /*
         * instantiation d'un objet locataire est un Locataire
         * */
        Locataire locataire = new Locataire();
        locataire.setNom("Marc");
        locataire.setAdress("Paris");
        locataire.setId(23);
        locataire.setEmail("marc@gmail.com");
        locataire.setTel(0640022);
        /*
        * instantiation d'un objet jean est un Locataire
        * */
        Locataire jean = new Locataire(1,"Jean-pierre","Marseille",1232039,"jn@g.com");
        System.out.println("===============================================");
        Locateur locateur = new Locateur("Bean","London",76767,234,"dm@gmail.com");
        System.out.println("===============================================");
        if(locateur.getVoitures().isEmpty()){
            System.out.println("Le locateur: "+locateur.getNom()+" ne possede pas des voitures");
            System.out.println("===============================================");
        }
        locateur.ajouterVoiture(new Voiture(7,"Lucid","Air",165.99f,true));
        System.out.println("Le locateur: "+locateur.getNom()+" possede: ");
        for(int index=0; index<locateur.getVoitures().size();index++){
            Voiture voiture = locateur.getVoitures().get(index);
            System.out.println(voiture.getMarque()+" modele: "+voiture.getModele()+" disponible: "+voiture.getStatus()+" pour: "+
                    voiture.getPrix()+"€");
        }
        System.out.println("===============================================");
        Location unelocation= new Location(locateur.getVoitures().getFirst(),jean,"20/07/2024","22/07/2024");
        unelocation.ajouteCouverture(new Assurance(35.24f,"Accident mineur"));
        unelocation.ajouteCouverture(new Assurance(41.24f,"individuelle"));
        unelocation.calculCoutTotal(2);
        unelocation.getVoiture().setStatus(false);
        System.out.println("Le locateur: "+unelocation.getLocataire().getNom()+" loue: "+
        unelocation.getVoiture().getMarque()+" "+unelocation.getVoiture().getModele()+"\nPour un total de :"+
                unelocation.getTotal()+"€");
        System.out.println("FIN DE PROGRAMME");
        System.out.println("===============================================");
    }
}
