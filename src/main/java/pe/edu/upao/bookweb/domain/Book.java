package pe.edu.upao.bookweb.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name="books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="author", nullable = false)
    private String author;
    @Column(name="image_url", nullable = false)
    private String imageUrl;
    @Column(name="description", nullable = false)
    private String description;
    @Column(name="title", nullable = false)
    private String title;


}