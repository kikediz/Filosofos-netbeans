/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filosofos2;

/**
 *
 * @author morte
 */
class DiningRoom {

        private final static int THINKING=0;
        private final static int HUNGRY=1;
        private final static int EATING=2;

        private int[] state = { THINKING,THINKING,THINKING,THINKING,THINKING };

        private void eat(int p) {
		System.out.println(p+": eating..");
		try { Thread.sleep(50+(int)(Math.random()*800.0)); }
		catch (Exception e) { }
	}
        public void dine(int p) {
                grabForks(p);
                eat(p);
                releaseForks(p);
        }
        private synchronized void grabForks(int p) {
                state[p]=HUNGRY;
		System.out.println(p+": waiting & hungry..");
                test(p);
                while ( state[p] != EATING )
                  try { wait(); } catch(Exception e) {}
        }
        private synchronized void releaseForks(int p) {
                state[p]=THINKING;
                test((p+4)%5);
                test((p+1)%5);
        }
        private void test(int p) {
                if ( state[p] == HUNGRY
                     && state[(p+1)%5] != EATING
                     && state[(p+4)%5] != EATING
                ) {
                        state[p]=EATING;
                        notifyAll();
                }
        }
}