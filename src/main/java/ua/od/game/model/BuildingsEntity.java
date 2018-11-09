package ua.od.game.model;

public class BuildingsEntity {
    private Integer id;
    private String name;
    private String description;
    private Float number_per_sec;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getNumber_per_sec() {
        return number_per_sec;
    }

    public void setNumber_per_sec(Float number_per_sec) {
        this.number_per_sec = number_per_sec;
    }
}
