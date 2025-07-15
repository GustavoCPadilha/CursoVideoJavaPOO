package gustavo.projetoyoutube;


public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    @Override
    public void play() {
        if (!this.isReproduzindo()) {
            this.setReproduzindo(true);
            System.out.println("Reproduzindo!");
        } else {
            System.out.println("Já está reproduzindo!");
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("Pausando!");
        } else {
            System.out.println("Já está pausado!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
}
