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
    
    int num;
    int den;
    
    public Fraction(){};
    
    public Fraction(int num,int dem)
    {
        this.num = num;
        this.den = dem;
    };
    
    public Fraction(String f)
    {
        String[] parts = f.split("/");
        
        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[1]);
        
        this.num = part1;
        this.den = part2;
    }
    
    public Fraction(Fraction f)
    {
        this(f.num,f.den);
    }
    
    public Fraction reduire()
    {
        Utilitaire util = new Utilitaire();
        int d = util.PGCD(this.num,this.den);
        
        this.num = this.num / d;
        this.den = this.den / d;
        
        return this;
    
    }
    
    public Fraction addition(Fraction fx)
    {
        
        Fraction resultat = new Fraction();
     
        resultat.num = (this.num * fx.den) + (fx.num * this.den);
        resultat.den = this.den * fx.den;
        
        return resultat;
        
    }
    
    public Fraction soustraction(Fraction fx)
    {
        
        Fraction resultat = new Fraction();
     
        resultat.num = (this.num * fx.den) - (fx.num * this.den);
        resultat.den = this.den * fx.den;
        
        return resultat; 
    }
    
    public Fraction multiplication(Fraction fx)
    {
        Fraction resultat = new Fraction();
        
        resultat.num = this.num * fx.num;
        resultat.den = this.den * fx.den; 
        
        return resultat;
    }
    
    public Fraction division(Fraction fx)
    {
        Fraction resultat = new Fraction();
        
        resultat.num = this.num * fx.den;
        resultat.den = this.den * fx.num; 
        
        return resultat;
    }
    
    
    
    
    
    
}
