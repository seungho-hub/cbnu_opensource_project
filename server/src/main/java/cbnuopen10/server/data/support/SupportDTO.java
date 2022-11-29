package cbnuopen10.server.data.support;

public class SupportDTO {

    private int id;
    private int supporter_id;
    private String product_name;
    private int product_id;
    private int price;

    public SupportDTO(int supporter_id, String product_name, int product_id, int price){
        this.supporter_id = supporter_id;
        this.product_name = product_name;
        this.product_id = product_id;
        this.price = price;
    }

    public SupportEntity toEntity() {
        return new SupportEntity(supporter_id, product_name, product_id, price);
    }
}
