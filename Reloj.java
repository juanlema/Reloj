/**
 * Clase Reloj, aumenta y disminuye hora
 * 
 * @author José Sotelo - Juan León
 */

public class Reloj
{
    private int hora;
    private int minutos;
    private int segundos;
    
    public Reloj(int h, int m, int s)
    {
        hora = h;
        minutos = m;
        segundos = s;
    }
        
    public int getHora()
    {
        return hora;
    }
    
    public int getMin()
    {
        return minutos;
    }
    
    public int getSeg()
    {
        return segundos;
    }
    
    public void aumentarSeg()
    {
        int ns = this.segundos+1;
        if(ns>59)
        {
            this.segundos=0;
            int nm=this.minutos+1;
            if(nm>59)
            {
                this.minutos=0;
                int nh = this.hora+1;
                if(nh>23)
                {
                    this.hora=0;
                }
                else
                {
                    this.hora++;
                }
            }
            else
            {
                this.minutos++;
            }
        }
        else
        {
            this.segundos++;
        }        
    } 
    
    public void disminuirSeg()
    {
        int ns = this.segundos-1;
        if(ns<0)
        {
            this.segundos=59;
            int nm=this.minutos-1;
            if(nm<0)
            {
                this.minutos=59;
                int nh = this.hora-1;
                if(nh<0)
                {
                    this.hora=23;
                }
                else
                {
                    this.hora--;
                }
            }
            else
            {
                this.minutos--;
            }
        }
        else
        {
            this.segundos--;
        } 
    }
    
    public static void main(String[] args)
    {
       Reloj relojito = new Reloj (23, 59 ,59);
       System.out.println("la hora exacta es: " + relojito.getHora() + " - " + relojito.getMin() + " - " + relojito.getSeg());
       relojito.aumentarSeg();
       System.out.println("la hora de reloj aumentando un segundo es: " + relojito.getHora() + " - " + relojito.getMin() + " - " + relojito.getSeg());
       relojito.disminuirSeg();
       
       System.out.println("la hora del reloj disminuyendo un segundo es: " + relojito.getHora() + " - " + relojito.getMin() + " - " + relojito.getSeg());
       
    }
    
}