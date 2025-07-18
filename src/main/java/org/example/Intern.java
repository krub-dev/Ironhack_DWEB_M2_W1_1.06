package org.example;

public class Intern extends Employee {
    private final int LIMIT_SAL = 20000;

    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
        checkLimitSal(salary);
    }

    @Override
    public void setSalary(int salary){
        checkLimitSal(salary);
        super.setSalary(salary);
    }

    public void checkLimitSal (int salary){
        if (salary > LIMIT_SAL) {
            throw new IllegalArgumentException("Intern salary cannot exceed: " + LIMIT_SAL);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (Intern)";
    }
}
