/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armas;

import personagens.*;
import java.util.Random;
import trabalho02.InOut;


/**
 *
 * @author Wel
 */
public class Arma {
    public int dano;
    public double chance;
    public String nome;
    
    
    public Arma(int dano,double chance){
        this.dano = dano;
        this.chance = chance;
    }
    
    public void usarArma(Personagem p, Personagem u){
        Random r = new Random();
        if(r.nextDouble() < (this.chance/100)){
            int d = r.nextInt(dano)+1;
            p.vida -= d;
            InOut.MsgDeInformacao("BATALHA", u.nome+" CAUSOU "+d+" DE DANO");
        }
        else
            InOut.MsgDeInformacao("BATALHA", u.nome+" ERROU O ALVO");

    }

}
