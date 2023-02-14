public class BookRelationship {
    private String nameOfChapter;
    private int numberOfPages;
    private String Summary;

    public void setNameOfChapter (String nameOfChapter){
        this.nameOfChapter = nameOfChapter;
    }

    public void setNumberOfPages ( int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public void setSummary (String summary){
        Summary = summary;
    }

    public static void main(String args[]) {

        BookRelationship book = new BookRelationship();
        book.setNameOfChapter("abc");
        book.setNumberOfPages(12);
        book.setSummary("xyz");

        book.bookInfo();
        Textbook textbook = new Textbook();
        textbook.FirstBook();
        }

        void bookInfo() {
            System.out.println("Initial Chapter name  ");
        }

    }


class Textbook extends BookRelationship{
    public void FirstBook()
    {
        Contents contents = new Contents();
        contents.chapterName();
        contents.pageNumber();
    }
}

/*class Novel extends Book{
    Contents content = new Contents();
    content.chapterName();
    content.pageNumber();

    Summary summary = new Summary();
    summary.summaryGathered();

}

class Comic extends Book{
    Contents content = new Contents();
    content.chapterName();
    content.pageNumber();

    Summary summary = new Summary();
    summary.summaryGathered();

}*/

class Contents{
    public void chapterName(){
      System.out.println("The contents of this book ");
    }
    public void pageNumber(){
      System.out.println("Total number of pages in this book ");
    }
}

/*class Summary{
    public void summaryGathered(){
        System.out.println("The summary of this book");
    }*/


