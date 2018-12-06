package java8.Database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "Sinhvien")
public class Sinhvien {

    @Id
    Integer id;

    @JoinTable(name = "DiaChi")
    DiaChi diaChi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    @Entity
    @Table(name = "DiaChi")
    public class DiaChi {
        String dc;

    }

}
