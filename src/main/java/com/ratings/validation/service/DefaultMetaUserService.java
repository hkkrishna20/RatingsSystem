package com.ratings.validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratings.validation.model.User;
import com.ratings.validation.repository.UserRepository;


@Service
public class DefaultMetaUserService implements MetaUserService {


	@Autowired
	UserRepository metadataDocumentRepository;
	

	@Override
	public void add(User entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.save(entity);
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.save(entity);
	}

	@Override
	public void remove(User entity) {
		// TODO Auto-generated method stub
		metadataDocumentRepository.delete(entity);
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return (List<User>) metadataDocumentRepository.findAll();
	}
	@Override
	public User find(String key) {
		// TODO Auto-generated method stub
		return metadataDocumentRepository.findById(key).get();
	}

	@Override
	public User getById(String id) {
		// TODO Auto-generated method stub
		return metadataDocumentRepository.findById(id).get();
	}

	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return metadataDocumentRepository.findById(id).get();
		}

}
