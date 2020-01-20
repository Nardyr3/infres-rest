package infresrest.infresrest.model;


import java.time.LocalDateTime;
import java.util.Date;

public class Vol {

    private int id;
    private int place;

    public LocalDateTime getDate() {
        return date;
    }

    private LocalDateTime date;

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    private Company company;

    public Vol(int id, int place, LocalDateTime date, Company company) {
        this.id = id;
        this.place = place;
        this.date = date;
        this.company = company;
    }

    public Vol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

}

