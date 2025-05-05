package unq.tp5;

public abstract class Factura implements Cobrable {

    protected AgenciaRecaudadora agencia;
    
    public Factura(AgenciaRecaudadora agencia) {
        this.agencia = agencia;
    }
    
    public abstract double montoAPagar();
}
