package prototype.noUsingPrototype;

public class Client {

    public static void main (String []args){
        Persona jose= new Persona();
        jose.setAttribute1("jose att1 ZONA");
        jose.setAttribute2("jose att2 TS");
        jose.setAttribute3("jose att3 U");
        jose.setAttribute4("jose att4");
        jose.setAttribute5(5);
        System.out.println("JOSE > "+jose.getAttribute1());
        System.out.println("JOSE > "+jose.getAttribute2());
        System.out.println("JOSE > "+jose.getAttribute3());
        System.out.println("JOSE > "+jose.getAttribute4());
        System.out.println("JOSE > "+jose.getAttribute5());

        Persona juan = new Persona();
        juan=jose;

        System.out.println("JUAN > "+juan.getAttribute1());
        System.out.println("JUAN > "+juan.getAttribute2());
        System.out.println("JUAN > "+juan.getAttribute3());
        System.out.println("JUAN > "+juan.getAttribute4());
        System.out.println("JUAN > "+juan.getAttribute5());

        juan.setAttribute5(6);
        juan.setAttribute1("YO JUAN .....");

        System.out.println("JUAN > ATTR5 = 6 : "+juan.getAttribute5());
        System.out.println("JOSE > ATTR5 = 5 : "+jose.getAttribute5());
        System.out.println("JOSE > ATTR1 : "+jose.getAttribute1());
    }
}
