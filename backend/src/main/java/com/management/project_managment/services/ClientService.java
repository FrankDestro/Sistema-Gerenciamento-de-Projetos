package com.management.project_managment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.project_managment.dto.ClientDTO;
import com.management.project_managment.entities.Client;
import com.management.project_managment.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly=true)
	public Page<ClientDTO> findAllClients(Pageable pageable){
		Page<Client> list = clientRepository.findAll(pageable);
		return list.map(x -> new ClientDTO(x));
	}
	
	

}
