package ua.kpi.tef.ideashop.entity;

import javax.persistence.*;

@Entity
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String title;

    public Good() {
    }

    public Good(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Good)) return false;

        Good good = (Good) o;

        return (getId() != null ? getId().equals(good.getId()) : good.getId() == null) && (getTitle() != null ? getTitle().equals(good.getTitle()) : good.getTitle() == null);
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        return result;
    }
}
