package one.digitalinnovation.gof;

import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;
import one.digitalinnovation.gof.Facade.Facade;

public class Teste {
    public static void main (String[] args) {
        // Singleton
SingletonLazy lazy = SingletonLazy.getInstancia();
System.out.println(lazy);
lazy = SingletonLazy.getInstancia();
System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getinstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getinstancia();
        System.out.println(lazyholder);

        //Strategy
Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

                Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

            //Facade

            Facade facade = new Facade();
            facade.migrarCliente ("Rosália","13080490");

    }
}
