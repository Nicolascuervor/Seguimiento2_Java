package Ejercicio7;

public class Complaint {
    public int numComplaint ;
    private String namePerson;
    private String affair;
    public String descriptionComplaint;
    private String statusComplaint;

    public String validateClaimStatus(){
        return getStatusComplaint();
    }

    public void messageReceptionComplaint(){
        System.out.println("We decided to denegate your complaint");
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getStatusComplaint() {
        return statusComplaint;
    }

    public void setStatusComplaint(String statusComplaint) {
        this.statusComplaint = statusComplaint;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}
