class Foto {
    String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void imprimir() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}
