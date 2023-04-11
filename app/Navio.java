package app;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Navio implements Transporte  { 

    Navio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void entregar() {
        System.out.println ("Entregando por navio...");
    }
    
}
/* Este código é uma classe Java chamada "Navio" que implementa a interface "Transporte". 
A classe possui um construtor padrão que não
faz nada além de lançar uma exceção "UnsupportedOperationException".

O método "entregar()" é uma implementação da interface "Transporte" e exibe uma
mensagem na saída padrão indicando que a entrega está sendo realizada por um navio.*/