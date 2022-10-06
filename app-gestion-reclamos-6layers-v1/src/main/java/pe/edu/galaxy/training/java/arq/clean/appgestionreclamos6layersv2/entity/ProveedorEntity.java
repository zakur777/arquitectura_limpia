package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos6layersv2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_PROVEEDOR")
@Entity(name = "ProveedorEntity")
public class ProveedorEntity {
	
	@Id
	@Column(name = "PROVEEDOR_ID" ,nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProveedor")
    @SequenceGenerator(sequenceName = "SEQ_PROVEEDOR", allocationSize = 1, name = "seqProveedor")
	private Long id;
	
	@Size(min = 10, max = 220, message = "La razon social debe tenemo como minimo {min} y maximo {max} caracteres")
	@Column(name = "RAZON_SOCIAL" ,nullable = false)
	private String razonSocial;
	
	@Column(name = "RUC" ,nullable = false)
	private String ruc;

	@Email(message = "El formato de correo no es válido")
	@Column(name = "CORREO" ,nullable = false)
	private String correo;

	
	@Column(name = "TELEFONO" ,nullable = false)
	private String telefono;

	@Column(name = "ESTADO" ,nullable = false)
	private String estado;
	
	
}
