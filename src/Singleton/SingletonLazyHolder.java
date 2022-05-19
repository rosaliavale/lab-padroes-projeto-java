package Singleton;

/**
 *Singleton "lazy holder"
 * @author rosaliavale
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{

          public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
public static SingletonLazyHolder getinstancia() {

    return InstanceHolder.instancia;
}
}
