package com.doclerholding.hackaton.data.loaders;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dataTypes")
public class HospitalLoader extends AbstractOverpassLoader {

	public HospitalLoader() {
		super("amenity", "hospital");
	}

	@Override
	public String filterType() {
		return "hospital";
	}

	public static void main(String[] args) {
		HospitalLoader loader = new HospitalLoader();
		loader.load(true);
	}
}
