package mode.generic;

/**
 * Created by gcb on 2018/12/19.
 */
public class User {
    private  String name;
    private  int age;
    private String phone;
    /**
     * true man ，false woman
     */
    private boolean sex ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(String str) {
        if("男".equals(str)){
            this.sex = true;
        }else {
            this.sex = false;
        }

    }
}
