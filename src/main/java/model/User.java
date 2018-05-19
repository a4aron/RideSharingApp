package model;


public class User {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name;
    private String birthday;
    private String address;
    private String telNum;
    private String userName;
    private String passWord;
    private String type;

    public User(String id, String name, String birthday, String address, String telNum, String userName, String passWord, String type) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.telNum = telNum;
        this.userName = userName;
        this.passWord = passWord;
        this.type = type;
    }



}
