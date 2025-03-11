package org.example;

import java.util.Observable;

public class ClienteComum extends Cliente{
    public Boolean podeAlugarSuite(){
        if(this.getNumeroReservas() >= 10){
            return true;
        } else{
            return false;
        }
    }

}
