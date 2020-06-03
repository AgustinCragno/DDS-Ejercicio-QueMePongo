import prenda.Prenda;

public class SolicitudQuitarPrenda implements SolicitudPrenda{
    private Guardarropas guardarropas;
    private Prenda prenda;

    public SolicitudQuitarPrenda(Guardarropas guardarropas, Prenda prenda) {
        this.guardarropas = guardarropas;
        this.prenda = prenda;
    }

    @Override
    public void aceptarSolicitud() {
        guardarropas.quitarPrenda(prenda);
    }

    @Override
    public void deshacer() {
        guardarropas.agregarPrenda(prenda);
    }
}
