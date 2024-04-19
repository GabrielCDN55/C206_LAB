public abstract class Usuario {
    private int id;
    private int senha;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public Usuario(int id, int senha) {
        this.id = id;
        this.senha = senha;
    }
    public abstract void logar();
}
