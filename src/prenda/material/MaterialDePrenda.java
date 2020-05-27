package prenda.material;

public class MaterialDePrenda {

    private Trama trama;
    private TipoDeMaterial tipoDeMaterial;

    public MaterialDePrenda(TipoDeMaterial tipoDeMaterial) {
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public MaterialDePrenda(Trama trama, TipoDeMaterial tipoDeMaterial) {
        this.trama = trama;
        this.tipoDeMaterial = tipoDeMaterial;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }
}
