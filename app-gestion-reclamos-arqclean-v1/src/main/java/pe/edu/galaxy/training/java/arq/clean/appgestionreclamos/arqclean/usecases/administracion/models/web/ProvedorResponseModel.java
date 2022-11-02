package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.administracion.models.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.usecases.generic.models.web.GenericResponseModel;

@Data
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProvedorResponseModel extends GenericResponseModel{ // 


	private String razonSocial;

	private String ruc;

	private String correo;

	private String telefono;

}
