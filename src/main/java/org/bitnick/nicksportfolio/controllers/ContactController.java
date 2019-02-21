package org.bitnick.nicksportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	private final String title = "Lorem Ipsum";
	private final String body = 
			"\n\n"
			+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac varius nisl, et molestie ligula. Morbi est tortor, "
			+ "fermentum id vehicula pulvinar, mattis id ex. Duis eu viverra lectus. Integer quis condimentum justo. Nullam vestibulum "
			+ "pharetra mi ut ultricies. Sed hendrerit mi placerat, sodales lectus et, vehicula nibh. Cras sodales, augue sed eleifend semper, "
			+ "ligula diam egestas eros, eu suscipit nibh felis et magna. Praesent porta laoreet ornare. Integer efficitur ac enim in fermentum. "
			+ "Quisque pharetra mauris sed ligula dignissim, at mollis ante lobortis. Pellentesque id tincidunt augue, sit amet iaculis "
			+ "dolor. Curabitur id nisi ante. Nulla faucibus erat dui, nec molestie ipsum vestibulum ut.\n" 
			+ "\n"
			+ "Duis rhoncus tincidunt leo, quis sodales ante finibus ac. Donec aliquam risus tellus, eget vulputate quam gravida sed. "
			+ "Cras tristique nunc felis, in ultrices tortor condimentum at. Vivamus quis accumsan est, at aliquam dolor. Praesent "
			+ "scelerisque, lorem a facilisis rutrum, eros ante malesuada dolor, vel maximus magna odio vitae libero. Etiam molestie"
			+ " turpis tellus, scelerisque aliquam tortor faucibus nec. Etiam non magna ut nibh eleifend faucibus a et risus. Integer"
			+ " gravida feugiat nibh, quis luctus risus ullamcorper a. Vestibulum auctor efficitur urna, eget euismod mauris facilisis"
			+ " eu. Proin ligula erat, consequat ut suscipit vel, convallis non eros. Curabitur turpis ipsum, tristique at augue vitae, venenatis"
			+ " lobortis tellus. Etiam id malesuada ante. Suspendisse luctus quam ac turpis mollis, et sollicitudin mi fermentum. Phasellus non"
			+ " magna turpis.\n"
			+ "\n" 
			+ "Sed facilisis ante in urna sodales volutpat. Integer eget tortor interdum, egestas nunc in, fermentum nisi. Aliquam erat volutpat."
			+ " Nam turpis lectus, imperdiet ac facilisis ac, fermentum eu magna. Nunc magna elit, sollicitudin non sodales ac, iaculis nec velit."
			+ " Cras varius at metus non fringilla. Quisque commodo quam libero, at gravida dolor finibus fermentum. Suspendisse ultrices felis"
			+ " arcu, vel euismod lectus convallis ac. Vivamus gravida nisi eget pharetra porta. Duis commodo quis libero quis laoreet. Maecenas"
			+ " orci justo, egestas ac mauris et, finibus ornare nisl. ";
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String getContactMe(Model model) {
		model.addAttribute("title", this.title);
		model.addAttribute("body", this.body);
		
		return "contact";
	}
}
