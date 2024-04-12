package dataanalysisServer.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName dataanalysis
 */
@TableName(value ="dataanalysis")
@Data
public class Dataanalysis implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String table;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Date time;

    /**
     * 
     */
    private String region;

    /**
     * 
     */
    private BigDecimal yesterday;

    /**
     * 
     */
    private BigDecimal today;

    /**
     * 
     */
    private BigDecimal daycontrast;

    /**
     * 
     */
    private BigDecimal monthcontrast;

    /**
     * 
     */
    private BigDecimal yearcontrast;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Dataanalysis other = (Dataanalysis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTable() == null ? other.getTable() == null : this.getTable().equals(other.getTable()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getYesterday() == null ? other.getYesterday() == null : this.getYesterday().equals(other.getYesterday()))
            && (this.getToday() == null ? other.getToday() == null : this.getToday().equals(other.getToday()))
            && (this.getDaycontrast() == null ? other.getDaycontrast() == null : this.getDaycontrast().equals(other.getDaycontrast()))
            && (this.getMonthcontrast() == null ? other.getMonthcontrast() == null : this.getMonthcontrast().equals(other.getMonthcontrast()))
            && (this.getYearcontrast() == null ? other.getYearcontrast() == null : this.getYearcontrast().equals(other.getYearcontrast()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTable() == null) ? 0 : getTable().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getYesterday() == null) ? 0 : getYesterday().hashCode());
        result = prime * result + ((getToday() == null) ? 0 : getToday().hashCode());
        result = prime * result + ((getDaycontrast() == null) ? 0 : getDaycontrast().hashCode());
        result = prime * result + ((getMonthcontrast() == null) ? 0 : getMonthcontrast().hashCode());
        result = prime * result + ((getYearcontrast() == null) ? 0 : getYearcontrast().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", table=").append(table);
        sb.append(", name=").append(name);
        sb.append(", time=").append(time);
        sb.append(", region=").append(region);
        sb.append(", yesterday=").append(yesterday);
        sb.append(", today=").append(today);
        sb.append(", daycontrast=").append(daycontrast);
        sb.append(", monthcontrast=").append(monthcontrast);
        sb.append(", yearcontrast=").append(yearcontrast);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}