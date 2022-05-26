package singleton.ejercicio.CasadeCambios;
import java.text.DecimalFormat;

public class Banco {
    DecimalFormat formato = new DecimalFormat("0.00");

    public void BolivianoABoliviano(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_boliviano", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  boliviano  ---> " + formato.format(exchange) + " boliviano.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " bolivianos ---> " + formato.format(exchange) + " bolivianos.");
        }
    }

    public void BolivianoADolar(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  boliviano  ---> " + formato.format(exchange) + " dólares.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " bolivianos ---> " + formato.format(exchange) + " dólares.");
        }
    }

    public void BolivianosAEuro(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  boliviano  ---> " + formato.format(exchange) + " euros.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " bolivianos ---> " + formato.format(exchange) + " euros.");
        }
    }

    public void DolarABoliviano(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  dolar      ---> " + formato.format(exchange) + " bolivianos.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " dólares    ---> " + formato.format(exchange) + " bolivianos.");
        }
    }

    public void DolarADolar(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("dolar_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  dolar      ---> " + formato.format(exchange) + " dolar.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " dólares    ---> " + formato.format(exchange) + " dólares.");
        }
    }

    public void DolarAEuro(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  dolar      ---> " + formato.format(exchange) + " euros.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " dólares    ---> " + formato.format(exchange) + " euros.");
        }
    }

    public void EuroABoliviano(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  euro       ---> " + formato.format(exchange) + " bolivianos.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " euros      ---> " + formato.format(exchange) + " bolivianos.");
        }
    }

    public void EuroADolar(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("boliviano_a_dolar", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  euro       ---> " + formato.format(exchange) + " dólares.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " euros      ---> " + formato.format(exchange) + " dólares.");
        }
    }

    public void EuroAEuro(double monto_a_cambiar)
    {
        double exchange = EmpresaCambioMoneda.getInstance().getExchange("euro_a_euro", monto_a_cambiar);
        if(monto_a_cambiar == 1) {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + "  euro       ---> " + formato.format(exchange) + " euro.");
        } else {
            System.out.println("B  ---> " + formato.format(monto_a_cambiar) + " euros      ---> " + formato.format(exchange) + " euros.");
        }
    }
}