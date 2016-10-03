/**
* Universidad Del Valle de Guatemala
* 02-oct-2016
* Pablo Díaz 13203
*/

package synchronization;

/**
 *
 * @author Pablo
 */
public class Comunicador {

      private int X = 0;
      
      public void resta() {
        while (X == 0) {
            try {
                wait();
                System.out.println("Thread Waiting X = " + X);
                break;
            } catch (InterruptedException exception) {
                System.out.println("Error resta" + exception);
            }
        }
        X--;
        
      }
      
      public void suma() {
          X++;
          //avisar a threads;
          System.out.println("Notificando");
          notifyAll();
      }

    @Override
    public String toString() {
        return "Comunicador " + "X=" + X;
    }
      
      
    
}
