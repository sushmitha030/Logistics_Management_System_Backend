package com.liveasy.app.api.service;

import com.liveasy.app.api.model.Logistics;

import java.util.List;
import java.util.Optional;

/**
 * This is the interface for the LogisticsService which will have the template for the methods which will be overrided
 * in the implementation of the Logistic Service.
 */
public interface LogisticsService {
    void addLoad(Logistics logistics);

    List<Logistics> getLoadsByShipperId(String shipperId);

    List<Logistics> getAllLoads();

    Optional<Logistics> getLoadById(Long loadId);

    void updateLoad(Long loadId, Logistics updatedLogistics);

    void deleteLoad(Long loadId);
}
