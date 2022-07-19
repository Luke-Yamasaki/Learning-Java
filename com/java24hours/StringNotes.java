package com.java24hours;

class StringNotes {
    public static void main(String[] arguments) {
        char keyPressed;
        keyPressed = '4';
        char quitKey = '@';
        String fullName = "Fin Shepard";
        System.out.println(keyPressed);
        System.out.println(quitKey);
        System.out.println(fullName);

        System.out.print("There's ");
        System.out.print("a ");
        System.out.print("shark ");
        System.out.print("in ");
        System.out.print("your ");
        System.out.print("pool.");

        System.out.println("Anthony Ferrante directed \"Sharknado\" in 2013.");

        //Special characters
        // \' = Single quptaion mark
        // \" = Double quotation mark
        // \\ = Backlash
        // \t Tab
        // \b backspace
        // \r Carriage return
        // \f Formfeed
        // \n Newline

        System.out.println("Script by\nThunder Levin");

        System.out.println("\"\'Sharknado\' is an hour and a half of your "
            + "life that you'll never get back.\nAnd you won't want to.\"\n"
            + "\t-- David Hinckley, New York Daily News");
    }
}
