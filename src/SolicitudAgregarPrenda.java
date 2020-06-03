import prenda.Prenda;

public class SolicitudAgregarPrenda implements SolicitudPrenda{
    private Guardarropas guardarropas;
    private Prenda prenda;

    public SolicitudAgregarPrenda(Guardarropas guardarropas, Prenda prenda) {
        this.guardarropas = guardarropas;
        this.prenda = prenda;
    }

    @Override
    public void aceptarSolicitud() {
        guardarropas.agregarPrenda(prenda);
    }

    public void deshacer(){
        guardarropas.quitarPrenda(prenda);
    }
}
