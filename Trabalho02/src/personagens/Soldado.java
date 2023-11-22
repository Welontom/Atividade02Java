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
public class Soldado extends Terrestres {

    public Soldado(boolean jogador) {
        super(jogador);
        this.vidaMax = 80;
        setVidas(this.vidaMax);
        Desarmado d = new Desarmado(10,40);
        setArma(d);
    }


}
