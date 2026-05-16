/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadecelular;
/**
 *
 * @author cliente
 */
public class FunçõesCelular {
    public String ligar(Celular celular){
        if (celular.getBateria() > 0){
            return ("Celular ligado");
        }
        else{
            return ("Celular descarregado");
        }
    }
    
   public String mostrarBateria(Celular celular){
        return ("Bateria em "+celular.getBateria()+"%");
    }
}
