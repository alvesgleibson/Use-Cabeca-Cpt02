package br.com.ondanetpe.andooo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gleibson Alves on 30/11/2017.
 */

public class BeerExpert {

   List<String> getTextoExibir(String listaCeva){
    List<String> TextoExi = new ArrayList<String>();

    if(listaCeva.equals("Ambev")){
        TextoExi.add("stella artois");
        TextoExi.add("heineken");
        TextoExi.add("budweiser");
        TextoExi.add("Siriiii");
    }else if(listaCeva.equals("Itaipava")){
        TextoExi.add("Vem verao");
        TextoExi.add("Vai e vem");
        TextoExi.add("A Gostosa");
        TextoExi.add("Nossa Assim Vc me mata");
    }else{
        TextoExi.add("Outras Marcas(Skol,Skim,Proibida)");

    }
    return TextoExi;


    }



}
