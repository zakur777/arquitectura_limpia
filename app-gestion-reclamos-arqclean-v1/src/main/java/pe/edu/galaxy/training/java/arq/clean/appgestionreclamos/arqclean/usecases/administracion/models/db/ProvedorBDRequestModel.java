package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.models.db.GenericBDRequestModel;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProvedorBDRequestModel extends GenericBDRequestModel {

	private static final long serialVersionUID = 1731794648750894180L;

	private String razonSocial;

	private String ruc;

	private String correo;

	private String telefono;

}
