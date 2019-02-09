package com.ratings.validation.service;

import com.ratings.validation.model.Role;

public interface RoleService extends GenericService<Role,String> {

	Role find(int id);

}