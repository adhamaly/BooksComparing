package BooksComparing;


public class Book implements Comparable<Book>{
    
    
    private int numberOfPages;
    private String AuthorName;
    private String title;


    public Book(){

    }

    public void setNumberOfPages(int num){
        this.numberOfPages = num;
    }
    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public void setAuthorName(String name){
        this.AuthorName = name;
    }
    public String getAuthorName(){
        return this.AuthorName;
    }
    public void setTtile(String _title){
        this.title = _title;
    }
    public String getTitle(){
        return this.title;
    }



    @Override
    public int compareTo(Book speciBook) {

        if(this.getNumberOfPages() != speciBook.getNumberOfPages()){
            return this.getNumberOfPages() - speciBook.getNumberOfPages();
        }
        else if(!(this.getTitle().equals(speciBook.getTitle()))){

            return this.getTitle().compareTo(speciBook.getTitle());
        }

        return this.getAuthorName().compareTo(speciBook.getAuthorName());
        
        
    }
    
}
