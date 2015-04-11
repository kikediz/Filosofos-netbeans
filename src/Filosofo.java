class Filosofo implements Runnable
{
   private Thread t;
   protected Mesa mesa;
   protected int ind_izq, ind_der;
   protected int identidad;

   public Filosofo (int identidad, Mesa mesa)
   {
      this.identidad= identidad;
      this.mesa= mesa;

      ind_izq= mesa.mi_tenedor_izquierdo(identidad);
      ind_der= mesa.mi_tenedor_derecho(identidad);

      t= new Thread(this);
      t.start();
   }


   protected void pensar()
   {
     try
     {
      System.out.println ("Filosofo " + identidad + " esta pensando");
      int delay= (int)(Math.random()*1000);
      t.sleep(delay);
      System.out.println ("Filosofo " + identidad + " ha dejado de pensar");
     } catch (InterruptedException e) {}
   }

   protected void comer()
   {
     try
     {
      System.out.println ("Filosofo " + identidad + " esta comiendo");
      int delay= (int)(Math.random()*1000);
      t.sleep(delay);
      System.out.println ("Filosofo " + identidad + " ha terminado de comer");
     } catch (InterruptedException e) {}
   }

   protected void protocolo_entrada()
   {
     System.out.println ("Protocolo antiguo");
     Tenedor tizq= mesa.tenedor(ind_izq);
     Tenedor tder= mesa.tenedor(ind_der);
     tizq.coger();
     tder.coger();
   }

   protected void protocolo_salida()
   {
     Tenedor tizq= mesa.tenedor(ind_izq);
     Tenedor tder= mesa.tenedor(ind_der);
     tizq.soltar();
     tder.soltar();
   }

   public void run()
   {
      while (true)
      {
         pensar();
         protocolo_entrada();
         comer();
         protocolo_salida();
      }
   }
}

   