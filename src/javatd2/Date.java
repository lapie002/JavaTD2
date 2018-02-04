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
public class Date {
    
    private int jour;
    private int mois;
    private int annee;
    
    private static String mesMois[] = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"};
    
    public Date()
    {
    
    }
    
    public Date(int j, int m, int a)
    {
        this.jour = j;
        this.mois = m;
        this.annee = a;
    }
    
    //constructeur avec date en haine de caracteres
    public Date(String uneDate)
    {
        String parts[] = uneDate.split("/");
        
        this.jour  = Integer.parseInt(parts[0]);
        this.mois  = Integer.parseInt(parts[1]);
        this.annee = Integer.parseInt(parts[2]);
    }
    
    //constructeur par recopie
    public Date(Date d)
    {
        this(d.jour,d.mois,d.annee);
    }
    
    public String toString()
    {
        String jour = Integer.toString(this.jour);
        String mois = Integer.toString(this.mois);
        String annee = Integer.toString(this.annee);
        
        String s = jour + "/" + mois + "/" + annee;
        
        return s;
    }
    
    public String toString2()
    {  
        String s = this.jour + " " + this.mesMois[mois-1] + " " + this.annee;
        
        return s; 
    }
    
    public String dateDuLendemain()
    {
        int j = 0;
        int m = 0;
        int a = 0;
        
        int  mesJoursParMois[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        if(this.jour < mesJoursParMois[this.mois - 1])
        {
            j = this.jour + 1;
            m = this.mois;
            a = this.annee;
        }
        else if(this.jour == mesJoursParMois[this.mois - 1] && this.mois < 12)
        {
            j = 1;
            m = this.mois + 1;
            a = this.annee;
        }
        else
        {
            j = 1;
            m = 1;
            a = this.annee + 1;
        
        }
        
	Date machaine = new Date(j,m,a);
		
        return machaine.toString();
    }
    
    private boolean bissextiles()
    {
        int a = this.annee;
        return (a%4 == 0 && a%100!=0) || (a%4 == 400);
    }
    
    public Date increment()
    {
        int  mesJoursParMois[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        if(this.bissextiles())
        {
            mesJoursParMois[1] = 29;
        }
        
        if(this.jour < mesJoursParMois[this.mois - 1])
        {
            this.jour++;
        }
        else if(this.jour == mesJoursParMois[this.mois - 1] && this.mois < 12)
        {
            this.jour = 1;
            this.mois++;
        }
        else
        {
            this.jour = 1;
            this.mois = 1;
            this.annee++;
        }
        
        return this;
        
    }
    
    public boolean egale(Date d2)
    {
        boolean egaux = false;
        
        if(this.jour == d2.jour && this.mois == d2.mois && this.annee == d2.annee)
        {
            egaux = true;
        }
        
        return egaux;
    }
    
    	public boolean ante(Date d2)
        //prérequis: une date d et un objet courant de type Date
        //retourne True si la date d2 est antérieure à l'objet courant sinon False
        //stratégie: utilise "if" et "else" (conditionnelle et alternative)
        {
            boolean anterieur = false;
            
            if(this.annee < d2.annee)
            {
                anterieur = true;
            }
            else if(this.annee == d2.annee && this.mois<d2.mois)
            {
                anterieur = true;
            }
            else if(this.annee == d2.annee && this.mois == d2.mois && this.jour<d2.jour)
            {
                anterieur = true;
            }
            return anterieur;
        }
        
        // parametre : d2 represente une date 
        // retourne : vrai si la date passee en parametre est posterieure a la date inscrite dans l'objet courant.
	public boolean posterieur(Date d2)
        {
            return !this.egale(d2) && !this.ante(d2);
        }
        
        // parametre : d2 represente une date
        // retourne : le nombre de jours qui s'est ecoule entre 
        // la date de l'objet courant et d2
	public int duree(Date d2)
        {
            int nb_jour = 0;
            Date copieObjetCourant = new Date(this);
            Date copieDate2 = new Date(d2);
            
            //test
            //System.out.println("anterieur " + this.ante(d2));
            //System.out.println("posterieure "+this.posterieur(d2));
            if(copieObjetCourant.ante(copieDate2))
            {
                while(!copieObjetCourant.egale(copieDate2))
                {
                    nb_jour++;
                    copieObjetCourant.increment();
                }
            }
            if(copieObjetCourant.posterieur(copieDate2))
            {
                while(!copieObjetCourant.egale(copieDate2))
                {
                    nb_jour++;
                    copieDate2.increment();
                }
            }
            
            return nb_jour;
        }
    
    
    
    
    
    
}
