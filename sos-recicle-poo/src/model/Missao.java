package model;

public class Missao {
    private String nome;
    private int pontuacao;
    private Status status;
    private String objetivo;
    private String emailDoCriador;
    private String emailDoRecebedor;
    private Material material;

    public Missao() {
    }

    public Missao(String nome, int pontuacao, Status status, String objetivo, String emailDoCriador, String emailDoRecebedor, Material material) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.status = status;
        this.objetivo = objetivo;
        this.emailDoCriador = emailDoCriador;
        this.emailDoRecebedor = emailDoRecebedor;
        this.material = material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEmailDoCriador() {
        return emailDoCriador;
    }

    public void setEmailDoCriador(String emailDoCriador) {
        this.emailDoCriador = emailDoCriador;
    }

    public String getEmailDoRecebedor() {
        return emailDoRecebedor;
    }

    public void setEmailDoRecebedor(String emailDoRecebedor) {
        this.emailDoRecebedor = emailDoRecebedor;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    
}
