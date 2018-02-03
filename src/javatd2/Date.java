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
        
        
    
    
    }
    
    
    
}
