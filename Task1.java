import java.util.*;

interface Vehicle{
   int getwheels();
   void setwheels(int x);
   int getpassengers();
   void setpassengers(int x);
   String getmodelname();
   void setmodelname(String name);
   void drive();
   void stop();

}
class Car implements Vehicle{
    private int Wheels, passengers;
    private String modelname;

    Car(){}
    Car(int Wheels,int passengers,String modelname){
        this.Wheels=Wheels;
        this.passengers=passengers;
        this.modelname=modelname;
    }

  
   public void setwheels(int x){
         Wheels=x;
   }  
   public int getwheels(){
    return Wheels;
}
   public int getpassengers(){
    return passengers;
   }
  public void setpassengers(int x){
    
     passengers=x;
   }
   public String getmodelname(){
    return modelname;
   }
   public void setmodelname(String name){
     modelname=name;
   }
   public void drive(){
       System.out.print("DRiving Car");
   }
   public void stop(){
    System.out.print("Car is Stopped");
   }

}
class Bike implements Vehicle{

    

    int Wheels, passengers;
    String modelname;
    Bike(){}
    Bike(int Wheels,int passengers,String modelname){
        this.Wheels=Wheels;
        this.passengers=passengers;
        this.modelname=modelname;
    }
  
   public void setwheels(int x){
         Wheels=x;
   }  
   public int getwheels(){
    return Wheels;
}
   public int getpassengers(){
    return passengers;
   }
  public void setpassengers(int x){
    
     passengers=x;
   }
   public String getmodelname(){
    return modelname;
   }
   public void setmodelname(String name){
    modelname=name;
   }

   public void drive(){
    System.out.print("Driving Bike");
}
public void stop(){
 System.out.print("Bike is stopped");
}
}

class Auto implements Vehicle{

    int Wheels, passengers;
    String modelname;
    Auto(){}
    Auto(int Wheels,int passengers,String modelname){
        this.Wheels=Wheels;
        this.passengers=passengers;
        this.modelname=modelname;
    }
  
   public void setwheels(int x){
        Wheels=x;
   }  
   public int getwheels(){
    return Wheels;
}
   public int getpassengers(){
    return passengers;
   }
  public void setpassengers(int x){
    
     passengers=x;
   }
   public String getmodelname(){
    return modelname;
   }
   public void setmodelname(String name){
     modelname=name;
   }
   public void drive(){
    System.out.print("Driving Auto");
}
public void stop(){
 System.out.print("Auto is stopped");
}

}

public class Task1 {
    public static void main(String args[]){

        Car car[]= new Car[5];

        for(int i=0;i<5;i++){ 
            Scanner obj= new Scanner(System.in);    //Set the parameters of each car
            String model=obj.nextLine();
            car[i]=new Car(4,4,model);
        }

        for(int i=0;i<5;i++){
            car[i].getmodelname();          //see the modelname of each car
        }
        
        Bike bike[]= new Bike[10];
        for(int i=0;i<10;i++){ 
            Scanner obj= new Scanner(System.in);    //Set the parameters of each Bike
            String model=obj.nextLine();
            bike[i]=new Bike(2,2,model);
        }

        for(int i=0;i<10;i++){
            if(bike[i].getmodelname()=="Bajaj"){    //print modelname only if it is Bajaj
                bike[i].getmodelname();
            }
        }


    }
}
