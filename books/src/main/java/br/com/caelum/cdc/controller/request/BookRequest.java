package br.com.caelum.cdc.controller.request;

import br.com.caelum.cdc.model.Book;

public class BookRequest {
    private String title;
    private Long authorId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Book toDomain() {
        return new Book(title, authorId);
    }
}
