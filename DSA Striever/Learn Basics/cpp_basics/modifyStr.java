class modifyStr {

    public String modifiedNewStr(String str){
        
        String newStr = str;

        newStr+= " World";
        return newStr;
    }
    
    public static void main(String [] args){
        String original = "Hello";

        // Create an Object using the class name 
        modifyStr obj = new modifyStr();

        String updatedStr = obj.modifiedNewStr(original);

        System.out.println(original);
        System.out.print(updatedStr);

    }
}
