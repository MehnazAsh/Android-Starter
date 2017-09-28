package com.kinvey.bookshelf;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by Prots on 3/15/16.
 */
public class Book extends GenericJson {

    @Key(Constants.NAME)
    private String name;

    @Key(Constants.IMAGE_ID)
    private String imageId;

    @Key(Constants.AUTHORS)
    private List<String> authors;

    public Book(){};

    public Book(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
