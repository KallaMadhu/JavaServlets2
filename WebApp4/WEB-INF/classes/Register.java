public class Register {
    private String email;
    private String pwd;
    private String fullname;
    private String phone;
    public Register(){
        super();
    }
    public Register(String email,String pwd,String fullname,String phone){
        this.email=email;
        this.pwd=pwd;
        this.fullname=fullname;
        this.phone=phone;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public void setPwd(String pwd){
        this.pwd=pwd;
    }
    public String getPwd(){
        return pwd;
    }

    public void setFullname(String fullname){
        this.fullname=fullname;
    }
    public String getFullname(){
        return fullname;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
}
