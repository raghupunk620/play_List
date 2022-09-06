public class Songs {

    private String title ;
    private double duration ;

    public Songs(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String toString(){
        return this.title + ": " + this.duration ;
    }
}

