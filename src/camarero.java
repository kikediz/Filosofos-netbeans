class camarero
{
   public static void main (String args[])
   {
      int comensales= Integer.parseInt (args[0]);

      System.out.println ("Poniendo la mesa para " + comensales + " comensales");
      Mesa mesa= new Mesa(comensales);
      
      System.out.println ("Creando a los filosofos y sentandolos a la mesa");
      for (int i= 0; i<comensales; i++)
      {
         Filosofo f= new Filosofo(i, mesa);
      }
   }
}
