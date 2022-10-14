package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.models.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericRequestModel {

	private String audIP;
    private String audUsuario;
	
}
