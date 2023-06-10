package org.binar.kamihikoukiairlines.service;

import org.binar.kamihikoukiairlines.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteService {
    @Autowired
    RouteRepository routeRepository;



}
