package com.example.on_luyen_1;

public class DanhSachDTO {
    int id;
    String name;
    String clas;

    public DanhSachDTO() {
    }

    public DanhSachDTO(int id, String name, String clas) {
        this.id = id;
        this.name = name;
        this.clas = clas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
