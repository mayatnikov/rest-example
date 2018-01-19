package ru.mvn.domain;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class Human {
    List<Address> addresses;
    int age;
    List <Document> documents;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
