package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.models.web.GenericRequestModel;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProvedorRequestModel extends GenericRequestModel {

	private static final long serialVersionUID = 1731794648750894180L;

	private String razonSocial;

	private String ruc;

	private String correo;

	private String telefono;

}
