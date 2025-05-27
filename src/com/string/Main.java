package com.string;

public class Main {
    public static void main(String[] args) {

        String firstname = "Nguyen";
        String middlename = "Van Van";
        String lastname = "Tay Thi";

        String joinStr = firstname + " " + middlename + " " + lastname;
        System.out.println(joinStr);
        String replace = joinStr.replace("Van", "Thi");
        System.out.println(replace);

        StringBuffer buffer = new StringBuffer();
        buffer.append(firstname)
                .append(" ")
                .append(middlename)
                .append(" ")
                .append(lastname);
        System.out.println(buffer.toString());

        StringBuilder builder = new StringBuilder();
        builder.append(firstname)
                .append(" ")
                .append(middlename)
                .append(" ")
                .append(lastname);
        String builderSrt = builder.toString();
        System.out.println(builderSrt);

    }
}
