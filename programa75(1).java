public class Main {

public static void main(String[] args) {
CuentaCorriente c1, c2;

c1 = new CuentaCorriente("Pepe", "12345678-A");
c2 = new CuentaCorriente("Ana", "99999999-E");

c1.mostrarInformacion();
c2.nombreBanco = "Banco Central";
c1.mostrarInformacion();
CuentaCorriente.nombreBanco = "Caja de ahorros de Do-While";

c1.mostrarInformacion();
CuentaCorriente.cambiarNombreBanco("If-Else Bank");
c1.mostrarInformacion();
}
}