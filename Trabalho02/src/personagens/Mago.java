/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagens;
import armas.*;

/**
 *
 * @author Wel
 */
public class Mago extends Personagem{
    
    public Mago(boolean jogador) {
        super(jogador);
        this.vidaMax = 100;
        setVidas(this.vidaMax);
        Magia m = new Magia(10,50);
        setArma(m);
    }
    
}
