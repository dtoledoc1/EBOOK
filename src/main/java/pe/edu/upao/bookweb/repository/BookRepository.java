package pe.edu.upao.bookweb.repository;
import pe.edu.upao.bookweb.domain.Book;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
