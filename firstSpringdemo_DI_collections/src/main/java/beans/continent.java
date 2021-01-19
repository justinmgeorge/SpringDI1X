package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class continent {
	
	private List carBrands;
	
	private Set GearType;
	
	private Map brandModels;	

	public void setCarBrands(List carBrands) {
		this.carBrands = carBrands;
	}
	
	public void setGearType(Set gearType) {
		GearType = gearType;
	}

	public void setBrandModels(Map brandModels) {
		this.brandModels = brandModels;
	}

	public void allVehicleInfo() {
		
		System.out.println("Info on brands:");
		for(Object l:carBrands) {			
			System.out.println(l);			
		}
		
		System.out.println("Types of gear:");
		for(Object g:GearType) {
			System.out.println(g);
		}
		
		System.out.println("Variants in models");
		Set k = brandModels.keySet();
		for(Object v:k) {
			System.out.println("Car "+v+" having model "+ brandModels.get(v));
		}

	}

}
