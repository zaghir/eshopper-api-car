package com.bd.eshopper.api.car.metier;

import com.bd.eshopper.api.car.entity.Image;
import java.util.List;

public interface ImageMetier {
	
	public Image save(Image o) ;
	public List<Image> getAll();
	public Image update(Image o);
	public Long  delete(Long id) ;
	public Image findOne(Long id) ;
	

}
