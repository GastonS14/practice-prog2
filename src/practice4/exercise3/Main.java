package practice4.exercise3;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee(15);
        EmployeeOvertime e2 = new EmployeeOvertime(10);
        EmployeeCommissioned e3 = new EmployeeCommissioned(50);

        e2.setHoursWorked(100);
        e2.setAmountPerHourWorked(10);
        e3.setCommissionPercentage(0.15);
        e3.setSale(1000);

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e3.getSalary());
    }

}


/*
Empleado

-+sueldo
+calcular sueldo

EmpleadoHorsExtras extends Empleado
+calcular sueldo(redefinido)

EmpleadoComision extends Empleado
+calcular sueldo(redefinido)

DO WITH INTERFACE

interface con calcular sueldos con sueldo fijo, sueldo por comision, sueldo horas extras
    reutilizable -> no queda pegado al empleado
 */