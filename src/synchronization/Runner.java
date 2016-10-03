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
public class Runner {
   private Comunicador com;   

    public Runner() {
        com = new Comunicador();
        run();
    }
    
    private void run() {
        Thread Sumador = new Thread(new Sumador(com));
        Thread Restador = new Thread(new Restador(com));
        Sumador.start();
        Restador.start();
    }
}
