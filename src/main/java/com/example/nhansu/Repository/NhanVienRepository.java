package com.example.nhansu.Repository;

import com.example.nhansu.Model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    // You can define custom query methods here if needed
}