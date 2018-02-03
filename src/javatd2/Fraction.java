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
public class Fraction {
    
    int p;
    int q;
    
    public Fraction(){};
    
    public Fraction(int num,int dem)
    {
        this.p = num;
        this.q = dem;
    };
    
    public Fraction(String f)
    {
        String[] parts = f.split("/");
        
        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[1]);
        
        this.p = part1;
        this.q = part2;
    }
    
    public Fraction(Fraction f)
    {
        this(f.p,f.q);
    }
    
    public Fraction reduire()
    {
        Utilitaire util = new Utilitaire();
        int d = util.PGCD(this.p,this.q);
        
        this.p = this.p / d;
        this.q = this.q / d;
        
        return this;
    
    }
    
    public Fraction addition(Fraction fx)
    {
        Fraction resultat = new Fraction();
     
        resultat.p = (this.p * fx.q) + (fx.p * this.q);
        resultat.q = this.q * fx.q;
        
        return resultat; 
    }
    
    
    
    
}
