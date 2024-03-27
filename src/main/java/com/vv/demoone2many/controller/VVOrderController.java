package com.vv.demoone2many.controller;

import com.vv.demoone2many.entity.VVItem;
import com.vv.demoone2many.entity.VVOrder;
import com.vv.demoone2many.repository.VVOrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/v1" )
@RequiredArgsConstructor
@Data
public class VVOrderController {

    private final VVOrderRepository vvOrderRepository;

    @GetMapping( "/orders" )
    public List<VVOrder> getOrders() {

        vvOrderRepository.save( VVOrder.builder()
                                       .name( "sport goods" )
                                       .items( List.of(
                                               VVItem.builder()
                                                     .name( "Blue T shirt" )
                                                     .build(),
                                               VVItem.builder()
                                                     .name( "Red cap" )
                                                     .build()
                                                      ) )
                                       .build() );


        return vvOrderRepository.findAll();
    }
}
