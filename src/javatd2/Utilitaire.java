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
public class Utilitaire {
    
    public int PGCD(int a,int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while(a!=b)
        {
            if(a>b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        
        return a;
    }
    
}
