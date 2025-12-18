package com.jsp.movieserverside.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.movieserverside.entity.Movie;
public interface MovieRepository extends JpaRepository<Movie,Long>
{

}
