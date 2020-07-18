package br.com.caelum.agenda.jdbc.modelo;

import java.time.LocalDate;
import java.util.Calendar;

public class Contacto {
	 private long id;
	    private String nome;
	    private String email;
	    private String endereco;
	    private LocalDate dataNascimento;

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
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

	    public LocalDate getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(LocalDate dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	@Override
	public String toString() {
		return "Contacto{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", email='" + email + '\'' +
				", endereco='" + endereco + '\'' +
				", dataNascimento=" + dataNascimento +
				'}';
	}
}
