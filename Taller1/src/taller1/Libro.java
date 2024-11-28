package Taller1;

public class Libro{
    protected String titulo;
    protected String autor;
    protected int NumeroPaginas;

    public Libro() {
        this.titulo = "Título Desconocido";
        this.autor = "Autor Desconocido";
        this.NumeroPaginas = 0;
    }

    public Libro(int NumeroPaginas, String autor, String titulo) {
        this.NumeroPaginas = NumeroPaginas;
        this.autor = autor;
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    @Override
    public String toString(){
        return  "Libro [Titulo = "+ titulo  + ", Numero de paginas = " + NumeroPaginas+ ", Autor = "+ autor + " ]";
    }

}
