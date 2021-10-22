package com.example.raihan_crud_customer.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Nama;
    private String Tanggal_Lahir;
    private String PhoneNumber;
    private String KtpNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getTanggal_Lahir() {
        return Tanggal_Lahir;
    }

    public void setTanggal_Lahir(String tanggal_Lahir) {
        Tanggal_Lahir = tanggal_Lahir;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getKtpNumber() {
        return KtpNumber;
    }

    public void setKtpNumber(String ktpNumber) {
        KtpNumber = ktpNumber;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", Nama='" + Nama + '\'' +
                ", Tanggal_Lahir='" + Tanggal_Lahir + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", KtpNumber='" + KtpNumber + '\'' +
                '}';
    }
}
