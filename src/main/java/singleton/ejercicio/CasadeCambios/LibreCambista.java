package singleton.ejercicio.CasadeCambios;

import java.text.DecimalFormat;

public class LibreCambista {
    DecimalFormat formato = new DecimalFormat("0.00");

    public void BolivianoABoliviano(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_boliviano", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  boliviano  ---> " + formato.format(exchange) + " boliviano.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " bolivianos ---> " + formato.format(exchange) + " bolivianos.");
        }
    }

    public double BolivianoADolar(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  boliviano  ---> "+ formato.format(exchange) + " dólares.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " bolivianos ---> "+ formato.format(exchange) + " dólares.");
        }
        return exchange;
    }

    public double BolivianosAEuro(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  boliviano  ---> "+ formato.format(exchange) + " euros.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " bolivianos ---> "+ formato.format(exchange) + " euros.");
        }
        return exchange;
    }

    public double DolarABoliviano(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  dolar      ---> "+ formato.format(exchange) + " bolivianos.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " dólares    ---> "+ formato.format(exchange) + " bolivianos.");
        }
        return exchange;
    }

    public void DolarADolar(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("dolar_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  dolar      ---> " + formato.format(exchange) + " dolar.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " dólares    ---> " + formato.format(exchange) + " dólares.");
        }
    }

    public double DolarAEuro(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  dolar      ---> "+ formato.format(exchange) + " euros.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " dólares      ---> "+ formato.format(exchange) + " euros.");
        }
        return exchange;
    }

    public double EuroABoliviano(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  euro       ---> "+ formato.format(exchange) + " bolivianos.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " euros      ---> "+ formato.format(exchange) + " bolivianos.");
        }
        return exchange;
    }

    public double EuroADolar(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  euro       ---> "+ formato.format(exchange) + " dólares.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " euros      ---> "+ formato.format(exchange) + " dólares.");
        }
        return exchange;
    }

    public void EuroAEuro(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("euro_a_euro", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + "  euro       ---> " + formato.format(exchange) + " euro.");
        } else {
            System.out.println("LC ---> " + formato.format(monto_a_cambiar) + " euros      ---> " + formato.format(exchange) + " euros.");
        }
    }
}

