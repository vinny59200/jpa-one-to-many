package com.vv.demoone2many.repository;

import com.vv.demoone2many.entity.VVOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VVOrderRepository extends JpaRepository<VVOrder,Long> {
}
