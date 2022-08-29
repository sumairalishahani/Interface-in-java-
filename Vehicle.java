import java.util.Scanner;
 interface Vehicle {
     public void accelerate(int sph);
     public void decelerate(int Cspeed);
     String color = "Red";
     int engineNo = 9876;
     
}

class Car implements Vehicle{
     void setData(){
         System.out.println("the color of Car is "+color);
         System.out.println("the engine number is "+engineNo);
     }

    @Override
    public void accelerate(int sph) {
        System.out.println("the speed of Car perhour is "+sph);

    }

    @Override
    public void decelerate(int Cspeed) {
        System.out.println("the speed of  current car is "+Cspeed);

    }

}class Bus implements Vehicle{

    void setData(){
        System.out.println("the color of Bus is "+color);
        System.out.println("the engine Bus is "+engineNo);
    }
    @Override
    public void accelerate(int sph) {
        System.out.println("the speed of bus per hour is "+sph);
    }

    @Override
    public void decelerate(int Cspeed) {
        System.out.println("the current speed of bus is "+Cspeed);

    }
}
class Truck implements Vehicle{
    void setData(){
        System.out.println("the color of Truck is "+color);
        System.out.println("the engine number of Truck is "+engineNo);
    }

    @Override
    public void accelerate(int sph) {
        System.out.println("the speed of bus per hour is "+sph);
    }

    @Override
    public void decelerate(int Cspeed) {
        System.out.println("the current speed of bus is "+Cspeed);
    }
}
class test{
    public static void main(String[] args) {

          Car c=new Car();
          Bus b=new Bus();
          Truck t=new Truck();

        Scanner sc=new Scanner(System.in);
        System.out.println (" the speed per hour");
        int sph=sc.nextInt();
        System.out.println(" Enter current speed is  ");
        int Cspeed=sc.nextInt();
        c.accelerate((sph));
        c.decelerate((Cspeed));
        b.accelerate(sph);
        b.decelerate(Cspeed);
        t.accelerate(sph);
        t.decelerate(Cspeed);
        c.setData();
        b.setData();
        t.setData();




    }
}
