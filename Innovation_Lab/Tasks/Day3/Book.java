package Innovation_Lab.Tasks.Day3;

public class Book {
    String title;
    String author;
    
    public Book(){
        this.title="Java Programming";
        this.author="James Gosling";
    }

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void display(){
        System.out.println(this.title+"\t"+this.author);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python","Guido Van Rossum");
        Book b3 = new Book();

        b1.display();
        b2.display();
        b3.display();
    }


}