package com.demo.controller;

import com.demo.model.Stock;
import com.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "StockService")
@Service
public class StockWebService {
    @Autowired
    private StockService stockService;

    @WebMethod
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @WebMethod
    public Stock getStockById(Long id) {
        return stockService.getStockById(id);
    }

    @WebMethod
    public Stock saveStock(Stock stock) {
        return stockService.saveStock(stock);
    }

    @WebMethod
    public void deleteStock(Long id) {
        stockService.deleteStock(id);
    }
}
