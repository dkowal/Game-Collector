//package pl.dkowal.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import pl.dkowal.domain.Product;
//import pl.dkowal.domain.repository.GameRepository;
//import pl.dkowal.service.OrderService;
//
//@Service
//public class OrderServiceImpl implements OrderService{
//
//	@Autowired
//	private GameRepository gameRepository;
//
//	public void processOrder(String productId, long quantity) {
//		Product productById = gameRepository.getProductById(productId);
//
//		if(productById.getUnitsInStock() < quantity){
//			throw new IllegalArgumentException("Zbyt ma�o towaru. Obecna liczba sztuk w magazynie "+ productById.getUnitsInStock());
//		}
//
//		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
//	}
//}
