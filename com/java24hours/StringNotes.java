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

        int length = 86;
        char rating = 'R';
        System.out.println("Running time: " + length + " minutes");
        System.out.println("Rated " + rating);

        String searchKeywords = "";
        searchKeywords = searchKeywords + "shark ";
        searchKeywords = searchKeywords + "hurricane ";
        searchKeywords = searchKeywords + "danger";
        System.out.println(searchKeywords);

        String favorite = "chainsaw";
        String guess = "pool cue";
        System.out.println("Is Fin's favorite weapon a " + guess + "?");
        System.out.println("Answer: " + favorite.equals(guess));

        String cinematographer = "Ben Demaree";
        int nameLength = cinematographer.length();
        System.out.println(nameLength);

        String fin = "Ian Ziering";
        String change = fin.toUpperCase();
        String changeAgain = fin.toLowerCase();
        System.out.println(change);
        System.out.println(changeAgain);

        


    }
}
