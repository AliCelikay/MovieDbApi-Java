package dev.AliCelikay.movies;

//lombok project takes care of the getters and setters
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//Annotating class as a document, letting framework know this class represents each document in the movies collection
@Document(collection = "movies")
@Data
//annotation for creating constructor that takes all the private fields as arguemnts
@AllArgsConstructor
//another constructor that doesnt take parameters
@NoArgsConstructor
public class Movie {
    //annotating id field as an actual id, letting framework know this property should be treated as the unique identifier for each movie in db
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

}
