package br.com.adriano.vendascrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.adriano.vendascrud.domain.Categoria;
import br.com.adriano.vendascrud.repository.CategoriaRepository;
import br.com.adriano.vendascrud.resources.CategoriaResource;

@SpringBootApplication
public class VendasCrudApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(VendasCrudApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		
	}

}
