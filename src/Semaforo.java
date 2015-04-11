class Semaforo
{
   private int contador;
   
   public Semaforo (int inicial)
   {
      contador= inicial;
   }

   public Semaforo ()
   {
      contador= 0;
   }

   public synchronized void subir()
   {
      contador++;
      notifyAll();
   }

   public synchronized void bajar()
   {
      try
      {
         while(contador == 0)
            wait();
      }
      catch (InterruptedException e){};
      
      contador--;
   }
}
        