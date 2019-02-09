package com.ratings.validation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ratings.validation.model.User;
import com.ratings.validation.service.MetaUserService;

@RestController
public class UserController {

	@Autowired
	MetaUserService UserService;

	@RequestMapping(value = "User/getAll", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<User> getAllPosts(Pageable pageable) {

		List<User> metadata = UserService.getAll();
		if (((List<User>) metadata).isEmpty()) {
			return null;
		}
		return metadata;
	}

	@RequestMapping(value = "User/get/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })

	public User get(@PathVariable("id") String id) {
		User inc = UserService.get(id);
		if (inc == null) {
			return null;
		}
		return inc;
	}

	@RequestMapping(value = "User/save", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> create(@Valid @RequestBody User User) {
		UserService.add(User);
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}

	@RequestMapping(value = "User/update", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> update(@Valid @RequestBody User User) {
		User inc = UserService.find(User.getEmail());
		if (inc == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			UserService.update(User);
			return new ResponseEntity<Void>(HttpStatus.OK);

		}
	}

	@RequestMapping(value = "User/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> deletePost(@PathVariable("id") String id) {
		User inc = UserService.find(id);
		if (inc == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			UserService.remove(inc);
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}
}