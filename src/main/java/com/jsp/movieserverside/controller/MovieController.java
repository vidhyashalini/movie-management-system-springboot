package com.jsp.movieserverside.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsp.movieserverside.entity.Movie;
import com.jsp.movieserverside.repository.MovieRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor//constructor injection applied for all the variable
public class MovieController {

	MovieRepository repository;//constructor Injection
@GetMapping("/")
public String loadMain(ModelMap map)
{
	List<Movie> movies=repository.findAll();
	if(!movies.isEmpty())
		map.put("movies", movies);
	return "main.html";
}
@GetMapping("/add")
public String loadAdd()
{
	return "add.html";
}
@PostMapping("/add")
public String add(Movie movie,RedirectAttributes attributes)
{
	repository.save(movie);
	attributes.addFlashAttribute("message","movie Record added Sucesss");
	return "redirect:/";
}
@GetMapping("/delete/{id}")
public String delete(@PathVariable Long id,RedirectAttributes attributes)
{
	repository.deleteById(id);
	attributes.addFlashAttribute("message","movie Record deleted Sucesss");
	return "redirect:/";
}
@GetMapping("/edit/{id}")
public String edit(@PathVariable Long id,ModelMap map)
{
	Movie movie=repository.findById(id).orElseThrow();
	map.put("movie",movie);

	return "edit.html";
}


@PostMapping("/edit")
public String update(@ModelAttribute Movie movie,RedirectAttributes attributes)
{
	repository.save(movie);
	attributes.addFlashAttribute("message","movie Record Updated Sucesss");
	return "redirect:/";
	
}
}