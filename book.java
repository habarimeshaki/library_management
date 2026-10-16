class book{
    int book_id;
    String book_title;
    String author;
    int publication_year;
    int available_copies;
  
    book(int book_id,String book_title, String author, int publication_year, int available_copies){
        setId(book_id);
        setTitle(book_title);
        setAuthor(author);
        setPublication_year(publication_year);
        setCopies(available_copies);
    }
    

    //Setting methods
    void setId(int bId){
        book_id = bId;
    }
    void setTitle(String title){
        book_title = title;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setPublication_year(int publication_year){
        this.publication_year = publication_year;
    }
    
    void setCopies(int available_copies){
        this.available_copies = available_copies;
    }


}