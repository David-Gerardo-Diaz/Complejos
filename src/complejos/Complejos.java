/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *
 * @author gdmse
 */
import java.util.Scanner;

public class Complejos{
  private float real=0;
  private float imag=0;
  public Complejos(){
    this.real=0;
    this.imag=0;
  }
  public Complejos(float real,float imag){
      this.imag=imag;
      this.real=real;
  }
  public void setReal(float real){
    this.real=real;
  }
  public void setImag(float img){
    this.imag=img;
  }
  public float getReal(){
    return this.real;
  }
  public float getImag(){
    return this.imag;
  }
  public Complejos suma(Complejos c1){
    return new Complejos(this.real+c1.getReal(),this.imag+c1.getImag());
  }

  public static Complejos suma(Complejos c1,Complejos c2){
    return c1.suma(c2);
  }


  public Complejos resta(Complejos c1){
    return this.suma(new Complejos(-c1.real,-c1.imag));
  }
  public static Complejos resta(Complejos c1,Complejos c2){
    return c1.resta(c2);
  }

  public Complejos multiplicacion(Complejos c1){
    return new Complejos(this.real*c1.getReal()-(this.imag * c1.getImag()),(this.real*c1.getImag()) + (this.imag*c1.getReal()));
  }
  public static Complejos multiplicacion(Complejos c1,Complejos c2){
    return c1.multiplicacion(c2);
  }

  public Complejos conjugado(){
    return new Complejos(this.real,-this.imag);
  }
  public static Complejos conjugado(Complejos c1){
    return c1.conjugado();
  }

  public Complejos dividir(Complejos c2){
    Complejos res=new Complejos();
    Complejos numer=this.multiplicacion(c2.conjugado());
    res.real=numer.real/c2.multiplicacion(c2.conjugado()).real;
    res.imag=numer.imag/c2.multiplicacion(c2.conjugado()).real;
    return res;
  }
  public static Complejos dividir(Complejos c1,Complejos c2){
    return c1.dividir(c2);
  }

public double norma(){
  return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
}
public static double norma(Complejos c1){
  return c1.norma();
}

public void leer(){
  Scanner s=new Scanner(System.in);
  System.out.println("digite la parte real del numero complejo");
  this.real=s.nextFloat();
  System.out.println("digite la parte imaginaria del "+this+" numero complejo");
  this.imag=s.nextFloat();
}

 public void imprimir(){
  if(this.imag>=0){
      System.out.println(this.real+"+"+this.imag+"i");
    }
    else{
      System.out.println(this.real+this.imag+"i");
    }
  }  
} 