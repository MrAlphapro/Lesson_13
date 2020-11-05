package tj.olimhon;

public class Subscriber {
    private int idnumber;
    private String lastname;
    private String name;
    private String patronymic;
    private String address;
    private double vremya;


    public Subscriber (int idnumber,String lastname, String name, String patronymic,String address, double vremya){
        this.idnumber = idnumber;
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.vremya = vremya;

    };
    public int getIdnumber(){
        return this.idnumber;
    }
    public String getLastname() {
        return this.lastname;

    }
    public String getName(){
        return this.name;
    }
    public String getPatronymic(){
        return this.patronymic;
    }
    public String getAddress(){
        return this.address;
    }
    public double getNumbercart(){
        return this.vremya;
    }


    public void setIdnumber (int idnumber){
        this.idnumber = idnumber;
    }
    public void setLastname (String lastname){
        this.lastname = lastname;
    }
    public void setName (String name){
        this.name = name;

    }
    public void setPatronymic (String patronymic){
        this.patronymic = patronymic;

    }
    public void setAddress (String address){
        this.address = address;

    }
    public void setNumbercart (double vremya){
        this.vremya = vremya;
    }

}
