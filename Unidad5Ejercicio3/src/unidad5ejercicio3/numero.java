/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad5ejercicio3;

/**
 *
 * @author loren
 */
public class numero {
    
    private int numero;
    
    //contructores
    
    public numero(){
        numero=0;
    }
    public numero(int n){
        numero=n;
    }
    
    //metodos
    /**
     * Permite sumarle un numero al valor interno
     * @param nmas 
     */
    public void aniade(int nmas){
        numero+=nmas;
    }
    /**
     * Permite restarle un numero al valor interno
     * @param nmenos 
     */
    public void resta(int nmenos){
        numero-=nmenos;
    }
    /**
     * Devuelve el valor de numero
     * @return 
     */
    public int getValor(){
     return numero;
    }/**
     * Devuelve el valor doble del numero
     * @return 
     */
    public int getDoble(){
     return numero*2;
    }/**
     * Devuelve el valor triple del numero
     * @return 
     */
    public int getTriple(){
     return numero*3;
    }/**
     *  Inicializa el numero a 0
     */
    public void setNumero(){
     numero=0;
    }
    
    
}
