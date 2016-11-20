package com.umis.util;

public class ExceptionCode {
    public static Integer Success = 0;

    /**
     * System Exception Code 10000 - 10099
     */
    public static Integer Permission_Denied = 10000;
    public static Integer Invalid_Input = 10001;
    public static Integer Invalid_Token = 10002;

    /**
     * User Exception Code 10100 - 10199
     */
    public static Integer User_Not_Found = 10100;
    public static Integer Username_Not_Exists = 10101;
    public static Integer Wrong_Password = 10102;

    /**
     * Product Exception Code 10200 - 10299
     */
    public static Integer Product_Not_Found = 10200;
    public static Integer Inventory_Not_Enough = 10201;

    /**
     * Supplier Exception Code 10300 - 10399
     */

    public static Integer Supplier_Not_Found = 10300;

    /**
     * Customer Exception Code 10400 - 10499
     */

    public static Integer Customer_Not_Found = 10400;

}

