class Tenedor
{
   private int identidad;
   private boolean cogido;

   public Tenedor (int identidad)
   {
      this.identidad= identidad;
   }

   synchronized public void coger()
   { 
      if (cogido)
      {
         System.out.println (" -Tenedor " + identidad + ": SE ESTAN PELEANDO POR MI!");
  	 System.exit(1);
      }
      else
      {
         cogido= true;
         System.out.println (" -Tenedor " + identidad + " ha sido cogido");
      }
   }

   synchronized public void soltar()
   { 
      cogido= false;
      System.out.println (" -Tenedor " + identidad + " ha sido soltado");
   }
}
