package com.unir.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unir.books.model.pojo.BookVista;
import com.unir.books.data.BookVistaRepository;

@Service
public class BooksVistaServiceImpl implements BookVistaService {
	 @Autowired
	 private BookVistaRepository repository;
	 
	 @Override
	 public List<BookVista> getVistaBooks() {
		 List<BookVista> vistaBooks = repository.findAll();
		 return vistaBooks.isEmpty() ? null : vistaBooks;
	 }
	 
	 @Override
	 public BookVista getVistaBook(String bookId) {
		 return repository.findById(Long.valueOf(bookId)).orElse(null);
	 }
}