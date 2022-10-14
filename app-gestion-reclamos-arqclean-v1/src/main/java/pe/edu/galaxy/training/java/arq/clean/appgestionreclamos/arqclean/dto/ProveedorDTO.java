package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorDTO extends GenericDTO{
	
	private static final long serialVersionUID = 1731794648750894180L;

	private String razonSocial;
	
	private String ruc;

	private String correo;

	private String telefono;

	
}
