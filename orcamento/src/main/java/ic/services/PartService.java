package ic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.PartRepository;
import ic.interfaces.services.IpartService;
import ic.model.entity.Part;

@Service
public class PartService implements IpartService {

	@Autowired
	private PartRepository partRepository;

	@Override
	public Part insert(Part part) {

		part.setStatus(true);
		return this.partRepository.save(part);
	}

	@Override
	public Part update(Part part) {

		return this.partRepository.save(part);
	}

	@Override
	public List<Part> listParts() {

		return this.partRepository.findAll();
	}

	@Override
	public void delete(Part part) {

		this.partRepository.deleteByCode(part.getId(), false);
	}

	@Override
	public List<Part> listParts(String part) {
		
		return this.partRepository.searchByNameList(part);
	}
}
