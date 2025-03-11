package org.example;

import java.util.Observable;

public class ClientePremium extends Cliente{
    public Boolean podeAlugarSuite(){
        if(this.getNumeroReservas() >= 5){
            return true;
        } else{
            return false;
        }
    }


}
