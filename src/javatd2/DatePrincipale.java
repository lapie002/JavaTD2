/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatd2;

/**
 *
 * @author lapie
 */
public class DatePrincipale {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
                Date madate = new Date("31/12/2003");

		Date madate2 = new Date("28/2/2016");
		
		Date manouvelledate = new Date(01,02,2015);

		Date d2 = new Date("1/2/2010");

		// Affiche la date 
		System.out.println(madate.toString()); 

		// Affiche la date avec des entiers
		System.out.println(manouvelledate.toString());
 
		// Affiche la date 
		System.out.println(madate.toString2()); 

		// Affiche la date du lendemain
		System.out.println(madate.dateDuLendemain());

		// Affiche la date incrementée 
		System.out.println("la date du " + madate.toString() + " incrementée :");
		System.out.println(madate.increment());

		// Affiche la date incrementer d un annee bisextille 
		System.out.println("la date du " + madate2.toString() + " incrementée :");
		System.out.println(madate2.increment());

		// Affiche si ma madate est anterieure à d2
		System.out.println("la date " + madate.toString() + " anterieure à " + d2.toString() + " ? :");
		System.out.println(madate.ante(d2));

		// Affiche le nombre de jours separant d et d2
		System.out.println("le nombre de jours entre " + madate.toString() + " et " + d2.toString() + " :" );
		System.out.println(madate.duree(d2));

		// Affiche le nombre de jours separant d2 et d
		System.out.println("le nombre de jours entre " + d2.toString() + " et " + madate.toString() + " :" );
		System.out.println(d2.duree(madate));
    
    }
}
