package Interface.Interfaces;

public interface StandartMethod {

    void run();
    void Break();
    void makeCurves(int position);
    void carryPassengers(int quantityPassengers);

    //Esse método padrão pode ser implementado ou não por uma classe.
    default String readSituation(){
        String msg = "Valid Situation";
        return msg;
    }

    //Um método estática em uma interface também pode ser opcionalmente implementado.
    static String readMsg(){
        String msg = "Static Method Interface";
        return msg;
    }
}
