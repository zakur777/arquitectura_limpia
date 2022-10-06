package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericDTO implements Serializable{

	private static final long serialVersionUID = 3679981373814366564L;

	private Long id;
	
	private String estado;
	
}
