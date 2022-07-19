package com.java24hours;

class Favorite {
    public static void main(String[] arguments) {
        String favorite = "pool cue";
        String guess = "chainsaw";
        System.out.println(favorite.equals(guess));
        favorite = "chainsaw";
        System.out.println(favorite.equals(guess));
    }
}
