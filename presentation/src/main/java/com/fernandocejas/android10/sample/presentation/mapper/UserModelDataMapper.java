/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package com.fernandocejas.android10.sample.presentation.mapper;

import com.fernandocejas.android10.sample.domain.User;
import com.fernandocejas.android10.sample.presentation.model.UserModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Mapper class used to transform {@link User} (in the domain layer) to {@link UserModel} in the
 * presentation layer.
 */
public class UserModelDataMapper {

  public UserModelDataMapper() {
    //empty
  }

  /**
   * Transform a {@link User} into an {@link UserModel}.
   * @param user Object to be transformed.
   * @return {@link UserModel}.
   */
  public UserModel transform(User user) {
    if (user == null) {
      throw new IllegalArgumentException("Cannot transform a null value");
    }
    UserModel userModel = new UserModel();

    //TODO: transform stuff here

    return userModel;
  }

  /**
   * Transform a Collection of {@link User} into a Collection of {@link UserModel}.
   * @param usersCollection Objects to be transformed.
   * @return List of {@link UserModel}.
   */
  public Collection<UserModel> transform(Collection<User> usersCollection) {
    Collection<UserModel> userModelsCollection;

    if (usersCollection != null && !usersCollection.isEmpty()) {
      userModelsCollection = new ArrayList<UserModel>();
      for (User user : usersCollection) {
        userModelsCollection.add(transform(user));
      }
    } else {
      userModelsCollection = Collections.emptyList();
    }

    return Collections.unmodifiableCollection(userModelsCollection);
  }
}