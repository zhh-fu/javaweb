package newcom.ssm.pojo;

public class Role {
    private int id;
    private String roleName;
    private String note;
    public Role(int id,String roleName,String note){
        this.id=id;
        this.roleName=roleName;
        this.note=note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}

