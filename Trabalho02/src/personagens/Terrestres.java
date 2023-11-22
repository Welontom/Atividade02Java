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
public class Terrestres extends Personagem{
    
    public Terrestres(boolean jogador) {
        super(jogador);
        
    }
    public void loja(){
        boolean loop = true;
            while(loop){
                int e = InOut.leInt("ARMA ATUAL: "+this.a.nome+"\nSUA VIDA: "+this.vida
                    + "\nMOEDAS: $"
                    + this.moedas
                    + "\n-----------------------------------"
                    + "\nESCOLHA UMA OPÇÃO:"
                    + "\n1-Aumentar Vida Máxima ($5)"
                    + "\n2-Faca ($5)"
                    + "\n3-Revólver ($10)"
                    + "\n4-Sair"); 
                switch(e){
                    case 1:
                        if(this.moedas >=5){
                            this.vidaMax += 50;
                            this.vida = this.vidaMax;
                            this.moedas -= 5;
                        }
                        break;
                    case 2:
                        if(this.moedas >=5){
                            Faca f = new Faca(20,50);
                            this.setArma(f);
                            this.moedas -= 5;
                        }
                        break;
                    case 3:
                        if(this.moedas >=10){
                            Revolver r = new Revolver(100,60);
                            this.setArma(r);
                            this.moedas -= 10;
                        }
                        break;
                    case 4:
                        loop = false;
                        break;
                    default:
                        break;
            }
        
        }
    }
    public void ler(){
        InOut.MsgDeInformacao("Sobre a sua arma", this.a.nome+" pode causar até "+this.a.dano+" de dano\nCada ataque tem "+
        this.a.chance+"% de chance de acerto");
    }
    @Override
    public void desenhar(){
        boolean loop = true;
        while(loop){
            if(this.vida > 0){
                int e = InOut.leInt("OLÁ "+this.nome
                        + "\n--------------------------"
                        + "\nVIDA: "
                        + this.vida
                        + "\nARMA: "
                        + this.a.nome
                        + "\nMOEDAS: $"
                        + this.moedas
                        + "\n--------------------------"
                        + "\nESCOLHA UMA OPÇÃO:"
                        + "\n1-Batalhar"
                        + "\n2-Descansar"
                        + "\n3-Ler"
                        + "\n4-Loja");
                switch (e) {
                    case 1:
                        if(f1 == false)
                            fase1();
                        else if(f2 == false)
                            fase2();
                        else if(f3 == false )
                            fase3();
                        else{
                            InOut.MsgDeInformacao("Parabéns", "Você não tem mais batalhas");
                        }
                        break;
                    case 2:
                        this.vida = this.vidaMax;
                        break;
                    case 3:
                        ler();
                        break;
                    case 4:
                        loja();
                        break;
                    case 0:
                        loop = false;
                        break;
                    default:        
                        break;
                }
            }
            else
                loop = false;
        }
    }
    
}
