package com.kfit.demo.bean;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 测试demo类.
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@Data
@Entity
public class Demo {
    @Id @GeneratedValue
    private long id;
    private String name;
    @Override
    public String toString() {
        return"Demo [id=" + id + ", name=" + name + "]";
    }
}
