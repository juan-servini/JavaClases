publlc clase main { 

public static void nain(String [] args ) { 
cuentacorriente c; 
c = new CuentaCorrriente("eliseo", "12346678A");

c.limite - -100; 
c.ingreso(1000);
c.egreso(300); 
c.mostrarInformacion(); 
Systam.out.println("Puedo sacar 700 euros: " + c.egreso(700)); 
Systeo.out.println("Puedo sacar 500 euros: " • c.egreso(500));
    }
}