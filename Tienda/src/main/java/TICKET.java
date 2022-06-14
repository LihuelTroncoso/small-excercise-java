public class TICKET {
    private String numFactura;
    private PEDIDO pedido;

    public TICKET(String numFactura, PEDIDO pedido) {
        this.numFactura = numFactura;
        this.pedido = pedido;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public PEDIDO getPedido() {
        return pedido;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public void setPedido(PEDIDO pedido) {
        this.pedido = pedido;
    }
    
}
