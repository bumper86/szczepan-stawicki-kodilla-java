package com.kodilla.hibarnate.manytomany.facade;

public class SearchException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "Not found matching employees";
    public static String ERR_COMPANY_NOT_FOUND = "Not found matching company";

    public SearchException(String message) {
        super(message);
    }
}
