package com.pattern.creational.builder;

public class Main {

	public static void main(String[] args) {
		var presentation = new Presentation();
		presentation.addSlide(new Slide("Slide 1"));
		presentation.addSlide(new Slide("Slide 2"));
		
		var pdfBuilder = new PdfDocumentBuilder();
		presentation.export(pdfBuilder);
		var pdf = pdfBuilder.getDocument();
		
		var movieBuilder = new MovieBuilder();
		presentation.export(movieBuilder);
		var movie = movieBuilder.getMovie();
	}

}
