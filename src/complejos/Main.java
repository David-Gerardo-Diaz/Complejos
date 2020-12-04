/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complejos;

/**
 *
 * @author gdmse*/
class Main {
  public static void main(String[] args) {
    Complejos c1=new Complejos(2,4);
    Complejos c2=new Complejos(6,4);
    for(int i=0;i<=6;i++)
    {
      if(i==1){System.out.println("Suma de los complejos:");
        c1.imprimir();
        c2.imprimir();
        Complejos.suma(c1, c2).imprimir();
        }
        if(i==2){ System.out.println("Resta de los complejos");
        c1.imprimir();
        c2.imprimir();
          Complejos.resta(c1, c2).imprimir();
        }
        if(i==3){ System.out.println("Multiplicacion de los complejos");
        c1.imprimir();
        c2.imprimir();
          Complejos.multiplicacion(c1, c2).imprimir();
        }
        if(i==4){ System.out.println("Divicion de los complejos");
        c1.imprimir();
        c2.imprimir();
          Complejos.dividir(c1, c2).imprimir();
        }
        if(i==5){ System.out.println("Conjugado del complejos");
        c1.imprimir();
          Complejos.conjugado(c1).imprimir();
        }
        if(i==6){ System.out.println("Conjugado del complejos");
        c2.imprimir();
          Complejos.conjugado(c2).imprimir();
        }
      }
    }
  }   