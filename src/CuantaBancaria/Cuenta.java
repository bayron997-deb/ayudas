package CuantaBancaria;

public class Cuenta {
    private String nombre;
    private int saldo;
    private int sobregiro;
    public Cuenta(){
        System.out.println("cienta creada...");
        System.out.println("Ingrese los datos");
    }

    public Cuenta(String nombre, int saldo, int sobregiro){
        this.nombre=nombre;
        this.saldo=saldo;
        this.sobregiro=sobregiro;
    }
    public Cuenta(String nombre, int saldo){
        this.nombre=nombre;
        this.saldo=saldo;
    }
    public Cuenta(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getSaldo() {
        return saldo;
    }
    public int getSobregiro() {
        return sobregiro;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", sobregiro=" + sobregiro +
                '}';
    }
    public void cargo(int n){
        this.saldo-=n;
    }
    public void cargo(int n, int m){
        this.saldo-=(n+m);
    }
    public void reajuste(){
        this.saldo*=1.0015;
    }
    public void deposito(int n){
        this.saldo+=n;
    }


}
