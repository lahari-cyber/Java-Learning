class anagrams {
    public static void main(String args[]) {

        String s1 = "listen";
        String s2 = "silet";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        else{
            System.out.println("anagram");
        }
    }
}