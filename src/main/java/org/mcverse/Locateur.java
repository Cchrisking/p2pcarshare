package org.mcverse;
import java.util.ArrayList;
public class Locateur extends Locataire {
    private ArrayList<Voiture> voitures=new ArrayList<>();
    /**
     * <p>Ceci est un constructeur qui construit l'objet locateur avec en initialisant les attributs avec parametres suivants</p>
     * @param name
     * @param adresse
     * @param id
     * @param tel
     */
    public Locateur(String name, String adresse, int id, int tel,String email) {
        super(id,name,adresse,tel,email);
        System.out.println("ce client est un Locateur");
    }

    /**
     * *<p>cette methode Appel le constructeur de Voiture implicitement.</br>
     * et ajoute la voiture dans la liste des voiture de l'object</br>
     * et retourne et booleen true si l'ajout se passé avec success false si non</br>
     * je fais le choix de booleen ici contre void, ce pratique permet de savoir si l'action se execute avec success</br>
     * </p>
     * @param voiture
     * @return
     */
    public boolean ajouterVoiture(Voiture voiture){
        return voitures.add(voiture);
    }
    /**
     *
     * @param voiture
     * @return
     */
    public boolean suppVoiture(Voiture voiture){
        return voitures.remove(voiture);
    }
    public ArrayList<Voiture> getVoitures(){
        return voitures;
    }
}