package trabalho02;
import personagens.*;
import armas.*;

/**
 *
 * @author Wel
 */
public class Trabalho02 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        boolean loop = true;
        while(loop){
            int e = InOut.leInt("Escolha seu personagem:\n1-Soldado\n2-Mago");
            
            switch(e){
                case 1:
                    Soldado soldado = new Soldado(true);
                    soldado.desenhar();
                    loop = false;
                    break;
                case 2:
                    Mago mago = new Mago(true);
                    mago.desenhar();
                    loop = false;
                    break;
                case 666:
                    Dragao dragao = new Dragao(true);
                    dragao.desenhar();
                    loop = false;
                    break;
                default:

            }
            if(loop == false)
                break;
        }
    }

    
}
