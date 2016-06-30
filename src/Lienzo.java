
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cherne
 */
public class Lienzo extends Canvas{
    Cronometro c;
    int arr[];
    long valores[];
   
    
    public Lienzo(int largo,int ancho){
        setSize(largo,ancho);
        c = new Cronometro();
        valores = new long[6];
        //valores[0]=600000;
        
    }
    
    public void paint(Graphics g){
        
        //marco del lienzo
        Graphics2D g2=(Graphics2D)g;
        g2.setStroke(new BasicStroke(4.0f));
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth(), getHeight());
        
        //Ejes de la grafica
        g.drawLine(40, getHeight()-20, 600, getHeight()-20);
        g.drawLine(40, getHeight()-20, 40, 20);
        
        g2.setStroke(new BasicStroke(2.0f));
        for(int i=0,a=0;i<10;i++,a+=26){
            g.drawLine(30, 20+a, 50, 20+a);
        }
        g2.setStroke(new BasicStroke(4.0f));
        g.drawString("Burbuja.",40,getHeight()-5);
        g.drawString("QuickSort.",100,getHeight()-5);
        g.drawString("ShellSort.",170,getHeight()-5);
        g.drawString("Radix.",240,getHeight()-5);
        g.drawString("Mezcla Dir.",290,getHeight()-5);
        g.drawString("Mezcla Nat.",360,getHeight()-5);
        g.drawString("B. Secuencial.",440,getHeight()-5);
        g.drawString("B. Binaria.",530,getHeight()-5);
        //Barritas
        
            //Burbuja
            long x = valores[0];
            x=(x*264)/100000;
            g.drawRect(50,(int)(264-x)+20, 25, (int)x);
            //quicksort
            x = valores[1];
            x=(x*264)/100000;
            g.drawRect(120,(int)(264-x)+20, 25, (int)x);
            //shell
            x = valores[2];
            x=(x*264)/100000;
            g.drawRect(180,(int)(264-x)+20, 25, (int)x);
            //radix
            x = valores[3];
            x=(x*264)/100000;
            g.drawRect(240,(int)(264-x)+20, 25, (int)x);
            //mezclaDirecta
            x = valores[4];
            x=(x*264)/100000;
            g.drawRect(300,(int)(264-x)+20, 25, (int)x);
            //MezclaNatural
            x = valores[5];
            x=(x*264)/100000;
            g.drawRect(360,(int)(264-x)+20, 25, (int)x);
            

     
    }
    
}
