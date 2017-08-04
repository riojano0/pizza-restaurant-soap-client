package com.montivero.poc.client;

import com.montivero.poc.service.PizzaSoap;
import com.montivero.poc.service.PizzaSoapService;
import com.montivero.poc.service.PizzaType;

public class Restaurant {

    public static void main(String[] args) {
        PizzaSoap service = new PizzaSoapService().getPizzaSoapPort();

        System.out.println(service.getPizza(PizzaType.ANCHOA));
        System.out.println(service.getPizza(PizzaType.MUZZARELA));
        System.out.println(service.getPizza(PizzaType.FUGAZZETA));
    }
}
