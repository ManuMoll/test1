package singleton.ejercicio.CasadeCambios;

public class Cliente {
    public static void main(String[] args) {
        Banco b = new Banco();
        CasaDeCambio cc = new CasaDeCambio();
        LibreCambista lc = new LibreCambista();

        b.BolivianoADolar(1);
        b.EuroABoliviano(15);
        b.DolarAEuro(20);
        cc.DolarADolar(5);
        cc.EuroADolar(25.3);
        cc.DolarABoliviano(15.50);
        lc.BolivianoABoliviano(13);
        lc.BolivianosAEuro(14);
        lc.EuroAEuro(155);
    }
}