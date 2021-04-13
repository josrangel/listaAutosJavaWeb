package control;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named("carro")
@ApplicationScoped
public class Carros {
    
    private final SelectItem[] valores ={
        new SelectItem(Carro.FERRARI,"Ferrari"),
        new SelectItem(Carro.ASTONMARTIN,"Aston Martin"),
        new SelectItem(Carro.JETTA,"Jetta"),
        new SelectItem(Carro.LINCOLN,"Lincoln"),
        new SelectItem(Carro.SENTRA,"Sentra"),
        new SelectItem(Carro.SONIC,"Sonic"),
        new SelectItem(Carro.VOCHO,"Vocho")};
    
    public SelectItem[] getValores(){
        return valores;
    }
}
