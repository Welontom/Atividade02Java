/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagens;

import armas.*;
import trabalho02.*;

/**
 *
 * @author Wel
 */
public class Personagem {
    public int vida;
    public int vidaMax;
    public String nome;
    public Arma a;
    boolean jogador;
    public int moedas = 0;
    boolean f1 = false,f2 = false,f3 = false;
   
    public Personagem(boolean jogador){
        this.jogador = jogador;
        if(jogador == true){
            this.nome = InOut.leString("Bem vindo, como devo te chamar?");
        }else{
            
        }
    }
    
    public void atacar(){
        
    }
    public void setArma(Arma a){
        this.a = a;
    }
    public void setVidas(int i){
        this.vida = i;
    }
    public void setNome(String s){
        this.nome = s;
    }
    
    public void fase1(){
        Mago e1 = new Mago(false);
        Magia m = new Magia(10,30);
        e1.setVidas(40);
        e1.setArma(m);
        e1.setNome("Mago Everaldo");
        if(batalha(e1)){
            f1 = true;
            InOut.MsgDeInformacao("Parabéns", "Você passou de fase e recebeu 10 moedas");
            this.moedas += 10;
        }
    }
    public void fase2(){
        Soldado e1 = new Soldado(false);
        Revolver m = new Revolver(20,50);
        e1.setVidas(50);
        e1.setArma(m);
        e1.setNome("Soldado Pablo");
        if (batalha(e1)){
            f2 =true;
            InOut.MsgDeInformacao("Parabéns", "Você passou de fase e recebeu 10 moedas");
            this.moedas += 10;
        }
        
    }
    public void fase3(){
        Dragao e1 = new Dragao(false);
        Magia m = new Magia(100,10);
        e1.setVidas(666);
        e1.setArma(m);
        e1.setNome("Dragão Devorador");
        
        if(batalha(e1)){
            f3 = true;
            InOut.MsgDeInformacao("Parabéns", "Você Derrotou o dragão");
        }
    }
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
    
    public boolean batalha(Personagem p){
        boolean loop = true;
        while(loop){
            if(this.vida <=0){
                    derrota();
                    return false;

             }
            else if(p.vida <= 0){
                return true;
            }
            
            int e = InOut.leInt("INIMIGO: "+p.nome+"\nVIDA: "+p.vida+"\n-----------------------------------"
                    + "\nSUA VIDA: "
                    + this.vida
                    + "\n-----------------------------------"
                    + "\nESCOLHA UMA OPÇÃO:"
                    + "\n1-Atacar"
                    + "\n2-Fugir");
            if(e == 1){
                this.a.usarArma(p,this);
                p.a.usarArma(this,p);

            }
            if(e == 2){
                desenhar();
            }
        }
        return false;
    
    }
    public void ler(){
        InOut.MsgDeInformacao("Sobre a sua arma", this.a.nome+" pode causar até "+this.a.dano+" de dano\nCada ataque tem "+
        this.a.chance+"% de chance de acerto");
    
    }
    public void derrota(){
        InOut.MsgDeInformacao("FIM DE JOGO","VOCÊ MORREU");
    
    }
    public void loja(){
        boolean loop = true;
            while(loop){
                int e = InOut.leInt("ARMA ATUAL: "+this.nome+"\nSUA VIDA: "+this.vida
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
    

}
