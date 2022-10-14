package pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.configurations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.entity.ProveedorEntity;
import pe.edu.galaxy.training.java.arq.clean.appgestionreclamos.arqclean.repository.administracion.ProveedorRespository;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class ComponentConfiguration implements CommandLineRunner { 

	
	public final ProveedorRespository proveedorRespository;
	
	@Override
    public void run(String... args) throws Exception {
		
		proveedorRespository.deleteAll();

		proveedorRespository.save(
				ProveedorEntity.builder()
				.id(1L).razonSocial("GALAXY TRAINING PERU")
				.correo("contacto@galaxy.edu.pe")
				.telefono("+51 950 4506")
				.estado("1").ruc("PRUEBA-RUC")
				.build());
		
		proveedorRespository.findAll().forEach((city) -> {
            log.info("{}", city);
        });
		
    }
	
}
