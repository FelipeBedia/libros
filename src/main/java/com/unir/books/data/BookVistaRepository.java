package com.unir.books.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.unir.books.model.pojo.BookVista;

public interface BookVistaRepository extends JpaRepository<BookVista, Long> {
 List<BookVista> findByTitulo(String titulo);
}
