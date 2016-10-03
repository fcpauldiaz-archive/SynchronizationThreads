/**
* Universidad Del Valle de Guatemala
* 02-oct-2016
* Pablo Díaz 13203
*/

package synchronization;

import java.util.Random;

/**
 *
 * @author Pablo
 */
public class Restador implements Runnable {
     private Comunicador comunicator;
    
    public Restador(Comunicador com) {
        this.comunicator = com;
    }

    
    
    @Override
    public void run() {
        for(int i=0; i < 10; i++) {
            synchronized(comunicator) {
                comunicator.resta();
                System.out.println("Thread Restador : " + comunicator.toString());                
            }
            Random random = new Random();
            int time = random.nextInt(5) + 1;
            try {
                Thread.sleep(time * 1000);
            } 
            catch (InterruptedException exception) {
                System.out.println("Ha ocurrido un eror en Restador" + exception );
            }
        }
        System.out.println("Finish Restador");
    }
}
