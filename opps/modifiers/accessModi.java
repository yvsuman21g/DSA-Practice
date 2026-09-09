/*
 Packages - Built-in and User defined
 Access Modifiers - 4 types - 
 - public 
 - default 
 - protected 
 - private

*/ 
class Account {
    public String name;
    protected String email;
    private String password;

    // we can access privte using getter and setter method -
    public String getPassword(){
        return this.password;
    }

    // set 
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class accessModi {
    public static void main(String args[]){
        Account account1 = new Account();

        account1.name = "@BlurredSummy";
        account1.email = "yvsuman21g@gmail.com";
        account1.setPassword("abcdef");
        System.out.println(account1.getPassword());

    }
}
