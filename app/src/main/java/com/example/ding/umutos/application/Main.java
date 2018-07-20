package com.example.ding.umutos.application;

public class Main {
    private static String dbName="SC";

    public static void main(String[] args){

    }

    public static String getDBPathName() {
        return dbName;
    }

    public static void setDBPathName(final String name) {
        try {
            Class.forName("org.hsqldb.jdbcDriver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        dbName = name;
    }

}
