public abstract class Sastre {

    public Uniforme fabricarUniforme(){
        return new Uniforme(fabricarPrendaSuperior(), fabricarPrendaInferior(), fabricarCalzado());
    }

    protected abstract Prenda fabricarPrendaSuperior();
    protected abstract Prenda fabricarPrendaInferior();
    protected abstract Prenda fabricarCalzado();
}
