
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PpChuy
 */
public class Cronometro {
    long before, after;
    //int arr[];
    Metodos m;

    public Cronometro() {
        m= new Metodos();
    }
    
    
    
    
    public long burbuja(int []arr){
        before=0;
        after=0;
        before=System.nanoTime();
        m.burbuja(arr);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long quickSort(int[] arr, int izq, int der){
        before=0;
        after=0;
        before=System.nanoTime();
        m.quickSort(arr, izq, der);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long shellSort(int arr[]){
        before=0;
        after=0;
        before=System.nanoTime();
        m.shellsort(arr);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long radix(int arr[], int maxDigits){
        before=0;
        after=0;
        before=System.nanoTime();
        m.radix(arr, maxDigits);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long mezclaDirecta(int [] arreglo){
        before=0;
        after=0;
        before=System.nanoTime();
        m.mezclaDirecta(arreglo);
        after=System.nanoTime();
        return (after-before);
    }
    
        
    public long mezclaNatural(int [] arr){
        before=0;
        after=0;
        before=System.nanoTime();
        m.mezclaNatural(arr);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long secuencial(int arr[] , int x){
        before=0;
        after=0;
        before=System.nanoTime();
        m.secuencial(arr, x);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long binaria(int arr[], int x){
        before=0;
        after=0;
        before=System.nanoTime();
        m.binaria(arr, x);
        after=System.nanoTime();
        return (after-before);
    }
    
    public long[] probar(int arr[]){
        guardar(arr);
        long [] aux = new long[6];
        
        JOptionPane.showMessageDialog(null,Arrays.toString(abrir()));
        aux[0]=burbuja(abrir());
        
        
        JOptionPane.showMessageDialog(null,Arrays.toString(abrir()));
        aux[1]=quickSort(abrir(),0,abrir().length-1);
        
        JOptionPane.showMessageDialog(null,Arrays.toString(abrir()));
        aux[2]=shellSort(abrir());
        
        JOptionPane.showMessageDialog(null,Arrays.toString(abrir()));
        aux[3]=radix(abrir(),3);
        
        JOptionPane.showMessageDialog(null,Arrays.toString(abrir()));
        aux[4]=mezclaDirecta(abrir());
        
        JOptionPane.showMessageDialog(null,Arrays.toString(abrir()));
        aux[5]=mezclaNatural(abrir());
        
        return aux;
    }

    private void guardar(int arr[]){
        try{
            ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream("auxiliar"));
            archivo.writeObject(arr);
            archivo.close();
        }catch(Exception e){}
    }
    
    private int[] abrir(){
        
        try{
            ObjectInputStream archivo = new ObjectInputStream(new  FileInputStream("auxiliar"));
            int temp[]= (int[])archivo.readObject();
            archivo.close();
            return temp;
        }catch(Exception e){}
        return null;
    }
}
