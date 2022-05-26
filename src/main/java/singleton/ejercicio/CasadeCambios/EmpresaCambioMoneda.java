package singleton.ejercicio.CasadeCambios;

public class EmpresaCambioMoneda {
    private static EmpresaCambioMoneda instance = null;
    private double boliviano_a_boliviano;
    private double boliviano_a_dolar;
    private double boliviano_a_euro;
    private double dolar_a_boliviano;
    private double dolar_a_dolar;
    private double dolar_a_euro;
    private double euro_a_boliviano;
    private double euro_a_dolar;
    private double euro_a_euro;


    private EmpresaCambioMoneda()
    {
        boliviano_a_boliviano = 1;         // 1 Boliviano euqivale a 1 Boliviano
        boliviano_a_dolar = 0.15;          // 1 Boliviano equivale a 0.15 Dólares
        boliviano_a_euro = 0.12;           // 1 Boliviano equivale a 0.12 Euros
        dolar_a_boliviano = 6.89;          // 1 Dolar equivale a 6.89 Bolivianos
        dolar_a_dolar = 1;                 // 1 Dolar equivale a 1 Dolar
        dolar_a_euro = 0.82;               // 1 Dolar equivale a 0.82 Euros
        euro_a_boliviano = 8.42;           // 1 Euro equivale a 8.42 Boliviano
        euro_a_dolar = 1.22;               // 1 Euro equivale a 1.22 Dólares
        euro_a_euro = 1;                     // 1 Euro euqivale a 1 Euro
        System.out.println("***** INFO --> Iniciando Entidad de Cambio de Moneda: *****");
    }

    public static synchronized void makeInstance()
    {
        if (instance == null)
            instance= new EmpresaCambioMoneda();
    }

    public static EmpresaCambioMoneda getInstance()
    {
        if (instance == null)
            makeInstance();
        return instance;
    }

    public synchronized double getExchange(String cambio_a_efectuar, double monto_a_cambiar)
    {
        if (cambio_a_efectuar.equals("boliviano_a_boliviano"))
        {
            return boliviano_a_boliviano * monto_a_cambiar;             // Si se desea cambiar de Bolivianos a Bolivianos
        }
        else if (cambio_a_efectuar.equals("boliviano_a_dolar"))
        {
            return boliviano_a_dolar * monto_a_cambiar;                 // Si se desea cambiar de Bolivianos a Dólares
        }
        else if (cambio_a_efectuar.equals("boliviano_a_euro"))
        {
            return boliviano_a_euro * monto_a_cambiar;                  // Si se desea cambiar de Bolivianos a Euros
        }
        else if (cambio_a_efectuar.equals("dolar_a_boliviano"))
        {
            return dolar_a_boliviano * monto_a_cambiar;                 // Si se desea cambiar de Dólares a Bolivianos
        }
        else if (cambio_a_efectuar.equals("dolar_a_dolar"))
        {
            return dolar_a_dolar * monto_a_cambiar;                     // Si se desea cambiar de Dólares a Dólares
        }
        else if (cambio_a_efectuar.equals("dolar_a_euro"))
        {
            return dolar_a_euro * monto_a_cambiar;                      // Si se desea cambiar de Dólares a Euros
        }
        else if (cambio_a_efectuar.equals("euro_a_boliviano"))
        {
            return euro_a_boliviano * monto_a_cambiar;                  // Si se desea cambiar de Euros a Bolivianos
        }
        else if (cambio_a_efectuar.equals("euro_a_dolar"))
        {
            return euro_a_dolar * monto_a_cambiar;                      // Si se desea cambiar de Euros a Dólares
        }
        else if (cambio_a_efectuar.equals("euro_a_euro"))
        {
            return euro_a_euro * monto_a_cambiar;                      // Si se desea cambiar de Euros a Euros
        }
        else{
            return 0;
        }
    }
}