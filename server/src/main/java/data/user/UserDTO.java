package data;

import org.apache.ibatis.type.Alias;

@Alias("userDTO")
public class UserDTO {

    private String user_id;
    private String access_key;
    private String refresh_token;
    private String user_name;
    private String user_hp;
    private String billingkey;


    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getAccess_key() {
        return access_key;
    }
    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }
    public String getRefresh_token() {
        return refresh_token;
    }
    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_hp() {
        return user_hp;
    }
    public void setUser_hp(String user_hp) {
        this.user_hp = user_hp;
    }
    public String getBillingkey() {
        return billingkey;
    }
    public void setBillingkey(String billingkey) {
        this.billingkey = billingkey;
    }
}