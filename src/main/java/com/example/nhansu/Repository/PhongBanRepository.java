package com.example.nhansu.Repository;

import com.example.nhansu.Model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
    // You can define custom query methods here if needed
}
