package org.example.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mmschools")
public class school {
    @Value("人民大学")
    private String name;
    @Value("北京朝阳")
    private String address;

    @Override
    public String toString() {
        return "school{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
