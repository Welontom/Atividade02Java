/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagens;

import armas.*;
import trabalho02.InOut;

/**
 *
 * @author Wel
 */
public class Dragao extends Personagem{
    
    public Dragao(boolean jogador) {
        super(jogador);
        this.vidaMax = 100;
        setVidas(this.vidaMax);
        Magia m = new Magia(1000,100);
        setArma(m);
    }
    
    
    @Override
    public void ler(){
        InOut.MsgDeInformacao("Sobre a sua arma", "Você é muito poderoso, porém não sabe ler...");
    
    }
    
    
}
