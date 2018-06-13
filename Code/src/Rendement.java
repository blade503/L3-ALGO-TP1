/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexandrewetzler
 */
public class Rendement {
    
    public static double tauxImpositionBenef = 38120;
    
    public static void main(String[] args) {

            interets(10000,0.75, 5);
            impots(50000, 80);

    }

    public static void interets(double solde, double taux, int annee){
            double soldeF = solde;

            for(int i= 0; i <= annee ; i++){
                    int interets =  (int) ((solde/100) * taux);
                    solde = (int) (solde + interets);
            }

        System.out.println("Au bout de " + annee + " ans le compte a gagné " + 
                (solde - soldeF) + " euro d'interets.");
        System.out.println("Votre solde intial était de " + soldeF + 
                " et vous avez maintenant avec les interets " + solde+"\n" );
    }
    
    
    // Si 75% capital possédé par des pers physiques
    // Si capital détenu par moins de 75%
    public static void impots(double benefice,double capital){
        double impots;
        if (capital > 75){
            if (benefice < tauxImpositionBenef){
                impots = benefice * (18/100);
                System.out.println("vous allez être imposé à hauteur de " + impots+ "€");
            } else {
                impots = benefice * ((33.1/3)/100);
                System.out.println("Vos benefices sont supérieurs à "
                +tauxImpositionBenef+ " vous allez donc payer " + impots+ "€");
            }
        } else{
            impots = benefice * ((33.1/3)/100);
            System.out.println("Votre capital inférieur à 75% vous allez donc payer " + impots + "€");
        }
    }
    
}
