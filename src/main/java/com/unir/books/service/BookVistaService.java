package com.unir.books.service;
import com.unir.books.model.pojo.BookVista;

import java.util.List;

public interface BookVistaService{
 List<BookVista> getVistaBooks();
 BookVista getVistaBook(String bookId);
}