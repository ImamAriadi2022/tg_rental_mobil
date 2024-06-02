package Model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class rent {
    private int ID;
    private user user;
    private car car;
    private LocalDateTime dateTime;
    private int hours;
    private double total;
    private String status;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-mm  hh:mm");


    public rent(){
        dateTime = LocalDateTime.now();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public car getCar() {
        return car;
    }

    public void setCar(car car) {
        this.car = car;
    }

    public String getDateTime() {
        return formatter.format(dateTime);
    }

    public void setDateTime(String dateTimeString){
        this.dateTime = LocalDateTime.parse(dateTimeString, formatter);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }


}