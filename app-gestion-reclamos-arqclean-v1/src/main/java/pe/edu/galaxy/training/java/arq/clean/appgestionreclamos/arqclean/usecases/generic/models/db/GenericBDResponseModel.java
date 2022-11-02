package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericBDResponseModel {

	private String audIP;
	private String audUsuario;
	
}
