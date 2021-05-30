package pojo;

import java.util.Objects;

public class Fridge  implements Comparable<Fridge> {
    private long id;
    private String name;
    private String mark;
    private double price;
    private String color;
    private double score;

    public Fridge(long id, String name, String mark, double price, String color, double score) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.color = color;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getScore() {
        return score;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fridge fridge = (Fridge) o;
        return id == fridge.id && name.equals(fridge.name) && mark.equals(fridge.mark) && price==fridge.price && color.equals(fridge.color) && score==fridge.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mark, price, color, score);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    @Override
    public int compareTo(Fridge o) {
     int result = this.name.compareTo(o.getName());
     if(result==0){

     }
     return result;
    }
}
