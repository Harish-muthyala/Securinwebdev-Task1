import java.util.concurrent.Callable;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Hello implements Callable<String>{
    int num;                                    //class implementing  Callale<String>

    Hello(int x){
        num=x;
    }

    public String call() {
        return "Hello"+num; //overiding call function
    }

}

public class executorservic {

    public static void main(String args[]) {

        ExecutorService obj= Executors.newFixedThreadPool(10);
        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(new Hello(1));
        callableTasks.add(new Hello(2));
        callableTasks.add(new Hello(3));            //Creating list of callables
        callableTasks.add(new Hello(4));
        callableTasks.add(new Hello(5));
        try
        {
            List<Future<String>> res = obj.invokeAll(callableTasks);    //invoking all

            for(Future<String> i : res){
                System.out.println(i.get());        //Printing the result
            }
        }
        catch(Exception e){}

        obj.shutdown();///shutting down the executorservice
      }
    
}
