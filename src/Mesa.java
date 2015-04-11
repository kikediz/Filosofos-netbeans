class Mesa
{
   private Tenedor tenedores[];
   private int comensales;

   public Mesa (int comensales)
   {
      this.comensales= comensales;
      tenedores= new Tenedor[comensales];
      for (int i= 0; i < comensales; i++)
         tenedores[i]= new Tenedor(i);
   }

   public Tenedor tenedor(int i)
   {
      return tenedores[i];
   }

   public int mi_tenedor_derecho(int i)
   {
      return (i+1)%comensales;
   }
 
   public int mi_tenedor_izquierdo(int i)
   {
      return i;
   }
}

      