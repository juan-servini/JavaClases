Clase CuentaCorriente

class Cuentacorriente{

 
double saldo;
string nombre
String dni; 
double Limite; 

(String nombre, String dni) {

saldo= 0;

this.nombre=nombre;

this.dni = dni;

 limite=-50;

 }

boolean egreso(double cant) {
boolean operacionposible;

if ((saldo — cant) >= limite) {
saldo--cant;
operacionPosible=true;
} else{

System.out.println("no hay dinero suficiente”);
operacionPosible=false;
}
return (operacionPosible);

}
 
void ingreso (double cant) {
saldo+- cant;
 }
void mostrar informacion(){
System.out.println("nombre: ” +nombre);
System.out.println("dni: ” +dni);
System.out.println("saldo: ” +saldo);
System.out.println("Limite descubierto: ” + limite);
    }

 }
