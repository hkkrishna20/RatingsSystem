package com.ratings.validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratings.validation.model.Role;
import com.ratings.validation.repository.RoleRepository;


@Service
public class DefaultMetaRoleService implements MetaRoleService {


	@Autowired
	RoleRepository metadataDocumentRepository;
	

	@Override
	public void add(Role entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.save(entity);
	}

	@Override
	public void saveOrUpdate(Role entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.save(entity);
	}

	@Override
	public void update(Role entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.save(entity);
	}

	@Override
	public void remove(Role entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.delete(entity);
	}


	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return (List<Role>) metadataDocumentRepository.findAll();
	}
	public Role find(String key) {
		// TODO Auto-generated method stub
		return metadataDocumentRepository.findById(key).get();
	}

	public Role getById(String id) {
		// TODO Auto-generated method stub
		return metadataDocumentRepository.findById(id).get();
	}

	public Role get(String id) {
		// TODO Auto-generated method stub
		return metadataDocumentRepository.findById(id).get();
		}

}
