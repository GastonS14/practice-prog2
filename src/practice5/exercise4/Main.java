package practice5.exercise4;

public class Main {

    public static void main(String[] args) {

        Tax t = new Tax("Impuesto fijo", 100);
        Tax t1 = new SpecificTax("Impuesto comercial", 100, 1000, 0.50, 0.35);
        Tax t2 = new SpecificTax("Impuesto programador", 100, 1000, 0.20, 0.02);

        TaxPayer contribuyenteFijo = new TaxPayer(1, "Jorge", t);
        TaxPayer contribuyenteComercial = new TaxPayer(1, "Jorge", t1);
        TaxPayer contribuyenteProgramador = new TaxPayer(1, "Jorge", t2);

        System.out.println("El impuesto de t es: " + contribuyenteFijo.getValueTax());
        System.out.println("El impuesto de t1 es: " + contribuyenteComercial.getValueTax());
        System.out.println("El impuesto de t2 es: " + contribuyenteProgramador.getValueTax());
    }

}
