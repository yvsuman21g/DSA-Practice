class findLength{

    public int calLength(String s){
        return s.length();
    }

    public static void main(String args[]){
        // create an Object
        findLength obj = new findLength();

        String str = "Hello World";
        System.out.println(obj.calLength(str));
    }
}