package com.Eaddwadge9;

public class empwage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private String company;
    private int empRatePerHr;
    private int numOfWorkingDays;
    private int maxHoursPerMonth;
    private int totalEmpWage;

    public empwage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public empwage() {

    }


    public static <Eaddwage9> void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation Program !!");
        empwage kMart = new empwage("K'mart", 20, 20, 100);
        empwage bridgelabz = new empwage("Bridgelabz", 10, 20, 110);
        empwage JIO = new empwage("JIO", 15, 20, 80);
        kMart.toString();
        System.out.println(kMart);
        bridgelabz.toString();
        System.out.println(bridgelabz);
        JIO.toString();
        System.out.println(JIO);
    }

    public void EmpWageComp(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs < maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day-:" + totalWorkingDays + " Employee Hr:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
    }

    public String toString() {
        return ("Total employee  Wage for the " + company + " is: " + totalEmpWage);
    }
}