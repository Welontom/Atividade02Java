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
public class Mago extends Terrestres{
    
    public Mago(boolean jogador) {
        super(jogador);
        this.vidaMax = 100;
        setVidas(this.vidaMax);
        Magia m = new Magia(10,50);
        setArma(m);
    }
    @Override
    public void loja(){
        boolean loop = true;
            while(loop){
                int e = InOut.leInt("ARMA ATUAL: "+this.a.nome+"\nSUA VIDA: "+this.vida
                    + "\nMOEDAS: $"
                    + this.moedas
                    + "\n-----------------------------------"
                    + "\nESCOLHA UMA OPÇÃO:"
                    + "\n1-Aumentar Vida Máxima ($5)"
                    + "\n2-Melhorar Dano ($5)"
                    + "\n3-Melhorar mira($5)"
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
                            this.a.dano += 10;
                            this.moedas -= 5;
                        }
                        break;
                    case 3:
                        if(this.moedas >=5){
                            this.a.chance += 10;
                            this.moedas -= 5;
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
}
