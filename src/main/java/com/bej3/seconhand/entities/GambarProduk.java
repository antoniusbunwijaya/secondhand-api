package com.bej3.seconhand.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "gambar_produk")
public class GambarProduk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_gambar_produk")
    private Integer idGambarProduk;

    @Column(name = "nama_gambar_produk")
    private String namaGambarProduk;

    @Column(name = "type")
    private String type;

    @Lob
    @Column(name = "gambar_produk")
    private byte[] gambarProduk;



    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_produk")
    private Produk produk;

    public GambarProduk(String namaGambarProduk, String type, byte[] gambarProduk, Produk produk) {
        this.namaGambarProduk = namaGambarProduk;
        this.type = type;
        this.gambarProduk = gambarProduk;
        this.produk = produk;
    }

    public GambarProduk() {

    }


}
