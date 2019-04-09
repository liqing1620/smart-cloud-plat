package base;

import core.Enable;
import core.Time;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity extends ID implements Time, Enable {

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    protected boolean enabled = true;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public BaseEntity setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public Date getCreateAt() {
        return createAt;
    }

    public BaseEntity setCreateAt(Date createAt) {
        this.createAt = createAt;
        return this;
    }

    @Override
    public Date getUpdateAt() {
        return updateAt;
    }

    public BaseEntity setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
        return this;
    }
}
