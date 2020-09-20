package practice5.exercise5;

public class Main {

    public static void main(String[] args) {

        FixedSalary fixedSalary = new FixedSalary(100);
        CommissionSalary commissionSalary = new CommissionSalary(fixedSalary, 0.50, 2000);
        SaleCountSalary salaryWithReward = new SaleCountSalary(fixedSalary, 30, 40, 5000);
        SaleCountSalary salaryWithoutReward = new SaleCountSalary(fixedSalary, 60, 40, 5000);

        Employee e = new Employee("Augusto", "Fernandez", 1, fixedSalary);
        Employee e1 = new Employee("Jorge", "Rodriguez", 2, commissionSalary);
        Employee e2 = new Employee("Maria", "Silvera", 3, salaryWithReward);
        Employee e3 = new Employee("Agustina", "Corbo", 4, salaryWithoutReward);

        // Should be 100
        System.out.println("El empleado: " + e.getName() + e.getSurname() + " tiene un sueldo de: " + e.getAmountSalary());
        // Should be 1100
        System.out.println("El empleado: " + e1.getName() + e1.getSurname() + " tiene un sueldo de: " + e1.getAmountSalary());
        // Should be 5100
        System.out.println("El empleado: " + e2.getName() + e2.getSurname() + " tiene un sueldo de: " + e2.getAmountSalary());
        // Should be 100
        System.out.println("El empleado: " + e3.getName() + e3.getSurname() + " tiene un sueldo de: " + e3.getAmountSalary());
    }

}
