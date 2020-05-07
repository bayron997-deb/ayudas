package CuantaBancaria;

public class Persona {
    private String nombre;
    private Cuenta cuenta;
    private int sueldo;

    public Persona(String nombre, Cuenta cuenta, int sueldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.sueldo = sueldo;
    }

    public Persona(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        crearCuenta();
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre,int sueldo, int sobregiro){
        this.nombre=nombre;
        this.sueldo=sueldo;
        crearCuenta(sobregiro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }


    private void crearCuenta(int sobregiro){
        this.cuenta=new Cuenta(this.nombre,0,sobregiro);
    }
    private void crearCuenta(){
        this.cuenta=new Cuenta(nombre);
    }
    public void reajuste(){
        this.cuenta.reajuste();
    }
    public void solicitudSobregiro(int n){
        int i=this.cuenta.getSobregiro()+n;
        this.cuenta.getSobregiro();
    }
    public void pago(int n){
        this.cuenta.cargo(n);
    }
    public void reajusteAnueal(int n){
        int i=this.cuenta.getSaldo();
        this.cuenta.setSaldo(i);
    }
}
