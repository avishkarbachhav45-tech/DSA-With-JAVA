public class AccessModifiers {
    public static void main(String[] args) {
        BankAcc myAcc = new BankAcc();
        myAcc.username = "Avishkar45";
        myAcc.setPassword("HITman45");
        System.out.println("Usrname : " + myAcc.username + " Password :" + myAcc.getPassword());
    }
}

class BankAcc{

    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

    public String getPassword() {
    return this.password;
}


    
}
