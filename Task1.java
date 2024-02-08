import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class  Vehicle{
    int Wheels, passengers;
    String modelname;

   abstract int getwheels();
   abstract void setwheels(int x);
   abstract int getpassengers();
   abstract void setpassengers(int x);
   abstract String getmodelname();
   abstract void setmodelname(String name);
   abstract void drive();
   abstract void stop();

}
class Car extends Vehicle{
    

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
class Bike extends Vehicle{

    

  
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

class Auto extends Vehicle{


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
        List<Car> objs=new ArrayList<>();


        for(int i=0;i<5;i++){ 
            Scanner obj= new Scanner(System.in); 
            System.out.print("enter the model");   //Set the parameters of each car
            String model=obj.nextLine();
            objs.add(new Car(4,4,model));
        }

        for(Car i : objs){
            i.getmodelname();          //see the modelname of each car
        }
        
        List<Bike> bikelist= new ArrayList<>();
        for(int i=0;i<10;i++){ 
            Scanner obj= new Scanner(System.in);        //Set the parameters of each Bike
            System.out.print("enter the model");
            String model=obj.nextLine();
            bikelist.add(new Bike(2,2,model));
        }

        for(Bike i:bikelist){
            if(i.getmodelname()=="Bajaj"){    //print modelname only if it is Bajaj
                i.getmodelname();
            }
        }


    }
}
