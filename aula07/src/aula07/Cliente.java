package aula07;


public class Cliente {
private String nome;
private String email;
private String endereco;
private String telefone;
private int idade;

public Cliente(String nome, String email, String endereco, String telefone, int idade) {
    this.nome = nome;
    this.email = email;
    this.endereco = endereco;
    this.telefone = telefone;
    this.idade = idade;
}


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getTelefone() {
    return telefone;
}

public void setTelefone(String telefone) {
    this.telefone = telefone;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}


public void visualizar() {
    System.out.println("Nome: " + nome);
    System.out.println("E-mail: " + email);
    System.out.println("Endereço: " + endereco);
    System.out.println("Telefone: " + telefone);
    System.out.println("Idade: " + idade);
}
}
