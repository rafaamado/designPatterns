package com.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
	private List<Slide> slides = new ArrayList<>();
	
	public void addSlide(Slide slide) {
		slides.add(slide);
	}
	
	public void export(PresentationBuilder builder) {
		builder.addSlide(new Slide("Copyright"));
		for(Slide slide: slides)
			builder.addSlide(slide);
	}
	
	
	/* 
	 * The problem
	 * 
	public void export(PresentationFormat format) {
		if(format == PresentationFormat.PDF) {
			var pdf = new PdfDocument();
			slides.forEach(s -> pdf.addPage(s.getText()));
		}
		else if(format == PresentationFormat.MOVIE) {
			var movie = new Movie();
			for(Slide slide : slides) {
				movie.addFrame(slide.getText(), 3);
			}
		}
	} */ 
}
