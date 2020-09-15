package practice5.exercise1;

public class Main {

    public static void main(String[] args) {

        Pile p = new Pile();
        p.push("1");
        p.push("2");
        p.push("3");
        p.push("5");
        p.push("4");

        System.out.println("La estructura de p es: " + p.copy());
        System.out.println("El tope de p es: " + p.top());
        System.out.println("El tamaño de p es: " + p.size());

        p.pop();
        System.out.println("La estructura de p es: " + p.copy());

        System.out.println("El tope es: " + p.top());
        System.out.println("El tamaño es: " + p.size());

        var p1 = p.copy();
        System.out.println("La estructura copiada es: " + p1);

        System.out.println("La estructura reversa de p es: " + p.reverse());
        System.out.println("La estructura sin modificar de p es: " + p.copy());
    }

}
