package tj.olimhon;

public class Customer {
    private String lastname;
    private String name;
    private String patronymic;
    private String address;
    private long numbercart;
    private int idnumber;

    public Customer (String lastname, String name, String patronymic,String address, long numbercart, int idnumber){
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numbercart = numbercart;
        this.idnumber = idnumber;
    };

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
    public long getNumbercart(){
        return this.numbercart;
    }
    public int getIdnumber(){
        return this.idnumber;
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
    public void setNumbercart (long numbercart){
        this.numbercart = numbercart;
    }
    public void setIdnumber (int idnumber){
        this.idnumber = idnumber;
    }



}
