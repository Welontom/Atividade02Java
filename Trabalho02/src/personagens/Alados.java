/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagens;

import trabalho02.InOut;

/**
 *
 * @author Wel
 */
public class Alados extends Personagem{
    
    public Alados(boolean jogador) {
        super(jogador);
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
                        + "\n--------------------------"
                        + "\nESCOLHA UMA OPÇÃO:"
                        + "\n1-Batalhar"
                        + "\n2-Descansar"
                        + "\n3-Voar");
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
                        voar();
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
    public void voar(){
        InOut.MsgDeAviso("Voo", "Você está voando");
    }
    
    
}
