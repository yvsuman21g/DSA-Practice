
class accessChar {

    public void accessIndividualChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        accessChar obj = new accessChar();

        String str = "Hello";
        obj.accessIndividualChar(str);
    }
}
