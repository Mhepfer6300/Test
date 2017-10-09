/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vektorrechnung;

/**
 *
 * @author menze
 */
public class Vektor {
    private double v1=0,v2=0,v3=0;
    
    public Vektor(double v1,double v2, double v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    
    public Vektor plus(Vektor that){
        return new Vektor(this.v1+that.v1,this.v2+that.v2,this.v3+that.v3);
    }
    
    public Vektor minus(Vektor that){
        return new Vektor(this.v1-that.v1,this.v2-that.v2,this.v3-that.v3);
    }
    
    public double skalar(Vektor that){
        return this.v1*that.v1+this.v2*that.v2+this.v3*that.v3;
    }
    
    public Vektor kreuz(Vektor that){
        return new Vektor(this.v2*that.v3-this.v3*that.v2,-(this.v1*that.v3-this.v3*that.v1),this.v1*that.v2-this.v2*that.v1);
    }
    
    public double quersumme(){
        return v1+v2+v3;
    }
    
    @Override
    public String toString(){
        return "("+v1+","+v2+","+v3+")";
    }
}
