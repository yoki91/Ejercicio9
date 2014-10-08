package edu.upc.eetac.dsa.yifeige.Ejercicio9;

public class CuentaAtras implements Runnable 
{
	Thread th;
	String id;
	int numero;
	int segundo=0;
	public CuentaAtras(String s,int n)
	{
		this.id=s;
		this.numero=n;
		th=new Thread(this);
		th.start();
		
	}
	public void run()
	{
		while (numero >= 0) 
		{
			System.out.printf("El %s su numero actual es %d\n", id, numero);
			numero = numero - 1;
			try 
			{

				th.sleep(1*1000);
				segundo = segundo + 1;
				System.out.printf("Para el thread %s Ha pasado %d segundos\n",id, segundo);

			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		  }
	}
	
}
	

	
