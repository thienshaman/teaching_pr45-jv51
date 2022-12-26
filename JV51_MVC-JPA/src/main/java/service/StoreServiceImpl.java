package service;

import entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StoreRepository;

import java.util.List;

@Service(value = "storeService")
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreRepository storeRepository;
    @Override
    public List<Store> getAllStores() {
        return (List<Store>) storeRepository.findAll();
    }
}
