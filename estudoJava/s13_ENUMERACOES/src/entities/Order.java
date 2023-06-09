package entities;

import java.util.Date;

import entities_enums.orderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private orderStatus status;

    //construtores
    public Order(Integer id, Date moment, orderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        
    }
    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public orderStatus getStatus() {
        return status;
    }
    public void setStatus(orderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }

    
    //construtor
    
}
