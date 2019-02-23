package org.osmarlopez.sistema;

import java.util.ArrayList;
import java.util.List;
import org.osmarlopez.bean.Book;
import org.osmarlopez.bean.Magazine;
import org.osmarlopez.bean.Publication;

public class Principal {
    public static void main(String args[]) {
        Book bookUno = new Book();
        Magazine magazineUno = new Magazine();
        List<Publication> listaPublication = new ArrayList<Publication>();
        bookUno.setTitle("ABC");
        bookUno.setEditionDate("16/02/2019");
        bookUno.setEditorial("Piedra Santa");
        bookUno.setAutores("Ruben Dario Gomez");
        bookUno.setId(7890);
        bookUno.setIsbn("197835");
        bookUno.setReaded(true);
        bookUno.setTimeReaded(60);
        magazineUno.setId(4567);
    }   
}
