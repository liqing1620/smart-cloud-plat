package base;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class ID implements Serializable {
    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -516114227595898053L;

    private String id;

    @javax.persistence.Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @Column(unique = true,nullable = false,updatable = false,length = 32)
    public String getId() {
        return id;
    }

    public ID setId(String id) {
        this.id = id;
        return this;
    }
}
