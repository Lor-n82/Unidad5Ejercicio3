
package unidad5ejercicio3;

/**
 *
 * @author loren
 */
public class Pruebanumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        numero num1=new numero();
        
        num1.aniade(5);
        num1.resta(3);
        
        System.out.println("Muestra el valor: "+num1.getValor()+"\nMuestra el doble: "+num1.getDoble()+"\nMuestra el triple: "+num1.getTriple());
        
        num1.setNumero();
        
        System.out.println("Muestro el valor despues de reiniciarlizarlo: "+num1.getValor());
        
        System.out.println();
        
        numero num2=new numero(20);
        
        num2.aniade(5);
        num2.resta(3);
        
        System.out.println("Muestra el valor: "+num2.getValor()+"\nMuestra el doble: "+num2.getDoble()+"\nMuestra el triple: "+num2.getTriple());
        
        num2.setNumero();
        
        System.out.println("Muestro el valor despues de reiniciarlizarlo: "+num2.getValor());
    }
    
}
