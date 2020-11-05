package tj.olimhon;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Қодиров","Олимхон","Ҷурахонович","Ноҳияи Темурмалик",5058270110979894l,1);
        System.out.println(customer.getLastname());
        System.out.println(customer.getName());
        System.out.println(customer.getPatronymic());
        System.out.println(customer.getAddress());
        System.out.println(customer.getNumbercart());
        System.out.println(customer.getIdnumber());



        customer.setLastname("Nuridinov");
        customer.setName("Islom");
        customer.setPatronymic("Namedonam");
        customer.setAddress("Ноҳияи Шоҳмансур кучаи Исмоили Сомони хонаи 22");
        customer.setNumbercart(4451693128007200l);
        customer.setIdnumber(2);
        System.out.println(customer.getLastname());
        System.out.println(customer.getName());
        System.out.println(customer.getPatronymic());
        System.out.println(customer.getAddress());
        System.out.println(customer.getNumbercart());
        System.out.println(customer.getIdnumber());


        Subscriber subscriber = new Subscriber(1,"Боронов","Ҷола","Барфович","Ноҳияи Темурмалик",11.11);
        System.out.println(subscriber.getIdnumber());
        System.out.println(subscriber.getLastname());
        System.out.println(subscriber.getName());
        System.out.println(subscriber.getPatronymic());
        System.out.println(subscriber.getAddress());
        System.out.println(subscriber.getNumbercart());

        subscriber.setIdnumber(2);
        subscriber.setLastname("Nuridinov");
        subscriber.setName("Islom");
        subscriber.setPatronymic("Namedonam");
        subscriber.setAddress("Ноҳияи Шоҳмансур кучаи Исмоили Сомони хонаи 22");
        subscriber.setNumbercart(12.12);

        System.out.println(subscriber.getIdnumber());
        System.out.println(subscriber.getLastname());
        System.out.println(subscriber.getName());
        System.out.println(subscriber.getPatronymic());
        System.out.println(subscriber.getAddress());
        System.out.println(subscriber.getNumbercart());


    }
}
