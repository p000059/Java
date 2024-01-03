package os.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import os.interfaces.repository.OSrepository;
import os.model.OS;

@Service
public class OSservice {

	@Autowired
	private OSrepository oSrepository;
	
	private Boolean validateOS(OS objectOS) {
		
		return this.oSrepository.existsByCode(objectOS.getCode());
	}

	@SuppressWarnings("static-access")
	@Transactional
	public OS create(OS objectOS) {

		try {

			if ((this.validateOS(objectOS).equals(false))) {

				objectOS.setStatus(true);
				objectOS.setCode(objectOS.getCode().toUpperCase());
				return oSrepository.save(objectOS);

			} else if(this.validateOS(objectOS).equals(true)) {

				return new OS().builder().description("Código já cadastrado!").build();
				
			} else {
				
				return new OS().builder().description("Não cadastrado, verificar novamente dos dados inseridos.").build(); 
			}

		} catch (Exception e) {

			return new OS().builder().description(e.getMessage()).build();
		}

	}

	@SuppressWarnings({"static-access" })
	public OS read(String code) {


		if (this.oSrepository.existsByCode(code)) {

			return this.oSrepository.findByCode(code);
			
		} else {

			return new OS().builder().description("OS não encontrada ou código inválido").build();
		}
	}

	@SuppressWarnings("static-access")
	public OS read(OS objectOS) {

		if (oSrepository.findByCode(objectOS.getCode()).equals(objectOS)) {

			return objectOS;

		} else {

			return new OS().builder().description("OS não encontrada ou código inválido").build();
		}
	}

	public List<OS> readOSList() {

		return oSrepository.findAll();
	}

	public Page<OS> readOSLists(Pageable pageable) {

		return this.oSrepository.findAll(pageable);
	}

	@SuppressWarnings("static-access")
	public OS update(OS objectOS) {

		if (this.validateOS(objectOS).equals(true)) {

			objectOS.setId(objectOS.getId());
			objectOS.setStatus(true);
			return this.oSrepository.save(objectOS);

		} else {

			return new OS().builder().description("OS não encontrada ou código inválido").build();
		}
	}

	@SuppressWarnings("static-access")
	public OS update(String code) {

		OS objectOS = oSrepository.findByCode(code);

		if ((objectOS.getCode().equals(null)) && (objectOS.getCode().equals(""))) {

			return new OS().builder().description("OS não encontrada ou código inválido").build();

		} else {

			objectOS.setId(objectOS.getId());
			return this.oSrepository.save(objectOS);
		}
	}

	@SuppressWarnings("static-access")
	@Transactional
	public OS delete(OS objectOs) {

		if (this.validateOS(objectOs).equals(true)) {

			oSrepository.deleteById(objectOs.getId());

			return new OS().builder().description("Ordem de Serviço deletada").build();

		} else {

			return new OS().builder().description("Ordem de serviço inválida ou não cadastrada").build();
		}
	}

	@SuppressWarnings("static-access")
	@Transactional
	public OS delete(String code) {

		try {
			
			  if (this.oSrepository.existsByCode(code)) {
			 
				 OS objectOS = this.oSrepository.findByCode(code);
				 this.oSrepository.deleteById(objectOS.getId());			
				
				 return new OS().builder().description("OS deletada dos registros").build();
				 
			 } else {
			 
				 return new OS().builder().description("Código inválido ou ordem de serviço não cadastrada.").build();				 
			 }
			
		} catch (Exception e) {
			
			return new OS().builder().description(e.getMessage()).build();
		}		
		
	}
}
