package Ejercicio6;

public class Send {
    public int numguide;
    private String date;
    private String typepackaging;
    public int idCustomer;
    private int weigth;
    private String CityOrigin;
    private String DestinetionCity;
    private int cost;
    private String StatusSend;


    public Send(int numguide, String date, String typepackaging, int idCustomer, int weigth, String cityOrigin, String destinetionCity, int cost, String statusSend) {
        this.numguide = numguide;
        this.date = date;
        this.typepackaging = typepackaging;
        this.idCustomer = idCustomer;
        this.weigth = weigth;
        this.CityOrigin = cityOrigin;
        this.DestinetionCity = destinetionCity;
        this.cost = cost;
        this.StatusSend = statusSend;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTypepackaging() {
        return typepackaging;
    }
    public void setTypepackaging(String typepackaging) {
        this.typepackaging = typepackaging;
    }
    public String getCityOrigin() {
        return CityOrigin;
    }
    public void setCityOrigin(String cityOrigin) {
        CityOrigin = cityOrigin;
    }
    public int getWeigth() {
        return weigth;
    }
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
    public String getDestinetionCity() {return DestinetionCity;}
    public void setDestinetionCity(String destinetionCity) {
        DestinetionCity = destinetionCity;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getStatusSend() {
        return StatusSend;
    }
    public void setStatusSend(String statusSend) {
        StatusSend = statusSend;
    }


    public void calculateCost(){
        switch (getWeigth()){
            case 300:
        }
        if (getWeigth() >= 300) System.out.println("The total cost for your send is: " + getCost() * getWeigth() + " dollars");
        else if (getWeigth() <= 200) {
            System.out.println("The total cost for your send is: " + getCost() * getWeigth() + " dollars");
        }
        else if (getWeigth() <= 100) {
            System.out.println("The total cost for your send is: " + getCost() * getWeigth() + " dollars");
        }
        else if (getWeigth() <= 50) {
            System.out.println("The total cost for your send is: " + getCost() * getWeigth() + " dollars");
        }
        else{
            System.out.println("The total cost for your send is: " + getCost() + " dollars");
        }
    }

    public void checksend(){
        System.out.println(getStatusSend());
    }
}
