package com.mandatory.mandatory.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// Entity fortæller frameworket at der skal dannes en tabel ud af denne entity
@Entity
public class Post {

    /*
     * Danner id ud af den attribut der ligger lige nedenunder
     * @GeneratedValue(strategy = GenerationType.IDENTITY): Gør at id'et bliver auto-inkrementeret
     * Identity: den første post for id nr. 1 osv.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;
    private String image;

    /*
     * CascadeType.ALL: hvis et post slettes slettes alle images som er tilknyttet det bestemte post
     * mappedBy = "post": bestemmer hvilken side af forbindelsen er der den "dominerende side"
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    // Instansiering af Set med et tomt Set
    private Set<Comment> comments = new HashSet<>();

    @ManyToMany
    // Omdøber tabellen
    @JoinTable(name = "post_cat")
    private Set<Category> categories = new HashSet<>();

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
