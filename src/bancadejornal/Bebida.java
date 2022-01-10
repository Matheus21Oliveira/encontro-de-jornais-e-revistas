
package bancadejornal;

public class Bebida extends Produto{
    private String tipo;

    public Bebida(String tipo, int codigo, String nome) {
        super(codigo, nome);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
