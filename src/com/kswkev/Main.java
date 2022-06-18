package com.kswkev;

public class Main {

    public static void main(String[] args) {
//        ReadXmlDomParser.parseXML("resources/staff.xml");

        Company company = ReadXmlDomParser.parseCompanyXML("resources/staff.xml");
        System.out.println(company.toString());
    }
}
