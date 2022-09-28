package assignment4;

public class News implements INews{

    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;
    public int[] rateList ;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        rateList = new int[3];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    public void setRateList(int[] rateList) {
        this.rateList = rateList;
    }

    @Override
    public void Display() {
    System.out.println(getTitle());
    System.out.println(getPublishDate());
    System.out.println(getAuthor());
    System.out.println(getContent());
    System.out.println(getAverageRate());
    }

    public void Calculate(){
        int c = 0;
     for(int r : rateList)  {
         c+=r;
     }
     this.averageRate = c/3;
    }
}
