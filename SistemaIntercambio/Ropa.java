package SistemaIntercambio;

public abstract class Ropa implements Prestable{

    private Color color;
    private Material material;
    private String marca;
    private boolean estado;

    public Ropa(Color color, Material material, String marca, Boolean estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "color='" + color + '\'' +
                ", material=" + material +
                ", marca='" + marca + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    @Override

    public boolean prestar(){

if (this.estado == true){
    System.out.println(toString() + " Se prestara. ");
    return true;
}
else {
        System.out.println(toString() + "NO se prestara. " );
return false;
    }
    }

    public boolean agregarElemento(){
        if ( prestar() ) {
            return true;
        }
        else {
            return false;
        }
    }
}
