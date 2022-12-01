package cbnuopen10.server.data.project;

import java.util.Date;

public class Project {
    private Long id;
    private String product_name;
    private String product_url;
    private int price;
    private Date start_date;
    private Date end_date;
    private Long user_id;
    private String receiver_name;
    private String receiver_hp;
    private String addr;

    public Project(String product_name, String product_url, int price, Date end_date, String receiver_name, String receiver_hp, String addr) {
        this.product_name = product_name;
        this.product_url = product_url;
        this.price = price;
        this.end_date = end_date;
        this.receiver_name = receiver_name;
        this.receiver_hp = receiver_hp;
        this.addr = addr;
    }
}
