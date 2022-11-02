package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.models.db.GenericBDRequestModel;

@Data
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProvedorBDResponseModel extends GenericBDRequestModel{ // 

	private String razonSocial;

	private String ruc;

	private String correo;

	private String telefono;

}
