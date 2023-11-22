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
    public int moedas = 5;
    boolean f1 = false,f2 = false,f3 = false;
   
    public Personagem(boolean jogador){
        this.jogador = jogador;
        if(jogador == true){
            this.nome = InOut.leString("Bem vindo, como devo te chamar?");
        }else{
            
        }
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
        Magia m = new Magia(10,50);
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
        Revolver m = new Revolver(20,60);
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
    public void derrota(){
        InOut.MsgDeInformacao("FIM DE JOGO","VOCÊ MORREU");
    
    }
    

}
