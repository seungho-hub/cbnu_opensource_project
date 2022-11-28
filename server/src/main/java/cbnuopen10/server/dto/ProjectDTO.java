package cbnuopen10.server.dto;

import cbnuopen10.server.entity.ProjectEntity;

public class ProjectDTO {
    private String product_name;
    private String product_url;
    private int price;
    private String receiver_name;
    private String receiver_hp;
    private String addr;

    public ProjectDTO(String product_name, String product_url, int price, String receiver_name, String receiver_hp, String addr) {
        this.product_name = product_name;
        this.product_url = product_url;
        this.price = price;
        this.receiver_name = receiver_name;
        this.receiver_hp = receiver_hp;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "product_name='" + product_name + '\'' +
                ", product_url='" + product_url + '\'' +
                ", price='" + price + '\'' +
                ", reciever_name='" + receiver_name + '\'' +
                ", reciever_hp='" + receiver_hp + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public ProjectEntity toEntity() {
        return new ProjectEntity(product_name, product_url, price, receiver_name, receiver_hp, addr);
    }

}
