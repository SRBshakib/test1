package mainpkg;


import java.time.LocalDate;


public class MD_Schedule_Scene_Model {
    String name;
    String time;
    LocalDate date;

    public MD_Schedule_Scene_Model(String name, String time, LocalDate date) {
        this.name = name;
        this.time = time;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
           
    
}
