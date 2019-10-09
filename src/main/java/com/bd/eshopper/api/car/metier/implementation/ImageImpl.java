package com.bd.eshopper.api.car.metier.implementation;

import com.bd.eshopper.api.car.dao.ImageRepository;
import com.bd.eshopper.api.car.entity.Image;
import com.bd.eshopper.api.car.metier.ImageMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImageImpl implements ImageMetier {

	@Autowired
	private ImageRepository imageRepository ;

	@Override
	public Image save(Image o) {
		Image a = new Image() ;
		if(imageRepository.getOne(o.getId()) == null){
			return imageRepository.save(o);
		}else{
			 a.setUrlImg("exite deja");			 
			 return a;
		}		
	}

	@Override
	public List<Image> getAll() {
		return imageRepository.findAll();
	}

	@Override
	public Image update(Image o) {
		return imageRepository.save(o);
	}

	@Override
	public Long delete(Long id) {
		if(imageRepository.getOne(id) != null){
			imageRepository.deleteById(id);
			return id ;
		}else{
			return 0L ;
		}
	}

	@Override
	public Image findOne(Long id) {
		return imageRepository.getOne(id);
	}
	
	
	
}
