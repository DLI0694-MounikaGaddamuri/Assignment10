import java.lang.Object;
import java.lang.*;
public class GCExample {
    // Constructor
    public GCExample(String name) {
        System.out.println(name + " created");
    }

    // Finalize method
    public void finalize() throws Throwable {
        System.out.println("GCExample object is being garbage collected");

    }


        public static void main (String[]args){
            // Creating instances of GCExample
            GCExample obj1 = new GCExample("Object1");
            GCExample obj2 = new GCExample("Object2");

            // Nullifying references
            obj1 = null;
            obj2 = null;

            // Requesting garbage collection
            System.gc();

            // Waiting for the garbage collector to run
            // Note: finalize() may or may not be called immediately
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
