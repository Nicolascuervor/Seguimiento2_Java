package Ejercicio1;

import javax.swing.*;

public class User {
    public String inputUser;
    public String inputPass;
    public String userSystem;
    public String passSystem;
    public String Systemstatus;

    public User(String inputUser, String inputPass, String userSystem, String passSystem, String systemstatus) {
        this.inputUser = inputUser;
        this.inputPass = inputPass;
        this.userSystem = userSystem;
        this.passSystem = passSystem;
        Systemstatus = systemstatus;
    }

    public String checkStatus(){
        return Systemstatus;
    };

    public String accessValidation(){
        return  (inputUser == userSystem) ? "Authorization Access" : "Authorization delegate";
    }



}
