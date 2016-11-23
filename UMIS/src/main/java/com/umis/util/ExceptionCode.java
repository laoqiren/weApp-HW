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
     * Users Exception Code 10100 - 10199
     */
    public static Integer User_Not_Found = 10100;
    public static Integer Username_Not_Exists = 10101;
    public static Integer Wrong_Password = 10102;

    /**
     * UsersAll Exception Code 10200 - 10299
     */
    public static Integer UsersAll_Not_Found = 10200;
    public static Integer Usersphone_Not_Exists = 10201;
    
    /**
     * UsersAll Exception Code 10300 - 10399
     */
    public static Integer ExtraObtain_Not_Found = 10300;
    public static Integer UsersNumber_Not_Exists = 10301;
   

}

