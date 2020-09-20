package practice6.exercise1;

public class Main {

    public static void main(String[] args) {

        Business empresa = new Business(1);
        Business empresa2 = new Business(2);

        Aspirant aspirante = new Aspirant("Jorge", empresa, 200, 20);
        Aspirant aspirante1 = new Aspirant("Daniel", null, 240, 8);
        Aspirant aspirante2 = new Aspirant("Valeria", empresa2, 2000, 14);
        Aspirant aspirante3 = new Aspirant("Josefina", empresa, 12, 10);

        empresa.addAspirant(aspirante);
        empresa.addAspirant(aspirante1);
        empresa.addAspirant(aspirante2);
        empresa.addAspirant(aspirante3);

        empresa2.addAspirant(aspirante);
        empresa2.addAspirant(aspirante1);
        empresa2.addAspirant(aspirante2);

        ExclusiveContract contratoExcluyente = new ExclusiveContract(25, 50000, empresa);
        HourContract contratoHora = new HourContract(13, 50000, empresa);
        BusinessContract contratoUnicaEmpresa = new BusinessContract(25, 50000, empresa);
        BusinessContract contratoUnicaEmpresa2 = new BusinessContract(25, 50000, empresa2);
        AmountContract contratoMejorPago = new AmountContract(25, 238, empresa);

        empresa.setContract(contratoExcluyente);
        System.out.println("Los aspirantes sin empresa aptos son: " + empresa.getAspirants());

        empresa.setContract(contratoHora);
        System.out.println("Los aspirantes con aceptacion de hora aptos son: " + empresa.getAspirants());

        empresa.setContract(contratoUnicaEmpresa);
        System.out.println("Los aspirantes con aceptacion que no son de la misma empresa son: " + empresa.getAspirants());

        empresa2.setContract(contratoUnicaEmpresa2);
        System.out.println("Los aspirantes con aceptacion que no son de la misma empresa son: " + empresa2.getAspirants());

        empresa.setContract(contratoMejorPago);
        System.out.println("Los aspirantes con sueldo menor al contrato son: " + empresa.getAspirants());

    }

}
