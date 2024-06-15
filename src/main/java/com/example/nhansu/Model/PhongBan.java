package com.example.nhansu.Model;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phongban")
public class PhongBan {
    @Id
    @Column(name = "ma_phong", length = 2, nullable = false)
    private String maPhong;
    @Column(name = "ten_phong", length = 30, nullable = false)
    @Autowired
    private String tenPhong;
}
