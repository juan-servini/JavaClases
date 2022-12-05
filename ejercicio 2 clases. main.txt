public class main{

    public static void main (String[] args){
	Cuentacorriente c1,c2,c3;
	
	c1= new Cuentacorriente("pepe","123456789A");
	c2= new Cuentacorriente(1000);
	c3= new Cuentacorriente(1000,50,"123456789A");
	
	
	c1.mostrarInformacion();
	c2.mostrarInformacion();
	c3.mostrarInformacion();
	}
}