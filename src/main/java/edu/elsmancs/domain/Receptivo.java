package edu.elsmancs.domain;

import java.util.ArrayList;
import java.util.List;
        /**
        * La clase receptivo sirve como un metodo global para registrar y despachar todos los productos en un pack
        *
        * Aprovechamos la implementación de la interfaz guestDispatcher para generalizar todos los metodos dispatch y
        * que puedan ser usados en un mismo metodo.
        *
        * @author Samu Ferragut
        */
public class Receptivo {

    List<GuestDispatcher> dispatches = new ArrayList<>();

    public Receptivo(){
    };
    /**
    * Metodo para añadir en la lista de metodos dispatch, uno nuevo.
    * @param pack Nuevo elemento que queremos añadir a dispatches
    */
    public void registra(GuestDispatcher pack) {
        this.dispatches.add(pack);
    }
    /**
    * Por cada uno de los dispatches guardados en la List, se aplicara al user dado
    *  @param user el objeto CreditCard que le pasamos que usamos como identificativo para cada usuario
    */
    public void dispatch(CreditCard user) {
        dispatches.forEach( type -> type.dispatch(user)) ;
    }
}
